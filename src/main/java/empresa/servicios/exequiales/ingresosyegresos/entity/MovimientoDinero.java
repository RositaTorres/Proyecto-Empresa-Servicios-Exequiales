package empresa.servicios.exequiales.ingresosyegresos.entity;

public class MovimientoDinero {

    private long idMovimientoDinero;
    private long montoMovimiento;
    private long montos;
    private String conceptoMovimiento;
    private Usuario usuario;

    public long getIdMovimientoDinero() {
        return idMovimientoDinero;
    }

    public void setIdMovimientoDinero(long idMovimientoDinero) {
        this.idMovimientoDinero = idMovimientoDinero;
    }

    public long getMontoMovimiento() {
        return montoMovimiento;
    }

    public void setMontoMovimiento(long montoMovimiento) {
        this.montoMovimiento = montoMovimiento;
    }

    public long getMontos() {
        return montos;
    }

    public void setMontos(long montos) {
        this.montos = montos;
    }

    public String getConceptoMovimiento() {
        return conceptoMovimiento;
    }

    public void setConceptoMovimiento(String conceptoMovimiento) {
        this.conceptoMovimiento = conceptoMovimiento;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "MovimientoDinero{" +
                "idMovimientoDinero=" + idMovimientoDinero +
                ", montoMovimiento=" + montoMovimiento +
                ", montos=" + montos +
                ", conceptoMovimiento='" + conceptoMovimiento + '\'' +
                ", usuario=" + usuario +
                '}';
    }
}
