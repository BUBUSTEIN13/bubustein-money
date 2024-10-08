package tk.bubustein.money.config;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import net.minecraft.server.MinecraftServer;
import net.minecraft.world.level.storage.LevelResource;
import tk.bubustein.money.MoneyMod;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;

public class ModConfig {
    private static final String CONFIG_FILE_NAME = "bubusteinmoneymod-config.json";
    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();
    private String defaultCurrency = "EUR";
    private static ModConfig instance;
    private ModConfig() {}
    public static ModConfig getInstance() {
        if (instance == null) {
            instance = new ModConfig();
        }
        return instance;
    }
    public void load(MinecraftServer server) {
        Path configPath = getConfigPath(server);
        File configFile = configPath.toFile();
        if (configFile.exists()) {
            try (FileReader reader = new FileReader(configFile)) {
                ModConfig loadedConfig = GSON.fromJson(reader, ModConfig.class);
                this.defaultCurrency = loadedConfig.defaultCurrency;
            } catch (IOException e) {
                MoneyMod.LOGGER.error("Failed to load config file", e);
            }
        } else {
            save(server);
        }
    }
    public void save(MinecraftServer server) {
        Path configPath = getConfigPath(server);
        File configFile = configPath.toFile();
        try {
            // Ensure the parent directory exists
            File parentDir = configFile.getParentFile();
            if (!parentDir.exists()) {
                if (!parentDir.mkdirs()) {
                    throw new IOException("Failed to create directory: " + parentDir.getAbsolutePath());
                }
            }
            try (FileWriter writer = new FileWriter(configFile)) {
                GSON.toJson(this, writer);
            }
        } catch (IOException e) {
            MoneyMod.LOGGER.error("Failed to save config file", e);
        }
    }
    private static Path getConfigPath(MinecraftServer server) {
        return server.getWorldPath(new LevelResource("data")).resolve(CONFIG_FILE_NAME);
    }
    public String getDefaultCurrency() {
        return defaultCurrency;
    }
    public void setDefaultCurrency(String defaultCurrency) {
        this.defaultCurrency = defaultCurrency;
    }
}