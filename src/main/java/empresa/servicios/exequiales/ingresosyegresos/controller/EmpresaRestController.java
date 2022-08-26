package empresa.servicios.exequiales.ingresosyegresos.controller;

import empresa.servicios.exequiales.ingresosyegresos.entity.Empresa;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")

public class EmpresaRestController {

    @GetMapping("/empresa/{id}")
    public Empresa findById(@PathVariable int id) {
        Empresa empresa = new Empresa();
        empresa.setIdEmpresa(id);
        empresa.setNit("80889956-9");
        empresa.setNombreEmpresa("Exequiales Escocia SAS");
        empresa.setDireccion("Cll 45 con 23 Esquina");
        empresa.setTelefono("24658936");
        empresa.setEstado(false);
        return empresa;
   }

    @GetMapping("/empresa")
    public List<Empresa> findAll(){
        List<Empresa> empresas = new ArrayList<Empresa>();
        Empresa empresa1 = new Empresa();
        empresa1.setIdEmpresa(1);
        empresa1.setNit("80889956-9");
        empresa1.setNombreEmpresa("Exequiales Escocia SAS");
        empresa1.setDireccion("Cll 45 con 23 Esquina");
        empresa1.setTelefono("24658936");
        empresa1.setEstado(false);
        empresas.add(empresa1);
        Empresa empresa2 = new Empresa();
        empresa2.setIdEmpresa(2);
        empresa2.setNit("808568956-9");
        empresa2.setNombreEmpresa("Exequiales Martinez");
        empresa2.setDireccion("Cra. 123 NO. 25-14");
        empresa2.setTelefono("2568965");
        empresa2.setEstado(false);
        empresas.add(empresa2);
        return empresas;
    }
    @PutMapping("/empresa/{id}")
    public Empresa updateEmpresa(@PathVariable int id, @RequestBody Empresa empresa){
        Empresa putEmpresa = findById(id);
        putEmpresa.setNit(empresa.getNit());
        putEmpresa.setNombreEmpresa(empresa.getNombreEmpresa());
        putEmpresa.setDireccion(empresa.getDireccion());
        putEmpresa.setTelefono(empresa.getTelefono());
        putEmpresa.setEstado(empresa.isEstado());
        return putEmpresa;
    }
}
