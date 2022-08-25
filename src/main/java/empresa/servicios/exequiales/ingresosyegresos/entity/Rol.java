package empresa.servicios.exequiales.ingresosyegresos.entity;

public class Rol {
    private long idRol;
    private String descripcion;
    private boolean estado;

    public Rol() {
    }

    public long getIdRol() {
        return this.idRol;
    }

    public void setIdRol(long idRol) {
        this.idRol = idRol;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isEstado() {
        return this.estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String toString() {
        return "Rol{idRol=" + this.idRol + ", descripcion='" + this.descripcion + "', estado=" + this.estado + "}";
    }
}