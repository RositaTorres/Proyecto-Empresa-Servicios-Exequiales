package servicios.exequiales.ingresosyegresos.ingresos_egresos.Service;

import org.springframework.beans.factory.annotation.Autowired;
import servicios.exequiales.ingresosyegresos.ingresos_egresos.entity.Producto;
import org.springframework.stereotype.Service;
import servicios.exequiales.ingresosyegresos.ingresos_egresos.repository.IProductoRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ProductoService implements IProductoService {

    @Autowired
    private IProductoRepository productoRepository;

    @Override
    public Producto findById(long id) {
        Optional<Producto> producto = productoRepository.findById((long)id);
        return producto.get();
    }

    @Override
    public List<Producto> findAll() {
        List<Producto> productos = (List<Producto>) productoRepository.findAll();
        return productos;
    }

    @Override
    public Producto creatProducto(Producto producto) {
        return productoRepository.save(producto);
    }

    @Override
    public Producto updateProducto(long id, Producto producto) {
        return productoRepository.save(producto);
    }

    @Override
    public void deletProducto(long id) {
        productoRepository.deleteById((long)id);
    }

}