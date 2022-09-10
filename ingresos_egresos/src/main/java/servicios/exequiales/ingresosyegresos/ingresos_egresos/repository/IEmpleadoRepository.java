package servicios.exequiales.ingresosyegresos.ingresos_egresos.repository;

import org.springframework.data.repository.CrudRepository;
import servicios.exequiales.ingresosyegresos.ingresos_egresos.entity.Empleado;

public interface IEmpleadoRepository extends CrudRepository<Empleado, Long> {

}
