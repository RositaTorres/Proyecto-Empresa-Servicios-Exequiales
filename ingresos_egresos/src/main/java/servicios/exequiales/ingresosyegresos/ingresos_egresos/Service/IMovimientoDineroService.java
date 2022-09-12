 package servicios.exequiales.ingresosyegresos.ingresos_egresos.Service;

 import servicios.exequiales.ingresosyegresos.ingresos_egresos.entity.MovimientoDinero;

 import java.util.List;

 public interface IMovimientoDineroService {

     public MovimientoDinero findById(int id);
     public List<MovimientoDinero> findAll();
     public MovimientoDinero creatMovimiento(MovimientoDinero movimiento);
     public MovimientoDinero updateMovimiento(int id, MovimientoDinero movimiento);
     public void deletMovimiento(int id);
 }
