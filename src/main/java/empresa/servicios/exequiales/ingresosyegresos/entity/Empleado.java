package empresa.servicios.exequiales.ingresosyegresos.entity;

public class Empleado {

    private long idEmpleado; // variable de tipo objeto
    private String documento;
    private String nombreEmpleado;
    private String correo;
    private String direccion;
    private String telefono;
    private String empresa;
    private Rol rol;
    private boolean estado;

    public Empleado(long idEmpleado, String documento, String nombreEmpleado, String correo, String direccion, String telefono, String empresa, Rol rol, boolean estado) {
        this.idEmpleado = idEmpleado;
        this.documento = documento;
        this.nombreEmpleado = nombreEmpleado;
        this.correo = correo;
        this.direccion = direccion;
        this.telefono = telefono;
        this.empresa = empresa;
        this.rol = rol;
        this.estado = estado;
    }

    public long getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(long idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "idEmpleado=" + idEmpleado +
                ", documento='" + documento + '\'' +
                ", nombreEmpleado='" + nombreEmpleado + '\'' +
                ", correo='" + correo + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                ", empresa='" + empresa + '\'' +
                ", rol=" + rol +
                ", estado=" + estado +
                '}';
    }
}
