 package servicios.exequiales.ingresosyegresos.ingresos_egresos.Service;

 import servicios.exequiales.ingresosyegresos.ingresos_egresos.entity.Producto;

 import java.util.List;

 public interface IProductoService {

     public Producto findById(long id);
     public List<Producto> findAll();
     public Producto creatProducto(Producto producto);
     public Producto updateProducto(long id, Producto producto);
     public void deletProducto(long id);
 }
