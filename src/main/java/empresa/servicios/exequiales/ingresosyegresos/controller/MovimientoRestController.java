package empresa.servicios.exequiales.ingresosyegresos.controller;

import empresa.servicios.exequiales.ingresosyegresos.Service.IMovimientoDineroService;
import empresa.servicios.exequiales.ingresosyegresos.entity.MovimientoDinero;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")

public class MovimientoRestController {

    @Autowired
    private IMovimientoDineroService movimientoService;

    @GetMapping("/transaction/{id}")
    public MovimientoDinero findById(@PathVariable int id) { // Read - Get
        return movimientoService.findById(id);
    }

    @GetMapping("/transaction")
    public List<MovimientoDinero> findAll(){ // get listado
        return movimientoService.findAll();
    }

    @PostMapping("/transaction")
    public MovimientoDinero creatMovimiento(@RequestBody MovimientoDinero movimiento) { // Post - Crear
        return movimientoService.creatMovimiento(movimiento);
    }

    @PatchMapping("/transaction/{id}")
    public MovimientoDinero updateMovimiento(@PathVariable int id, @RequestBody MovimientoDinero movimiento){ // patch actualizar
        return movimientoService.updateMovimiento(id, movimiento);
    }

    @DeleteMapping("/transaction/{id}")
    public void deletMovimiento(@PathVariable int id) { // borrar
        movimientoService.deletMovimiento(id);
    }
}