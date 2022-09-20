package servicios.exequiales.ingresosyegresos.ingresos_egresos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.*;

import servicios.exequiales.ingresosyegresos.ingresos_egresos.Service.IMovimientoDineroService;
import servicios.exequiales.ingresosyegresos.ingresos_egresos.Service.IProductoService;

import servicios.exequiales.ingresosyegresos.ingresos_egresos.entity.Producto;

import javax.validation.Valid;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

@Controller
public class ProductoController {

    @Autowired
    private IMovimientoDineroService movimientoDineroService;

    @Autowired
    private IProductoService productoService;

    private final Logger LOG = Logger.getLogger("" + ProductoController.class);

    @GetMapping("/productos/list")
    public String getListProductos(Model model) {
        LOG.log(Level.INFO, "getListProductos");
        List<Producto> productos = productoService.findAll();
        for (Producto pro : productos)
            System.out.println(pro.toString());
        model.addAttribute("productos", productos);
        return "/productos/list";
    }

    @GetMapping("/productos/crear")
    public String creatProducto(Model modelo) {
        LOG.log(Level.INFO, "creatProducto");
        Producto productos = new Producto();
        modelo.addAttribute("productos", productos);
        return "productos/modificar";
    }

    @PostMapping("/productos/guardar")
    public String guardarProducto(@Valid Producto producto, BindingResult error, Model modelo ) {
        LOG.log(Level.INFO, "guardarProducto");
        for(ObjectError e : error.getAllErrors())
            System.out.println(e.toString());
        if(error.hasErrors()) {
            return "empresas/modificar";
        }
        producto.setEstadoProducto(true);
        producto = productoService.creatProducto(producto);
        return "redirect:/productos/list";
    }

    @RequestMapping(value = "/productos/editar/{id}", method = RequestMethod.GET)
    public String editProducto(@PathVariable("id") int id, Model modelo) {
        LOG.log(Level.INFO, "editProducto");
        System.out.println(id);
        Producto producto = productoService.findById(id);
        System.out.println(producto.toString());
        modelo.addAttribute("productos", producto);
        return "productos/modificar";
    }

    @RequestMapping(value = "/productos/eliminar/{id}", method = RequestMethod.GET)
    public String deletProducto(@PathVariable("id") long id, Model modelo) {
        LOG.log(Level.INFO, "deletProducto");
        productoService.deletProducto(id);
        return "redirect:/productos/list";
    }
}
