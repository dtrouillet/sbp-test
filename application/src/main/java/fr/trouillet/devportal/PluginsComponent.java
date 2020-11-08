package fr.trouillet.devportal;

import api.extension.IPluginRegister;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class PluginsComponent {

    @Lazy
    @Autowired
    private List<IPluginRegister> plugins;


    public List<String> basket() {
        List<String> basket = new ArrayList();
        if (plugins != null) {
            basket.addAll(plugins.stream().map(IPluginRegister::name).collect(Collectors.toList()));
        }
        return basket;
    }
}
