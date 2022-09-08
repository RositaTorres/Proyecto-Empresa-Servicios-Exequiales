package servicios.exequiales.ingresosyegresos.ingresos_egresos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.logging.Level;
import java.util.logging.Logger;

@Controller
public class IndexController {

    private final Logger LOG = Logger.getLogger(""+IndexController.class);

    @GetMapping("/")
    public String index(Model model){
        LOG.log(Level.INFO,)
        System.out.println(IndexController.class + "- index");
        var mensaje= "Hola desde IndexController";
        model.addAttribute("mensaje", mensaje);
        return "index";

    }
}
