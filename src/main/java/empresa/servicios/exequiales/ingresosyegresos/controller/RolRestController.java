package empresa.servicios.exequiales.ingresosyegresos.controller;

import empresa.servicios.exequiales.ingresosyegresos.Service.IRolService;
import empresa.servicios.exequiales.ingresosyegresos.entity.Empleado;
import empresa.servicios.exequiales.ingresosyegresos.entity.Rol;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class RolRestController {

    @Autowired
    private IRolService rolService;

    @GetMapping("/Rol/{id}")
    public Rol findById(@PathVariable int id) { // Read - Get
        return rolService.findById(id);
    }
    @GetMapping("/Rol")
    public List<Rol> findAll(){ // get listado
        return rolService.findAll();
    }

    @PostMapping("/Rol")
    public Rol createRol(@RequestBody Rol empleado){ // Post - Crear
        return rolService.createRol(empleado);
    }

    @PatchMapping("/Rol/{id}")
    public Rol updateRol(@PathVariable int id, @RequestBody Rol empleado){ // patch actualizar
        return rolService.updateRol(id, empleado);
    }

    @DeleteMapping("/Rol/{id}")
    public void deletRol(@PathVariable int id) { // borrar
        rolService.deletRol(id);
    }
}

