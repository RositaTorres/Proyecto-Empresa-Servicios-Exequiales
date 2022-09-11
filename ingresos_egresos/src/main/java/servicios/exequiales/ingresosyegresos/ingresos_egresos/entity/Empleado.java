package servicios.exequiales.ingresosyegresos.ingresos_egresos.entity;

import javax.persistence.*;

@Entity
@Table(name = "empleados")
public class Empleado {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "id_empleado", nullable = false)
    private long idEmpleado; // variable de tipo objeto

    @Column(name = "ducumento", unique = true)
    private String documento;
    @Column(name = "nombre_empleado")
    private String nombreEmpleado;
    @ManyToOne
    @JoinColumn(name = "id_empresa", nullable = false)
    private Empresa empresa;
    @Column(name = "correo")
    private String correo;
    @Column(name = "direccion")
    private String direccion;
    @Column(name = "telefono")
    private String telefono;
    @ManyToOne
    @JoinColumn(name = "id_rol", nullable = false)
    private Rol rol;
    @Column(name = "area_empleado")
    private AreaEmpleado areaEmpleado;
    @Column(name = "estado", nullable = false)
    private boolean estado;


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

    public AreaEmpleado getAreaEmpleado() {
        return areaEmpleado;
    }

    public void setAreaEmpleado(AreaEmpleado areaEmpleado) {
        this.areaEmpleado = areaEmpleado;
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
                ", areaEmpleado=" + areaEmpleado +
                ", estado=" + estado +
                '}';
    }
}
