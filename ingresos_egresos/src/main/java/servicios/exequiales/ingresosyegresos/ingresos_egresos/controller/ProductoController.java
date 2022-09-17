package servicios.exequiales.ingresosyegresos.ingresos_egresos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import servicios.exequiales.ingresosyegresos.ingresos_egresos.Service.IMovimientoDineroService;
import servicios.exequiales.ingresosyegresos.ingresos_egresos.Service.IProductoService;
import servicios.exequiales.ingresosyegresos.ingresos_egresos.entity.Producto;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

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
    public String guardarProducto(Producto producto) {
        LOG.log(Level.INFO, "guardarProducto");
        producto = productoService.creatProducto(producto);
        return "redirect:/productos/list";
    }

    @RequestMapping(value = "/productos/editar/{id}", method = RequestMethod.GET)
    public String editProducto(@PathVariable("id") long id, Model modelo) {
        LOG.log(Level.INFO, "editProducto");
        System.out.println(id);
        Producto producto = productoService.findById(id);
        System.out.println(producto.toString());
        modelo.addAttribute("producto", producto);
        return "productos/modificar";
    }

    @RequestMapping(value = "/productos/eliminar/{id}", method = RequestMethod.GET)
    public String deletProducto(@PathVariable("id") long id, Model modelo) {
        LOG.log(Level.INFO, "deletProducto");
        productoService.deletProducto(id);
        return "redirect:/productos/listar";
    }
}
