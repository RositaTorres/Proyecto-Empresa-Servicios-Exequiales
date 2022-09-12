 package servicios.exequiales.ingresosyegresos.ingresos_egresos.Service;

 import org.springframework.beans.factory.annotation.Autowired;
 import servicios.exequiales.ingresosyegresos.ingresos_egresos.entity.*;
 import org.springframework.stereotype.Service;
 import servicios.exequiales.ingresosyegresos.ingresos_egresos.repository.IMovimientoRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

 @Service
 public class MovimientoDineroService implements IMovimientoDineroService {

     @Autowired
     private IMovimientoRepository movimientoRepository;


     @Override
     public MovimientoDinero findById(int id) {
         Optional<MovimientoDinero> movimientoDinero = movimientoRepository.findById((long) id);
         return movimientoDinero.get();
     }

     @Override
     public List<MovimientoDinero> findAll() {
         List<MovimientoDinero> movimientos = (List<MovimientoDinero>) movimientoRepository.findAll();
         return movimientos;
     }

     @Override
     public MovimientoDinero creatMovimiento(MovimientoDinero movimiento)  {
         MovimientoDinero newmovimiento = movimientoRepository.save(movimiento);
         return newmovimiento;
     }

     @Override
     public MovimientoDinero updateMovimiento(int id, MovimientoDinero movimiento)  {
         MovimientoDinero putMovimientoDinero = movimientoRepository.save(movimiento);
         return putMovimientoDinero;
     }
     @Override
     public void deletMovimiento(int id)  {
         movimientoRepository.deleteById((long)id);
     }
 }