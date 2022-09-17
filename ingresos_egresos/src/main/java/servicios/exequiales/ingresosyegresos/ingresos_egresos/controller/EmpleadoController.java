package servicios.exequiales.ingresosyegresos.ingresos_egresos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import servicios.exequiales.ingresosyegresos.ingresos_egresos.entity.Empleado;
import servicios.exequiales.ingresosyegresos.ingresos_egresos.entity.Empresa;
import servicios.exequiales.ingresosyegresos.ingresos_egresos.entity.Rol;
import servicios.exequiales.ingresosyegresos.ingresos_egresos.Service.*;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

@Controller

public class EmpleadoController {

    @Autowired
    private IEmpleadoService empleadoService;

    @Autowired
    private IRolService rolService;

    @Autowired
    private IEmpresaService empresaService;

    private final Logger LOG = Logger.getLogger("" + EmpleadoController.class);

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
        List<Empresa> empresas = empresaService.findAll();
        modelo.addAttribute("empresas", empresas);
        return "empleados/modificar";
    }


    @PostMapping("/empleados/guardar")
    public String guardarEmpleado(Empleado empleado) {
        LOG.log(Level.INFO, "guardarEmpleado");
        empleado.setEstado(true);
        System.out.println(empleado.toString());
        empleado = empleadoService.createEmpleado(empleado);
        return "redirect:/empleados/list";
    }

    @RequestMapping(value = "/empleados/eliminar/{id}", method = RequestMethod.GET)
    public String deletEmpleado(@PathVariable("id") long id, Model modelo) {
        LOG.log(Level.INFO, "deletEmpleado");
        empleadoService.deletEmpleado(id);
        return "redirect:/empleados/list";
    }
}
