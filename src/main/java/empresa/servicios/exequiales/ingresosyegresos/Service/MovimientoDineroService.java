package empresa.servicios.exequiales.ingresosyegresos.Service;

import empresa.servicios.exequiales.ingresosyegresos.entity.*;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MovimientoDineroService implements IMovimientoDineroService {

    @Override
    public MovimientoDinero findById(int id) {
        MovimientoDinero movimiento = new MovimientoDinero();
        movimiento.setIdMovimientoDinero(id);
        movimiento.setMontoMovimiento(5000000);
        movimiento.setConceptoMovimiento("Venta plan Vida Enterna");
        return movimiento;
    }

    @Override
    public List<MovimientoDinero> findAll() {
        List<MovimientoDinero> movimientos = new ArrayList<MovimientoDinero>();
        MovimientoDinero movimiento1 = new MovimientoDinero();
        movimiento1.setIdMovimientoDinero(1);
        movimiento1.setMontoMovimiento(500000);
        movimiento1.setConceptoMovimiento("Venta Plan Basico Medellin");
        movimientos.add(movimiento1);

        MovimientoDinero movimiento2 = new MovimientoDinero();
        movimiento2.setIdMovimientoDinero(2);
        movimiento2.setMontoMovimiento(2500000);
        movimiento2.setConceptoMovimiento("Venta Plan Basico Cali");
        movimientos.add(movimiento1);
        return movimientos;
    }

    @Override
    public MovimientoDinero creatMovimiento(MovimientoDinero movimiento) {
        MovimientoDinero creatmovimiento = new MovimientoDinero();
        creatmovimiento.setConceptoMovimiento(movimiento.getConceptoMovimiento());
        creatmovimiento.setMontoMovimiento(movimiento.getMontoMovimiento());
        return creatmovimiento;
    }

    @Override
    public MovimientoDinero updateMovimiento(int id, MovimientoDinero movimiento) {
        MovimientoDinero patchmovimiento = findById(id);
        patchmovimiento.setIdMovimientoDinero(movimiento.getIdMovimientoDinero());
        patchmovimiento.setConceptoMovimiento(movimiento.getConceptoMovimiento());
        patchmovimiento.setMontoMovimiento(movimiento.getMontoMovimiento());
        return patchmovimiento;
    }

    @Override
    public void deletMovimiento(int id) { MovimientoDinero deletMovimiento = findById(id);

    }
}
