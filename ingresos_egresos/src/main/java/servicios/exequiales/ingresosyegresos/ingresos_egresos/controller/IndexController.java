package servicios.exequiales.ingresosyegresos.ingresos_egresos.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.security.core.userdetails.User;
import servicios.exequiales.ingresosyegresos.ingresos_egresos.entity.Empleado;


    import java.util.logging.Level;
import java.util.logging.Logger;

@Controller
public class IndexController {

    private final Logger LOG = Logger.getLogger(""+IndexController.class);

    @GetMapping("/")

    public String index(Model model, @AuthenticationPrincipal User user){
        LOG.log(Level.INFO, "index");
        LOG.log(Level.INFO,"empleado : "+ user);
        var mensaje = "Bienvenidos al sistema de gestión de ingresos y egresos ";
        model.addAttribute("mensaje", mensaje);
        model.addAttribute("empleado", user);
        return "index";
    }
}
