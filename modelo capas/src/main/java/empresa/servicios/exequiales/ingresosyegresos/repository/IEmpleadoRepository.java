package empresa.servicios.exequiales.ingresosyegresos.repository;

import empresa.servicios.exequiales.ingresosyegresos.entity.Empleado;
import org.springframework.data.repository.CrudRepository;

public interface IEmpleadoRepository extends CrudRepository<Empleado, Long> {

}