package black14.artifact.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/startseite")
    public String home(Model model) {
        model.addAttribute("message", "Hier Startseite implementieren");
        return "index"; // Verweist auf "src/main/resources/templates/index.html"
    }

    @GetMapping("/produkte")
    public String apps(Model model) {
        model.addAttribute("message", "Übersicht der Produkte");
        return "produkte"; // Verweist auf "src/main/resources/templates/apps.html"
    }

    @GetMapping("/produktekategorien")
    public String emptyUrl(Model model) {
        model.addAttribute("message", "Übersicht der Produktkategorien");
        return "produktkategorien"; // Verweist auf "src/main/resources/templates/apps.html"
    }

    @GetMapping("/profilseite")
    public String links(Model model) {
        model.addAttribute("message", "Hier Profilseite implementieren");
        return "profilseite"; // Verweist auf "src/main/resources/templates/apps.html"
    }
}
