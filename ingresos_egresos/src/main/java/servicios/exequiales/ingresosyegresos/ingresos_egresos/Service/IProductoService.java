 package servicios.exequiales.ingresosyegresos.ingresos_egresos.Service;

 import servicios.exequiales.ingresosyegresos.ingresos_egresos.entity.Producto;

 import java.util.List;

 public interface IProductoService {

     public Producto findById(int id);
     public List<Producto> findAll();
     public Producto creatProducto(Producto producto);
     public Producto updateProducto(int id, Producto producto);
     public void deletProducto(int id);
 }
