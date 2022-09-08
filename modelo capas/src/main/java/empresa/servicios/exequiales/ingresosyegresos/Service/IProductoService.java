package empresa.servicios.exequiales.ingresosyegresos.Service;

import empresa.servicios.exequiales.ingresosyegresos.entity.Producto;

import java.util.List;

public interface IProductoService {

    public Producto findById(int id);
    public List<Producto> findAll();
    public Producto creatProducto(Producto producto);
    public Producto updateProducto(int id, Producto producto);
    public void deletProducto(int id);
}
