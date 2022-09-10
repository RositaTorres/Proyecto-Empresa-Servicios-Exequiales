package servicios.exequiales.ingresosyegresos.ingresos_egresos.repository;

import org.springframework.data.repository.CrudRepository;
import servicios.exequiales.ingresosyegresos.ingresos_egresos.entity.Empresa;

public interface IEmpresaRepository extends CrudRepository<Empresa, Long> {
}
