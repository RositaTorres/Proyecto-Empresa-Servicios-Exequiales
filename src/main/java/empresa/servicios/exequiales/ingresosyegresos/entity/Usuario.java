package empresa.servicios.exequiales.ingresosyegresos.entity;

public class Usuario {
    private long idUsuario;
    private String nombre;
    private String apellido;
    private TipoDocumento tipoDocumento;
    private String cedula;
    private String correo;
    private String clave;
    private Rol rol;
    private boolean estado;

    public Usuario() {
    }

    public long getIdUsuario() {
        return this.idUsuario;
    }

    public void setIdUsuario(long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public TipoDocumento getTipoDocumento() {
        return this.tipoDocumento;
    }

    public void setTipoDocumento(TipoDocumento tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getCedula() {
        return this.cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getCorreo() {
        return this.correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getClave() {
        return this.clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public Rol getRol() {
        return this.rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public boolean isEstado() {
        return this.estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String toString() {
        return "Usuario{idUsuario=" + this.idUsuario + ", nombre='" + this.nombre + "', apellido='" + this.apellido + "', tipoDocumento=" + this.tipoDocumento + ", cedula='" + this.cedula + "', correo='" + this.correo + "', clave='" + this.clave + "', rol=" + this.rol + ", estado=" + this.estado + "}";
    }
}
