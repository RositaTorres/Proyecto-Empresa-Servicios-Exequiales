package empresa.servicios.exequiales.ingresosyegresos.Service;

import empresa.servicios.exequiales.ingresosyegresos.entity.Producto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductoService implements IProductoService {

    public Producto findById(int id) {
        Producto producto = new Producto();
        producto.setIdProducto(1);
        producto.setNombreProducto("Cofre Azul");
        producto.setEstadoProducto(true);
        return producto;
    }

    @Override
    public List<Producto> findAll() {
        List<Producto> productos = new ArrayList<Producto>();
        Producto producto1 = new Producto();
        producto1.setIdProducto(1);
        producto1.setNombreProducto("Sala de velacion");
        producto1.setValorProducto(350000);
        producto1.setEstadoProducto(true);
        productos.add(producto1);

        Producto producto2 = new Producto();
        producto2.setIdProducto(2);
        producto2.setNombreProducto("Acompañamiento Musical");
        producto2.setValorProducto(500000);
        producto2.setEstadoProducto(true);
        productos.add(producto2);
        return productos;
    }

    @Override
    public Producto creatProducto(Producto producto) {
        Producto creatproducto = new Producto();
        creatproducto.setNombreProducto(producto.getNombreProducto());
        creatproducto.setValorProducto(producto.getValorProducto());
        creatproducto.setEstadoProducto(producto.isEstadoProducto());
        return creatproducto;
    }
    @Override
    public Producto updateProducto(int id, Producto producto) {
        Producto patchproducto = findById(id);
        patchproducto.setNombreProducto(producto.getNombreProducto());
        patchproducto.setValorProducto(producto.getValorProducto());
        patchproducto.setEstadoProducto(producto.isEstadoProducto());
        return patchproducto;
    }

    @Override
    public void deletProducto(int id) { Producto deletProducto = findById(id); }

}