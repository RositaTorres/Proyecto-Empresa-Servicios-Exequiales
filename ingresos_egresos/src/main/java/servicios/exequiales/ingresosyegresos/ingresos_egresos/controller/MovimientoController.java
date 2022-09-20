package servicios.exequiales.ingresosyegresos.ingresos_egresos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.*;
import servicios.exequiales.ingresosyegresos.ingresos_egresos.Service.IEmpleadoService;
import servicios.exequiales.ingresosyegresos.ingresos_egresos.Service.IEmpresaService;
import servicios.exequiales.ingresosyegresos.ingresos_egresos.Service.IMovimientoDineroService;
import servicios.exequiales.ingresosyegresos.ingresos_egresos.Service.IProductoService;
import servicios.exequiales.ingresosyegresos.ingresos_egresos.entity.Empleado;
import servicios.exequiales.ingresosyegresos.ingresos_egresos.entity.Empresa;
import servicios.exequiales.ingresosyegresos.ingresos_egresos.entity.MovimientoDinero;
import servicios.exequiales.ingresosyegresos.ingresos_egresos.entity.Producto;

import javax.validation.Valid;
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
    public String creatMovimiento(Model modelo) {
        LOG.log(Level.INFO, "creatMovimiento");
        MovimientoDinero movimiento = new MovimientoDinero();
        modelo.addAttribute("movimiento", movimiento);
        //Producto
        List<Producto> productos = productoService.findAll();
        modelo.addAttribute("productos", productos);
        //Empresa
        List<Empresa> empresas = empresaService.findAll();
        modelo.addAttribute("empresas", empresas);
        //Empleado
        Empleado empleado = new Empleado();
        modelo.addAttribute("empleado", empleado);
        return "/movimientos/modificar";
    }

    @PostMapping("/movimientos/guardar")
    public String guardarMovimiento(@Valid MovimientoDinero movimientoDinero, BindingResult error, Model modelo) {
        LOG.log(Level.INFO, "guardarMovimiento");
        for(ObjectError e : error.getAllErrors())
            System.out.println(e.toString());
        if(error.hasErrors()) {
            return "/movimientos/modificar";
        }

        movimientoDinero = movimientoDineroService.creatMovimiento(movimientoDinero);
        return "redirect:/movimientos/list";
    }

    @RequestMapping(value = "/movimientos/editar/{id}", method = RequestMethod.GET)
    public String editMovimiento(@PathVariable("id") long id, Model modelo) {
        LOG.log(Level.INFO, "editMovimiento");
        System.out.println(id);
        MovimientoDinero movimientoDinero = movimientoDineroService.findById(id);
        System.out.println(movimientoDinero.toString());
        modelo.addAttribute("movimiento", movimientoDinero);
        //Producto
        List<Producto> productos = productoService.findAll();
        modelo.addAttribute("productos", productos);
        //Empresa
        List<Empresa> empresas = empresaService.findAll();
        modelo.addAttribute("empresas", empresas);
        return "/movimientos/modificar";
    }

    @RequestMapping(value = "/movimientos/eliminar/{id}", method = RequestMethod.GET)
    public String deletMovimiento(@PathVariable("id") long id, Model modelo) {
        LOG.log(Level.INFO, "deletMovimiento");
        movimientoDineroService.deletMovimiento(id);
        return "redirect:/movimientos/list";
    }
}