package empresa.servicios.exequiales.ingresosyegresos.entity;

public class Plan {

    public long idPlan;
    public String   nombrePlan;
    public boolean estadoPlan;
    public String nombreproducto;
    public float valorProducto;

    public Plan(long idPlan, String nombrePlan, boolean estadoPlan, String nombreproducto, float valorProducto) {
        this.idPlan = idPlan;
        this.nombrePlan = nombrePlan;
        this.estadoPlan = estadoPlan;
        this.nombreproducto = nombreproducto;
        this.valorProducto = valorProducto;
    }

    public Plan() {

    }

    public long getIdPlan() {
        return idPlan;
    }

    public void setIdPlan(int idPlan) {
        this.idPlan = idPlan;
    }

    public String getNombrePlan() {
        return nombrePlan;
    }

    public void setNombrePlan(String nombrePlan) {
        this.nombrePlan = nombrePlan;
    }

    public boolean isEstadoPlan() {
        return estadoPlan;
    }

    public void setEstadoPlan(boolean estadoPlan) {
        this.estadoPlan = estadoPlan;
    }

    public String getNombreproducto() {
        return nombreproducto;
    }

    public void setNombreproducto(String nombreproducto) {
        this.nombreproducto = nombreproducto;
    }

    public float getValorProducto() {
        return valorProducto;
    }

    public void setValorProducto(float valorProducto) {
        this.valorProducto = valorProducto;
    }

    @Override
    public String toString() {
        return "Plan{" +
                "idPlan=" + idPlan +
                ", nombrePlan='" + nombrePlan + '\'' +
                ", estadoPlan=" + estadoPlan +
                ", nombreproducto='" + nombreproducto + '\'' +
                ", valorProducto=" + valorProducto +
                '}';
    }
}
