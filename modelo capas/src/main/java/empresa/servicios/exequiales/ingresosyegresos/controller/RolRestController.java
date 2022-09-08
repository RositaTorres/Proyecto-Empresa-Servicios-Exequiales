package empresa.servicios.exequiales.ingresosyegresos.controller;

import empresa.servicios.exequiales.ingresosyegresos.Service.IRolService;
import empresa.servicios.exequiales.ingresosyegresos.entity.Rol;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class RolRestController {

    @Autowired
    private IRolService rolService;

    @GetMapping("/roles/{id}")
    public Rol findById(@PathVariable int id) { // Read - Get
        return rolService.findById(id);
    }
    @GetMapping("/roles")
    public List<Rol> findAll(){ // get listado
        return rolService.findAll();
    }

    @PostMapping("/roles")
    public Rol createRol(@RequestBody Rol empleado){ // Post - Crear
        return rolService.createRol(empleado);
    }

    @PatchMapping("/roles/{id}")
    public Rol updateRol(@PathVariable int id, @RequestBody Rol empleado){ // patch actualizar
        return rolService.updateRol(id, empleado);
    }

    @DeleteMapping("/roles/{id}")
    public void deleteRol(@PathVariable int id) { // borrar
        rolService.deleteRol(id);
    }
}

