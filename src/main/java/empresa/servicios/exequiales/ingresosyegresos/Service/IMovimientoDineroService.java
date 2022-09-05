package empresa.servicios.exequiales.ingresosyegresos.Service;

import empresa.servicios.exequiales.ingresosyegresos.entity.MovimientoDinero;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface IMovimientoDineroService {

    public MovimientoDinero findById(int id);
    public List<MovimientoDinero> findAll();
    public MovimientoDinero creatMovimiento(MovimientoDinero movimiento);
    public MovimientoDinero updateMovimiento(int id, MovimientoDinero movimiento);
    public void deletMovimiento(int id);
}
