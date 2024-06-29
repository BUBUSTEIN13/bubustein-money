package tk.bubustein.money.screen;

import com.mojang.blaze3d.systems.RenderSystem;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.ClickType;
import net.minecraft.world.inventory.Slot;
import tk.bubustein.money.MoneyMod;

@Environment(EnvType.CLIENT)
public class BankMachineScreen extends AbstractContainerScreen<BankMachineMenu> {
    private static final ResourceLocation BANK_MACHINE_LOCATION = ResourceLocation.fromNamespaceAndPath(MoneyMod.MOD_ID,"textures/container/bank_machine.png");
    private boolean widthTooNarrow;

    public BankMachineScreen(BankMachineMenu craftingMenu, Inventory inventory, Component component) {
        super(craftingMenu, inventory, component);
    }
    protected void init() {
        super.init();
        this.widthTooNarrow = this.width < 379;
        this.titleLabelX = 29;
    }

    public void containerTick() {
        super.containerTick();
    }
    public void render(GuiGraphics guiGraphics, int i, int j, float f) {
        this.renderBackground(guiGraphics, i, j, f);
        super.render(guiGraphics, i, j, f);
        this.renderTooltip(guiGraphics, i, j);
    }
    protected void renderBg(GuiGraphics guiGraphics, float f, int i, int j) {
        RenderSystem.setShader(GameRenderer::getPositionTexShader);
        RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
        RenderSystem.setShaderTexture(0, BANK_MACHINE_LOCATION);
        int k = this.leftPos;
        int l = (this.height - this.imageHeight) / 2;
        guiGraphics.blit(BANK_MACHINE_LOCATION, k, l, 0, 0, this.imageWidth, this.imageHeight);
    }
    protected boolean isHovering(int i, int j, int k, int l, double d, double e) {
        return (!this.widthTooNarrow) && super.isHovering(i, j, k, l, d, e);
    }
    protected void slotClicked(Slot slot, int i, int j, ClickType clickType) {
        super.slotClicked(slot, i, j, clickType);
    }
}