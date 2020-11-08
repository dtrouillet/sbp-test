package fr.trouillet.devportal;

import api.extension.IPluginRegister;
import org.pf4j.PluginManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

import java.util.List;

@Configuration
public class PluginsConfiguration {
    @Lazy
    @Autowired
    private PluginManager pluginManager;

    @Bean
    public List<IPluginRegister> fruitsComponent() {
        return pluginManager.getExtensions(IPluginRegister.class);
    }
}
