package servicios.exequiales.ingresosyegresos.ingresos_egresos.entity;


import javax.persistence.*;

@Entity
@Table(name="movimientos")
public class MovimientoDinero {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_movimiento", nullable = false)
    private long idMovimientoDinero;
    @Column(name = "monto", nullable = false)
    private float montoMovimiento;
    @Column(name = "concepto", nullable = false)
    private String conceptoMovimiento;
    @ManyToOne
    @JoinColumn(name = "id_empleado")
    private Empleado empleado;

    @ManyToOne
    @JoinColumn(name = "id_empresa")
    private Empresa empresa;
    @ManyToMany
    @JoinColumn(name = "id_producto")
    private Producto producto;

//    public MovimientoDinero(long idMovimientoDinero, float montoMovimiento, String conceptoMovimiento, Empleado empleado, Empresa empresa, Producto producto) {
//        this.idMovimientoDinero = idMovimientoDinero;
//        this.montoMovimiento = montoMovimiento;
//        this.conceptoMovimiento = conceptoMovimiento;
//        this.empleado = empleado;
//        this.empresa = empresa;
//        this.producto = producto;
//    }
//
//    public MovimientoDinero() {
//    }

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

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    @Override
    public String toString() {
        return "MovimientoDinero{" +
                "idMovimientoDinero=" + idMovimientoDinero +
                ", montoMovimiento=" + montoMovimiento +
                ", conceptoMovimiento='" + conceptoMovimiento + '\'' +
                ", empleado=" + empleado +
                ", empresa=" + empresa +
                ", producto=" + producto +
                '}';
    }
}