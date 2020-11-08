package fr.trouillet.devportal;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/aplugin")
public class APluginController {

    @RequestMapping(value = "/name")
    public String name() {
        return "Musa";
    }
}
