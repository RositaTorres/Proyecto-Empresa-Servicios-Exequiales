package empresa.servicios.exequiales.ingresosyegresos.controller;

import empresa.servicios.exequiales.ingresosyegresos.Service.IEmpresaService;
import empresa.servicios.exequiales.ingresosyegresos.entity.Empresa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")

public class EmpresaRestController {

    @Autowired
    private IEmpresaService empresaService;

    @GetMapping("/enterprises/{id}")
    public Empresa findById(@PathVariable int id) { // Read - Get
        return empresaService.findById(id);
   }
    @GetMapping("/enterprises")
    public List<Empresa> findAll(){ // get listado
        return empresaService.findAll();
    }

    @PostMapping("/enterprises")
    public Empresa createEmpresa(@RequestBody Empresa empresa){ // Post - Crear
        return empresaService.createEmpresa(empresa);
    }

    @PatchMapping("/enterprises/{id}")
    public Empresa updateEmpresa(@PathVariable int id, @RequestBody Empresa empresa){ // patch actualizar
        return empresaService.updateEmpresa(id, empresa);
    }

    @DeleteMapping("/enterprises/{id}")
    public void deletEmpresa(@PathVariable int id) { // borrar
       empresaService.deletEmpresa(id);
    }
}
