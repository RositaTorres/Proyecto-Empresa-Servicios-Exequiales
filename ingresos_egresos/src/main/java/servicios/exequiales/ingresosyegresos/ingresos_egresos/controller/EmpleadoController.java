package servicios.exequiales.ingresosyegresos.ingresos_egresos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.validation.Validator;
import org.springframework.web.bind.annotation.*;
import servicios.exequiales.ingresosyegresos.ingresos_egresos.entity.Empleado;
import servicios.exequiales.ingresosyegresos.ingresos_egresos.entity.Empresa;
import servicios.exequiales.ingresosyegresos.ingresos_egresos.entity.Rol;
import servicios.exequiales.ingresosyegresos.ingresos_egresos.Service.*;
import servicios.exequiales.ingresosyegresos.ingresos_egresos.util.EncriptarPassword;

import javax.validation.Valid;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

@Controller
public class EmpleadoController  extends EncriptarPassword {

    @Autowired
    private IEmpleadoService empleadoService;

    @Autowired
    private IRolService rolService;

    @Autowired
    private IEmpresaService empresaService;

    private final Logger LOG = Logger.getLogger("" + EmpleadoController.class);
    private Validator validator;

    @GetMapping("/empleados/list")
    public String getListEmpleados(Model model) {
        LOG.log(Level.INFO, "getListEmpleados");
        List<Empleado> empleados = empleadoService.findAll();
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

    @PostMapping("/guardar")
    public String guardarEmpleado(@Valid Empleado empleado, BindingResult error, Model modelo){
        LOG.log(Level.INFO,"guardarEmpleado");
        if(empleado.getRol().getIdRol() == 0) {
            FieldError field = new FieldError("Empleado", "rol","No puede ser null");
            error.addError(field);
        }
        for(ObjectError e : error.getAllErrors())
            System.out.println(e.toString());
        if(error.hasErrors()) {
            //Roles
            List<Rol> roles = rolService.findAll();
            modelo.addAttribute("roles", roles);
            return "empleados/modificar";
        }
        empleado.setEstado(true);
        empleado.setClave(encriptarPassword(empleado.getClave()));
        empleado = empleadoService.createEmpleado(empleado);
        return "redirect:/empleados/list";
    }

    @RequestMapping(value = "/empleados/editar/{id}", method = RequestMethod.GET)
    public String editEmpleado(@PathVariable("id") long id, Model modelo) {
        LOG.log(Level.INFO, "editEmpleado");
        System.out.println(id);
        Empleado empleado = empleadoService.findById(id);
        System.out.println(empleado.toString());
        modelo.addAttribute("empleado", empleado);
        //Roles
        List<Rol> roles = rolService.findAll();
        modelo.addAttribute("roles", roles);
        return "empleados/modificar";

    }

    @RequestMapping(value = "/empleados/eliminar/{id}", method = RequestMethod.GET)
    public String deletEmpleado(@PathVariable("id") long id, Model modelo) {
        LOG.log(Level.INFO, "deletEmpleado");
        empleadoService.deletEmpleado(id);
        return "redirect:/empleados/list";
    }


}
