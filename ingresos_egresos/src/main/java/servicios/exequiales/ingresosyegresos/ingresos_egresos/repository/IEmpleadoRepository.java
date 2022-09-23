package servicios.exequiales.ingresosyegresos.ingresos_egresos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import servicios.exequiales.ingresosyegresos.ingresos_egresos.entity.Empleado;

public interface IEmpleadoRepository extends JpaRepository<Empleado, Long> {

    Empleado findByUsername(String username);
}
