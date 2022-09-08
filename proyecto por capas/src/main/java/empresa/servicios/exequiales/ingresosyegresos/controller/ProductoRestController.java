package empresa.servicios.exequiales.ingresosyegresos.controller;


import empresa.servicios.exequiales.ingresosyegresos.Service.IProductoService;
import empresa.servicios.exequiales.ingresosyegresos.entity.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductoRestController {

    @Autowired
    private IProductoService productoService;

    @GetMapping("/products/{id}")
    public Producto findById(@PathVariable int id) { // Read - Get
        return productoService.findById(id);
    }
    @GetMapping("/products")
    public List<Producto> findAll(){ // get listado
        return productoService.findAll();
    }

    @PostMapping("/products")
    public Producto createEmpresa(@RequestBody Producto producto){ // Post - Crear
        return productoService.creatProducto(producto);
    }

    @PatchMapping("/products/{id}")
    public Producto updateProducto(@PathVariable int id, @RequestBody Producto producto){ // patch actualizar
        return productoService.updateProducto(id, producto);
    }

    @DeleteMapping("/products/{id}")
    public void deletProducto(@PathVariable int id) { // borrar
        productoService.deletProducto(id);
    }
}
