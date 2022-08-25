package empresa.servicios.exequiales.ingresosyegresos.entity;

public class TipoDocumento {
    private long idTipoDocumento;
    private String descripcion;
    private String siglas;
    private boolean estado;

    public TipoDocumento() {
    }

    public long getIdTipoDocumento() {
        return this.idTipoDocumento;
    }

    public void setIdTipoDocumento(long idTipoDocumento) {
        this.idTipoDocumento = idTipoDocumento;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getSiglas() {
        return this.siglas;
    }

    public void setSiglas(String siglas) {
        this.siglas = siglas;
    }

    public boolean isEstado() {
        return this.estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String toString() {
        return "TipoDocumento{idTipoDocumento=" + this.idTipoDocumento + ", descripcion='" + this.descripcion + "', siglas='" + this.siglas + "', estado=" + this.estado + "}";
    }
}
