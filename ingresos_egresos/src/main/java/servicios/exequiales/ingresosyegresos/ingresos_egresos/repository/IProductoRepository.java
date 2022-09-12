 package servicios.exequiales.ingresosyegresos.ingresos_egresos.repository;

 import org.springframework.data.repository.CrudRepository;
 import servicios.exequiales.ingresosyegresos.ingresos_egresos.entity.Producto;

 public interface IProductoRepository extends CrudRepository<Producto, Long> {
 }
