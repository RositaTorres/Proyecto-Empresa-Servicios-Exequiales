package servicios.exequiales.ingresosyegresos.ingresos_egresos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import servicios.exequiales.ingresosyegresos.ingresos_egresos.entity.Empleado;
import servicios.exequiales.ingresosyegresos.ingresos_egresos.entity.Rol;
import servicios.exequiales.ingresosyegresos.ingresos_egresos.Service.*;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

@Controller
@RequestMapping("/empleado")
public class EmpleadoController {

    @Autowired
    private IEmpleadoService empleadoService;

    @Autowired
    private IRolService rolService;

    private final Logger LOG = Logger.getLogger("" +EmpleadoController.class);

    @GetMapping("/empleados/list")
    public String getListEmpleados(Model model) {
        LOG.log(Level.INFO, "getListEmpleados");
        List<Empleado> empleados = empleadoService.findAll();
        for (Empleado user : empleados)
            System.out.println(user.toString());
        model.addAttribute("empleados", empleados);
        return "empleados/list";
    }

    @GetMapping("/empleados/modificar")
    public String createEmpleado(Model modelo) {
        LOG.log(Level.INFO, "createEmpleado");
        //Empleado
        Empleado empleado = new Empleado();
        modelo.addAttribute("empleado", empleado);
        //Roles
        List<Rol> roles = rolService.findAll();
        modelo.addAttribute("roles", roles);
        //Empresa
        return "empleados/modificar";
    }

    @PostMapping("/guardar")
    public String guardarEmpleado(Empleado user){
        LOG.log(Level.INFO, "guardarEmpleado");
        user.setEstado(true);
        System.out.println(user.toString());
        user = empleadoService.createEmpleado(user);
        return "redirect:/empleados/list";
    }
}
