 package servicios.exequiales.ingresosyegresos.ingresos_egresos.repository;

 import org.springframework.data.repository.CrudRepository;
 import servicios.exequiales.ingresosyegresos.ingresos_egresos.entity.MovimientoDinero;

 public interface IMovimientoRepository extends CrudRepository<MovimientoDinero, Long> {
 }
