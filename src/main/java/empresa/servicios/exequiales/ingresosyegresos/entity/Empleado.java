package empresa.servicios.exequiales.ingresosyegresos.entity;

import javax.persistence.*;

@Entity
@Table(name = "empleados")
public class Empleado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_empleado")
    private long idEmpleado; // variable de tipo objeto
    @Column(name = "documento", unique = true)
    private String documento;
    @Column(name = "nombre_empleado")
    private String nombreEmpleado;
    @ManyToOne
    @JoinColumn(name = "id_empresa")
    private Empresa empresa;
    @Column(name = "correo", nullable = false)
    private String correo;
    @Column(name = "direccion")
    private String direccion;
    @Column(name = "telefono")
    private String telefono;
    @ManyToOne
    @JoinColumn(name = "id_rol")
    private Rol rol;
    @Column(name = "estado")
    private boolean estado;

    public Empleado(long idEmpleado, String documento, String nombreEmpleado, Empresa empresa, String correo, String direccion, String telefono, Rol rol, boolean estado) {
        this.idEmpleado = idEmpleado;
        this.documento = documento;
        this.nombreEmpleado = nombreEmpleado;
        this.empresa = empresa;
        this.correo = correo;
        this.direccion = direccion;
        this.telefono = telefono;
        this.rol = rol;
        this.estado = estado;
    }

    public Empleado() {
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

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
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
                ", empresa='" + empresa + '\'' +
                ", correo='" + correo + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                ", rol=" + rol +
                ", estado=" + estado +
                '}';
    }
}
