package org.d2mc.Config;

import org.bukkit.configuration.InvalidConfigurationException;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.d2mc.DestinyMC;
import org.yaml.snakeyaml.Yaml;

import java.io.File;
import java.io.IOException;

public class DMCConfig {
    private final File config;
    private final File folder;
    private FileConfiguration fileConfiguration;
    private DestinyMC destinyMC;

    public DMCConfig(DestinyMC destinyMC) {
        this.destinyMC = destinyMC;
        this.folder = new File(this.destinyMC.getPluginLoader() + "/destinymc");
        this.config = new File(this.destinyMC.getPluginLoader() + "/destinymc/config.yml");

        try{
            this.setupConfig(this.folder, this.config);
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.fileConfiguration = YamlConfiguration.loadConfiguration(this.config);
    }

    public FileConfiguration get() {
        return this.fileConfiguration;
    }

    public void save() throws IOException {
        this.fileConfiguration.save(this.config);
    }

    public void setupConfig(File folder, File config) throws IOException {
        if (!(folder.exists())) {
            folder.mkdir();
        }
        if (!(config.exists())) {
            config.createNewFile();
        }
    }

}
