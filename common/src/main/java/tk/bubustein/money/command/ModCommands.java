package tk.bubustein.money.command;

import com.mojang.brigadier.Command;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.DoubleArgumentType;
import com.mojang.brigadier.arguments.StringArgumentType;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.Commands;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import tk.bubustein.money.item.CardItem;
import tk.bubustein.money.item.ModItems;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;
import java.util.UUID;

public class ModCommands {
    private static final TreeMap<Double, Item> CURRENCY_ITEMS = new TreeMap<>(Comparator.reverseOrder());

    static {
        CURRENCY_ITEMS.put(500.0, ModItems.Euro500.get());
        CURRENCY_ITEMS.put(200.0, ModItems.Euro200.get());
        CURRENCY_ITEMS.put(100.0, ModItems.Euro100.get());
        CURRENCY_ITEMS.put(50.0, ModItems.Euro50.get());
        CURRENCY_ITEMS.put(20.0, ModItems.Euro20.get());
        CURRENCY_ITEMS.put(10.0, ModItems.Euro10.get());
        CURRENCY_ITEMS.put(5.0, ModItems.Euro5.get());
        CURRENCY_ITEMS.put(2.0, ModItems.Euro2.get());
        CURRENCY_ITEMS.put(1.0, ModItems.Euro1.get());
        CURRENCY_ITEMS.put(0.5, ModItems.Ecent50.get());
        CURRENCY_ITEMS.put(0.2, ModItems.Ecent20.get());
        CURRENCY_ITEMS.put(0.1, ModItems.Ecent10.get());
        CURRENCY_ITEMS.put(0.05, ModItems.Ecent5.get());
        CURRENCY_ITEMS.put(0.02, ModItems.Ecent2.get());
        CURRENCY_ITEMS.put(0.01, ModItems.Ecent1.get());
    }

    public static void register(CommandDispatcher<CommandSourceStack> dispatcher) {
        dispatcher.register(Commands.literal("bubustein")
                .then(Commands.literal("ecoAddMoney")
                        .then(Commands.argument("amount", DoubleArgumentType.doubleArg(0))
                                .executes(context -> {
                                    Player player = context.getSource().getPlayerOrException();
                                    ItemStack stack = player.getMainHandItem();

                                    if (stack.getItem() instanceof CardItem) {
                                        double amount = DoubleArgumentType.getDouble(context, "amount");
                                        ((CardItem) stack.getItem()).addMoney(stack, amount);
                                        player.sendSystemMessage(Component.literal("Ai adăugat " + formatMoney(amount) + " bani în card."));
                                    } else {
                                        player.sendSystemMessage(Component.literal("Trebuie să ții un card în mână."));
                                    }
                                    return Command.SINGLE_SUCCESS;
                                })))
                .then(Commands.literal("ecoSetMoney")
                        .then(Commands.argument("amount", DoubleArgumentType.doubleArg(0))
                                .executes(context -> {
                                    Player player = context.getSource().getPlayerOrException();
                                    ItemStack stack = player.getMainHandItem();

                                    if (stack.getItem() instanceof CardItem) {
                                        double amount = DoubleArgumentType.getDouble(context, "amount");
                                        ((CardItem) stack.getItem()).setMoney(stack, amount);
                                        player.sendSystemMessage(Component.literal("Ai setat suma la " + formatMoney(amount) + " bani pe card."));
                                    } else {
                                        player.sendSystemMessage(Component.literal("Trebuie să ții un card în mână."));
                                    }
                                    return Command.SINGLE_SUCCESS;
                                })))
                .then(Commands.literal("resetMoney")
                        .executes(context -> {
                            Player player = context.getSource().getPlayerOrException();
                            ItemStack stack = player.getMainHandItem();

                            if (stack.getItem() instanceof CardItem) {
                                ((CardItem) stack.getItem()).setMoney(stack, 0);
                                player.sendSystemMessage(Component.literal("Ai resetat suma pe card la 0."));
                            } else {
                                player.sendSystemMessage(Component.literal("Trebuie să ții un card în mână."));
                            }
                            return Command.SINGLE_SUCCESS;
                        }))
                .then(Commands.literal("pay")
                        .then(Commands.argument("player", StringArgumentType.word())
                                .then(Commands.argument("amount", DoubleArgumentType.doubleArg(0))
                                        .executes(context -> {
                                            Player player = context.getSource().getPlayerOrException();
                                            ItemStack stack = player.getMainHandItem();
                                            String targetPlayerName = StringArgumentType.getString(context, "player");
                                            double amount = DoubleArgumentType.getDouble(context, "amount");

                                            if (stack.getItem() instanceof CardItem) {
                                                if (amount <= 0) {
                                                    player.sendSystemMessage(Component.literal("Suma trebuie să fie mai mare decât 0."));
                                                    return Command.SINGLE_SUCCESS;
                                                }

                                                // Obține jucătorul țintă
                                                ServerPlayer targetPlayer = context.getSource().getServer().getPlayerList().getPlayer(UUID.fromString(targetPlayerName));
                                                if (targetPlayer == null) {
                                                    player.sendSystemMessage(Component.literal("Jucătorul " + targetPlayerName + " nu este online."));
                                                    return Command.SINGLE_SUCCESS;
                                                }

                                                // Verifică dacă jucătorul țintă are un card în inventar
                                                boolean hasCard = false;
                                                for (ItemStack itemStack : targetPlayer.getInventory().items) {
                                                    if (itemStack.getItem() instanceof CardItem) {
                                                        hasCard = true;
                                                        break;
                                                    }
                                                }

                                                if (!hasCard) {
                                                    player.sendSystemMessage(Component.literal("Jucătorul " + targetPlayerName + " nu are un card în inventar."));
                                                    return Command.SINGLE_SUCCESS;
                                                }

                                                // Verifică dacă jucătorul are suficienți bani
                                                double existingMoney = ((CardItem) stack.getItem()).getMoney(stack);
                                                if (existingMoney < amount) {
                                                    player.sendSystemMessage(Component.literal("Nu ai suficienți bani pe card."));
                                                    return Command.SINGLE_SUCCESS;
                                                }

                                                // Transferă banii
                                                ((CardItem) stack.getItem()).setMoney(stack, existingMoney - amount);
                                                // Adaugă banii jucătorului țintă la cardul său (presupunând că are un card în mână)
                                                for (ItemStack itemStack : targetPlayer.getInventory().items) {
                                                    if (itemStack.getItem() instanceof CardItem) {
                                                        ((CardItem) itemStack.getItem()).addMoney(itemStack, amount);
                                                        break; // Oprire după ce a găsit primul card
                                                    }
                                                }

                                                player.sendSystemMessage(Component.literal("Ai transferat " + formatMoney(amount) + " către " + targetPlayerName + "."));
                                                targetPlayer.sendSystemMessage(Component.literal("Ai primit " + formatMoney(amount) + " de la " + player.getName() + "."));
                                            } else {
                                                player.sendSystemMessage(Component.literal("Trebuie să ții un card în mână."));
                                            }
                                            return Command.SINGLE_SUCCESS;
                                        }))))
                .then(Commands.literal("defaultCurrency")
                        .executes(context -> {
                            Player player = context.getSource().getPlayerOrException();
                            player.sendSystemMessage(Component.literal("Valuta cardului este Euro (EUR)"));
                            return Command.SINGLE_SUCCESS;
                        }))
                .then(Commands.literal("deposit")
                        .then(Commands.argument("amount", DoubleArgumentType.doubleArg(0))
                                .executes(context -> {
                                    Player player = context.getSource().getPlayerOrException();
                                    ItemStack stack = player.getMainHandItem();
                                    double amountToDeposit = DoubleArgumentType.getDouble(context, "amount");

                                    if (stack.getItem() instanceof CardItem) {
                                        double remainingToDeposit = amountToDeposit;
                                        double totalDeposited = 0;

                                        for (ItemStack itemStack : player.getInventory().items) {
                                            if (remainingToDeposit <= 0) break;
                                            if (itemStack.isEmpty()) continue;

                                            Item item = itemStack.getItem();
                                            int count = itemStack.getCount();
                                            double itemValue = getItemValue(item);

                                            if (itemValue > 0) {
                                                int itemsToRemove = Math.min(count, (int) (remainingToDeposit / itemValue));
                                                double amountRemoved = itemsToRemove * itemValue;

                                                itemStack.shrink(itemsToRemove);
                                                remainingToDeposit -= amountRemoved;
                                                totalDeposited += amountRemoved;
                                            }
                                        }

                                        if (totalDeposited > 0) {
                                            ((CardItem) stack.getItem()).addMoney(stack, totalDeposited);
                                            player.sendSystemMessage(Component.literal("Ai depus " + formatMoney(totalDeposited) + " în card."));
                                        } else {
                                            player.sendSystemMessage(Component.literal("Nu ai suficiente bancnote sau monede pentru a depune suma specificată."));
                                        }
                                    } else {
                                        player.sendSystemMessage(Component.literal("Trebuie să ții un card în mână."));
                                    }
                                    return Command.SINGLE_SUCCESS;
                                })))
                .then(Commands.literal("withdraw")
                        .then(Commands.argument("amount", DoubleArgumentType.doubleArg(0))
                                .executes(context -> {
                                    Player player = context.getSource().getPlayerOrException();
                                    ItemStack stack = player.getMainHandItem();
                                    double amountToWithdraw = DoubleArgumentType.getDouble(context, "amount");
                                    if (stack.getItem() instanceof CardItem cardItem) {
                                        double currentBalance = cardItem.getMoney(stack);
                                        double fee = calculateWithdrawFee(stack, amountToWithdraw);
                                        double totalWithdraw = amountToWithdraw + fee;

                                        if (currentBalance >= totalWithdraw) {
                                            cardItem.setMoney(stack, currentBalance - totalWithdraw);
                                            giveMoneyToPlayer(player, amountToWithdraw, stack.getItem() == ModItems.VisaSteel.get());
                                            player.sendSystemMessage(Component.literal(String.format("Ai retras %s bani. Taxa de retragere: %s", formatMoney(amountToWithdraw), formatMoney(fee))));
                                        } else {
                                            player.sendSystemMessage(Component.literal("Nu ai suficiente fonduri pentru această retragere."));
                                        }
                                    } else {
                                        player.sendSystemMessage(Component.literal("Trebuie să ții un card în mână."));
                                    }
                                    return Command.SINGLE_SUCCESS;
                                })))
        );
    }
    private static double calculateWithdrawFee(ItemStack stack, double amount) {
        if (stack.getItem() == ModItems.VisaClassic.get()) {
            return amount * 0.03; // 3% fee
        } else if (stack.getItem() == ModItems.VisaGold.get()) {
            return amount * 0.02; // 2% fee
        } else if (stack.getItem() == ModItems.VisaSteel.get()) {
            return 0.005; // 0.5% fee
        }
        return 0; // Default case, no fee
    }

    private static void giveMoneyToPlayer(Player player, double amount, boolean isVisaSteel) {
        double remainingAmount = amount;
        for (Double denomination : CURRENCY_ITEMS.keySet()) {
            Item currencyItem = CURRENCY_ITEMS.get(denomination);
            while (remainingAmount >= denomination || (isVisaSteel && remainingAmount == denomination)) {
                player.getInventory().add(new ItemStack(currencyItem));
                remainingAmount -= denomination;
                remainingAmount = Math.round(remainingAmount * 100.0) / 100.0; // Rotunjire la 2 zecimale
            }
            if (remainingAmount == 0) break;
        }
        if (remainingAmount > 0) {
            player.sendSystemMessage(Component.literal(String.format("Nu s-a putut returna suma exactă. Diferența: %.2f", remainingAmount)));
        }
    }
    private static String formatMoney(double amount) {
        if (Math.floor(amount) == amount) {
            return String.format("%.0f", amount); // Fără zecimale
        } else {
            return String.format("%.2f", amount); // Cu 2 zecimale
        }
    }

    private static double getItemValue(Item item) {
        return CURRENCY_ITEMS.entrySet()
                .stream()
                .filter(entry -> entry.getValue() == item)
                .mapToDouble(Map.Entry::getKey)
                .findFirst()
                .orElse(0.0);
    }
}
