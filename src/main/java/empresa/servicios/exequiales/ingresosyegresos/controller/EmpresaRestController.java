package empresa.servicios.exequiales.ingresosyegresos.controller;

import empresa.servicios.exequiales.ingresosyegresos.Service.IEmpresaService;
import empresa.servicios.exequiales.ingresosyegresos.entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")

public class EmpresaRestController {

    static  List<Empresa> lista = new ArrayList<Empresa>();

    static {
        Empresa e= new Empresa(1, "80889956-9", "Exequiales Escocia SAS", "Cll 45 con 23 Esquina", "24658936", false);
        e.addLinea(new MovimientoDinero(1,500000, "Venta plan Vida Enterna", new Empleado(), new Empresa(), new Plan(), new Producto()));

        Empresa e1= new Empresa(2, "808568956-9", "Exequiales Martinez", "Cra. 123 NO. 25-14", "2568965", false);
        e1.addLinea(new MovimientoDinero(2,250000, "Venta Plan Basico Cali",new Empleado(), new Empresa(),new Plan(), new Producto()));

        lista.add(e);
        lista.add(e1);
    }

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
