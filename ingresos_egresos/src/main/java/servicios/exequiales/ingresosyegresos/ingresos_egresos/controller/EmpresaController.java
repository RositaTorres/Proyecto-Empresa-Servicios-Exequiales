package servicios.exequiales.ingresosyegresos.ingresos_egresos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import servicios.exequiales.ingresosyegresos.ingresos_egresos.Service.IEmpresaService;
import servicios.exequiales.ingresosyegresos.ingresos_egresos.entity.Empresa;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

@Controller
public class EmpresaController {

    @Autowired
    private IEmpresaService empresaService;
    private final Logger LOG = Logger.getLogger("" + EmpresaController.class);

    @GetMapping("/empresas/list")
    public String getListEmpresas(Model model) {
        LOG.log(Level.INFO, "getListEmpresas");
        List<Empresa> empresas = empresaService.findAll();
        for (Empresa empresa : empresas)
            System.out.println(empresa.toString());
        model.addAttribute("empresas", empresas);
        return "empresas/list";
    }


    @GetMapping("/empresas/modificar")

    public String creatEmpresa(Model modelo) {
        LOG.log(Level.INFO, "createEmpresa");
        Empresa empresa = new Empresa();
        modelo.addAttribute("empresa", empresa);
        return "empresas/modificar";
    }
    @PostMapping("/guardar")
    public String guardarEmpresa(Empresa empresa){
        LOG.log(Level.INFO,"guardarEmpresa");
        empresa.setEstado(true);
        System.out.println(empresa.toString());
        empresa = empresaService.createEmpresa(empresa);
        return "redirect:/empresas/list";

}
}