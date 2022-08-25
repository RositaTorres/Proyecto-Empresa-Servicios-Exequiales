package empresa.servicios.exequiales.ingresosyegresos.entity;

public class Empleado {

    private long idEmpleado; // variable de tipo objeto
    private String documento;
    private String nombreEmpleado;
    private String direccion;
    private String telefono;
    private boolean estado;

    public Empleado(long idEmpleado, String documento, String nombreEmpleado, String direccion, String telefono, boolean estado) {

        this.idEmpleado = idEmpleado;
        this.documento = documento;
        this.nombreEmpleado = nombreEmpleado;
        this.direccion = direccion;
        this.telefono = telefono;
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
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                ", estado=" + estado +
                '}';
    }
}
