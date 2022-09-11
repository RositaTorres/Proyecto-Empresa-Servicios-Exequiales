package servicios.exequiales.ingresosyegresos.ingresos_egresos.Service;

import servicios.exequiales.ingresosyegresos.ingresos_egresos.entity.MovimientoDinero;
import servicios.exequiales.ingresosyegresos.ingresos_egresos.entity.Producto;
import org.springframework.stereotype.Service;
import servicios.exequiales.ingresosyegresos.ingresos_egresos.repository.IProductoRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProductoService implements IProductoService {

    private IProductoRepository productoRepository;

    public Producto findById(int id) {
        Optional<Producto> producto = productoRepository.findById((long) id);
        return producto.get();
    }

    @Override
    public List<Producto> findAll() {
        List<Producto> productos = (List<Producto>) productoRepository.findAll();
        return productos;
    }

    @Override
    public Producto creatProducto(Producto producto) {
        Producto newproducto = productoRepository.save(producto);
        return newproducto;
    }
    @Override
    public Producto updateProducto(int id, Producto producto) {
        Producto putProducto = productoRepository.save(producto);
        return putProducto;
    }

    @Override
    public void deletProducto(int id) {productoRepository.deleteById((long)id); }

}