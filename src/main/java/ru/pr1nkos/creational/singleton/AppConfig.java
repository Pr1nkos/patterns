package ru.pr1nkos.creational.singleton;

import lombok.Synchronized;

import java.io.FileInputStream;
import java.util.Properties;

public class AppConfig {
    private static AppConfig instance;
    private Properties properties;

    private AppConfig() {
        properties = new Properties();
        try (FileInputStream fileInputStream = new FileInputStream("src/main/resources/config.properties")) {
            properties.load(fileInputStream);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Synchronized
    public static AppConfig getInstance() {
        if (instance != null) {
            return instance;
        }
        instance = new AppConfig();
        return instance;
    }

    public String getProperty(String key) {
        return properties.getProperty(key);
    }
}
