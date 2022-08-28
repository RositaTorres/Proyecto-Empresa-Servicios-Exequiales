package empresa.servicios.exequiales.ingresosyegresos.entity;

public class MovimientoDinero {

    private long idMovimientoDinero;
    private float montoMovimiento;
    private String conceptoMovimiento;
    private Empleado empleado;

    public MovimientoDinero(long idMovimientoDinero, float montoMovimiento, String conceptoMovimiento, Empleado empleado) {
        this.idMovimientoDinero = idMovimientoDinero;
        this.montoMovimiento = montoMovimiento;
        this.conceptoMovimiento = conceptoMovimiento;
        this.empleado = empleado;
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

    @Override
    public String toString() {
        return "MovimientoDinero{" +
                "idMovimientoDinero=" + idMovimientoDinero +
                ", montoMovimiento=" + montoMovimiento +
                ", conceptoMovimiento='" + conceptoMovimiento + '\'' +
                ", empleado=" + empleado +
                '}';
    }
}
