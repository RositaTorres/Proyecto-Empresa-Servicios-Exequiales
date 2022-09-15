package servicios.exequiales.ingresosyegresos.ingresos_egresos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import servicios.exequiales.ingresosyegresos.ingresos_egresos.Service.IEmpleadoService;
import servicios.exequiales.ingresosyegresos.ingresos_egresos.Service.IEmpresaService;
import servicios.exequiales.ingresosyegresos.ingresos_egresos.Service.IMovimientoDineroService;
import servicios.exequiales.ingresosyegresos.ingresos_egresos.Service.IProductoService;
import servicios.exequiales.ingresosyegresos.ingresos_egresos.entity.Empresa;
import servicios.exequiales.ingresosyegresos.ingresos_egresos.entity.MovimientoDinero;
import servicios.exequiales.ingresosyegresos.ingresos_egresos.entity.Producto;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
@Controller
public class MovimientoController {

    @Autowired
    private IMovimientoDineroService movimientoDineroService;

    @Autowired
    private IEmpleadoService empleadoService;

    @Autowired
    private IEmpresaService empresaService;

    @Autowired
    private IProductoService productoService;

    private final Logger LOG = Logger.getLogger("" + MovimientoController.class);

    @GetMapping("/movimientos/list")
    public String getListmovimientos(Model model) {
        LOG.log(Level.INFO, "getListmovimientos");
        List<MovimientoDinero> movimientos = movimientoDineroService.findAll();
        for (MovimientoDinero movimientoDinero : movimientos)
            System.out.println(movimientoDinero.toString());
        model.addAttribute("movimientos", movimientos);
        return "/movimientos/list";
    }

    @GetMapping("/movimientos/modificar")
    public String createMovimiento(Model modelo) {
        LOG.log(Level.INFO, "createMovimiento");
        MovimientoDinero movimiento = new MovimientoDinero();
        modelo.addAttribute("movimiento", movimiento);
        //Producto
        //List<Producto> productos = productoService.findAll();
        //modelo.addAttribute("productos", productos);
        //Empresa
        List<Empresa> empresas = empresaService.findAll();
        modelo.addAttribute("empresas", empresas);
        return "movimientos/modificar";
    }

    @PostMapping("/movimientos/guardar")
    public String guardarMovimiento(MovimientoDinero movimientoDinero) {
        LOG.log(Level.INFO, "guardarMovimiento");
        movimientoDinero = movimientoDineroService.creatMovimiento(movimientoDinero);
        return "redirect:/movimientos/list";
    }

}