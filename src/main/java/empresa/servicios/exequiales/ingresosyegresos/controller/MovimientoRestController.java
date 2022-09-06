package empresa.servicios.exequiales.ingresosyegresos.controller;

import empresa.servicios.exequiales.ingresosyegresos.Service.IMovimientoDineroService;
import empresa.servicios.exequiales.ingresosyegresos.entity.MovimientoDinero;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/enterprises")
public class MovimientoRestController {

    @Autowired
    private IMovimientoDineroService movimientoService;

    @GetMapping("/{enterpriseId}/movements/{movementId}")
    public MovimientoDinero findById(@PathVariable int enterpriseId, @PathVariable int movementId) { // Read - Get
        return movimientoService.findById(movementId);
    }

    @GetMapping("/{enterpriseId}/movements")
    public List<MovimientoDinero> findAll(){ // get listado
        return movimientoService.findAll();
    }

    @PostMapping("/{enterpriseId}/movements")
    public MovimientoDinero creatMovimiento(@RequestBody MovimientoDinero movimiento) { // Post - Crear
        return movimientoService.creatMovimiento(movimiento);
    }

    @PatchMapping("/{enterpriseId}/movements/{movementId}")
    public MovimientoDinero updateMovimiento(@PathVariable int enterpriseId, @RequestBody MovimientoDinero movimiento){ // patch actualizar
        return movimientoService.updateMovimiento(enterpriseId, movimiento);
    }

    @DeleteMapping("/{enterpriseId}/movements/{movementId}")
    public void deletMovimiento(@PathVariable int enterpriseId, @PathVariable int movementId) { // borrar
        movimientoService.deletMovimiento(movementId);
    }
}