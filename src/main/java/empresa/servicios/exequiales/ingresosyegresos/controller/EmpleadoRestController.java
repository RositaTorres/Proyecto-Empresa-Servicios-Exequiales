package empresa.servicios.exequiales.ingresosyegresos.controller;


import empresa.servicios.exequiales.ingresosyegresos.Service.IEmpleadoService;
import empresa.servicios.exequiales.ingresosyegresos.entity.Empleado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmpleadoRestController {

    @Autowired
    private IEmpleadoService empleadoService;

    @GetMapping("/users/{id}")
    public Empleado findById(@PathVariable int id) { // Read - Get
        return empleadoService.findById(id);
    }
    @GetMapping("/users")
    public List<Empleado> findAll(){ // get listado
        return empleadoService.findAll();
    }

    @PostMapping("/users")
    public Empleado createEmpleado(@RequestBody Empleado empleado){ // Post - Crear
        return empleadoService.createEmpleado(empleado);
    }

    @PatchMapping("/users/{id}")
    public Empleado updateEmpleado(@PathVariable int id, @RequestBody Empleado empleado){ // patch actualizar
        return empleadoService.updateEmpleado(id, empleado);
    }

    @DeleteMapping("/users/{id}")
    public void deleteEmpleado(@PathVariable int id) { // borrar
        empleadoService.deleteEmpleado(id);
    }
}
