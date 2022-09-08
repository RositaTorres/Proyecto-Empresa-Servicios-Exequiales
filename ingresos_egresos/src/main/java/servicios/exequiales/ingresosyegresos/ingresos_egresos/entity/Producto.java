package servicios.exequiales.ingresosyegresos.ingresos_egresos.entity;

public class Producto {

    public long idProducto;
    public String nombreProducto;
    public float valorProducto;
    public boolean estadoProducto;

    public Producto(long idProducto, String nombreProducto, float valorProducto, boolean estadoProducto) {
        this.idProducto = idProducto;
        this.nombreProducto = nombreProducto;
        this.valorProducto = valorProducto;
        this.estadoProducto = estadoProducto;
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

    @Override
    public String toString() {
        return "Producto{" +
                "idProducto=" + idProducto +
                ", nombreProducto='" + nombreProducto + '\'' +
                ", valorProducto=" + valorProducto +
                ", estadoProducto=" + estadoProducto +
                '}';
    }
}
