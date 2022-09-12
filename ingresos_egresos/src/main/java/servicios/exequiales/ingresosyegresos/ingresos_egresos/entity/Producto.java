 package servicios.exequiales.ingresosyegresos.ingresos_egresos.entity;

 import javax.persistence.*;

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

     @JoinColumn(name="movimiento")
     private MovimientoDinero movimientoDinero;

//     public Producto(long idProducto, String nombreProducto, float valorProducto, boolean estadoProducto, MovimientoDinero movimientoDinero) {
//         this.idProducto = idProducto;
//         this.nombreProducto = nombreProducto;
//         this.valorProducto = valorProducto;
//         this.estadoProducto = estadoProducto;
//         this.movimientoDinero = movimientoDinero;
//     }

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

     public MovimientoDinero getMovimientoDinero() {
         return movimientoDinero;
     }

     public void setMovimientoDinero(MovimientoDinero movimientoDinero) {
         this.movimientoDinero = movimientoDinero;
     }

     @Override
     public String toString() {
         return "Producto{" +
                 "idProducto=" + idProducto +
                 ", nombreProducto='" + nombreProducto + '\'' +
                 ", valorProducto=" + valorProducto +
                 ", estadoProducto=" + estadoProducto +
                 ", movimientoDinero=" + movimientoDinero +
                 '}';
     }
 }