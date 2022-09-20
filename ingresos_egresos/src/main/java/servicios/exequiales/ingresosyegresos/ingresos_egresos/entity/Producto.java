 package servicios.exequiales.ingresosyegresos.ingresos_egresos.entity;

 import javax.persistence.*;

 import java.util.List;

 @Entity
 @Table(name="productos")
 public class Producto {
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     @Column(name="id_producto",nullable = false)
     private long idProducto;
     @javax.validation.constraints.NotEmpty
     @Column(name="nombre",nullable = false)
     private String nombreProducto;

     @Column(name="estado",nullable = false)
     private boolean estadoProducto;

     public Producto(long idProducto, String nombreProducto, boolean estadoProducto) {
         this.idProducto = idProducto;
         this.nombreProducto = nombreProducto;
         this.estadoProducto = estadoProducto;
     }

     public Producto() {

     }

     public long getIdProducto() {
         return idProducto;
    }

     public void setIdProducto(long idProducto) {
         this.idProducto = idProducto;
     }

     public String getNombreProducto() {
         return nombreProducto;
     }

     public void setNombreProducto(String nombreProducto) {
         this.nombreProducto = nombreProducto;
     }

     public boolean isEstadoProducto() {
         return estadoProducto;
     }

     public void setEstadoProducto(boolean estadoProducto) {
         this.estadoProducto = estadoProducto;
     }


     @Override
     public String toString() {
         return "Producto{" +
                 "idProducto=" + idProducto +
                 ", nombreProducto='" + nombreProducto + '\'' +
                 ", estadoProducto=" + estadoProducto +
                 '}';
     }
 }