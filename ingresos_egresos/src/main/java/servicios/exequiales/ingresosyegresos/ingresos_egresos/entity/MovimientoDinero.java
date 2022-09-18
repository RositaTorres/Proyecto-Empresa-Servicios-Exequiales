 package servicios.exequiales.ingresosyegresos.ingresos_egresos.entity;


 import javax.persistence.*;
 import java.util.Date;
 import java.util.List;

 @Entity
 @Table(name="movimientos")
 public class MovimientoDinero {
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     @Column(name = "id_movimiento")
     private long idMovimientoDinero;
     @Column(name = "monto")
     private float montoMovimiento;
     @Column(name = "concepto")
     private String conceptoMovimiento;
     @ManyToOne
     @JoinColumn(name = "id_empleado")
     private Empleado empleado;

     @ManyToOne
     @JoinColumn(name = "id_empresa")
     private Empresa empresa;

     @ManyToMany
     @JoinTable (name= "movimiento_producto")
     private List<Producto> productos;

     @Column (name= "fecha")
     private Date fecha;


     public MovimientoDinero(long idMovimientoDinero, float montoMovimiento, String conceptoMovimiento, Empleado empleado, Empresa empresa, List<Producto> productos, Date fecha) {
         this.idMovimientoDinero = idMovimientoDinero;
         this.montoMovimiento = montoMovimiento;
         this.conceptoMovimiento = conceptoMovimiento;
         this.empleado = empleado;
         this.empresa = empresa;
         this.productos = productos;
         this.fecha = fecha;
     }

     public MovimientoDinero() {
    }


    public long getIdMovimientoDinero() {
         return idMovimientoDinero;
     }

     public void setIdMovimientoDinero(long idMovimientoDinero) {
         this.idMovimientoDinero = idMovimientoDinero;
    }

     public float getMontoMovimiento() {
         return montoMovimiento;
     }

    public void setMontoMovimiento(float montoMovimiento) {
         this.montoMovimiento = montoMovimiento;
     }

     public String getConceptoMovimiento() {
         return conceptoMovimiento;
     }

     public void setConceptoMovimiento(String conceptoMovimiento) {
         this.conceptoMovimiento = conceptoMovimiento;
     }

     public Empleado getEmpleado() {
         return empleado;
     }

     public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
     }

     public Empresa getEmpresa() {
         return empresa;
     }

     public void setEmpresa(Empresa empresa) {
         this.empresa = empresa;
    }

     public List<Producto> getProductos() {
         return productos;
     }

     public void setProductos(List<Producto> productos) {
         this.productos = productos;
     }

     public Date getFecha() {
         return fecha;
     }

     public void setFecha(Date fecha) {
         this.fecha = fecha;
     }

     @Override
     public String toString() {
         return "MovimientoDinero{" +
                 "idMovimientoDinero=" + idMovimientoDinero +
                 ", montoMovimiento=" + montoMovimiento +
                 ", conceptoMovimiento='" + conceptoMovimiento + '\'' +
                 ", empleado=" + empleado +
                 ", empresa=" + empresa +
                 ", productos=" + productos +
                 ", fecha=" + fecha +
                 '}';
     }
 }