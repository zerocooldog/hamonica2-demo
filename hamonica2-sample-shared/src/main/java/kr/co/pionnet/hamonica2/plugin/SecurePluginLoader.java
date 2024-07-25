package kr.co.pionnet.hamonica2.plugin;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.List;
import java.util.ServiceLoader;

public class SecurePluginLoader {

    private static final String PLUGIN_DIR = "lib"+File.separator+"plugins";

    public static <S> List<S> loadPlugins(Class<S> service) throws IOException, SecurityException {
        List<S> plugins = new ArrayList<>();
        File dir = new File(PLUGIN_DIR);

        if (!dir.exists() || !dir.isDirectory()) {
            throw new IOException("Plugin directory not found: " + PLUGIN_DIR);
        }

        File[] jarFiles = dir.listFiles((d, name) -> name.endsWith(".jar"));

        if (jarFiles != null) {
            for (File jarFile : jarFiles) {
                try (URLClassLoader classLoader = new URLClassLoader(new URL[]{jarFile.toURI().toURL()})) {
                    ServiceLoader<S> serviceLoader = ServiceLoader.load(service, classLoader);
                    for (S plugin : serviceLoader) {
                        plugins.add(plugin);
                    }
                } catch (SecurityException se) {
                    // 보안 예외 처리
                    System.err.println("SecurityException while loading plugin: " + jarFile.getName());
                    se.printStackTrace();
                }
            }
        }

        return plugins;
    }
}