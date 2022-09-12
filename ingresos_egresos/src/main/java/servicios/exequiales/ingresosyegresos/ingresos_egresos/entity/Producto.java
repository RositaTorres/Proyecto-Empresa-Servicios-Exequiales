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
     @Column(name="nombre",nullable = false)
     private String nombreProducto;
     @Column(name="valor",nullable = false)
     private float valorProducto;
     @Column(name="estado",nullable = false)
     private boolean estadoProducto;

     @ManyToMany (mappedBy ="productos")
     private List<MovimientoDinero> movimientos;

     public Producto(long idProducto, String nombreProducto, float valorProducto, boolean estadoProducto, List<MovimientoDinero> movimientos) {
         this.idProducto = idProducto;
         this.nombreProducto = nombreProducto;
         this.valorProducto = valorProducto;
         this.estadoProducto = estadoProducto;
         this.movimientos   = movimientos;
     }

     public Producto() {
     }

     public long getIdProducto() {
         return idProducto;
    }

     public void setIdProducto(int idProducto) {
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

     public float getValorProducto() { return valorProducto; }

     public void setValorProducto(float valorProducto) { this.valorProducto = valorProducto; }

     public List<MovimientoDinero> getMovimientos() {
         return movimientos;
     }

     public void setMovimientos(List<MovimientoDinero> movimientos) {
         this.movimientos = movimientos;
     }

     @Override
     public String toString() {
         return "Producto{" +
                 "idProducto=" + idProducto +
                 ", nombreProducto='" + nombreProducto + '\'' +
                 ", valorProducto=" + valorProducto +
                 ", estadoProducto=" + estadoProducto +
                 ", movimientos=" + movimientos +
                 '}';
     }
 }