package servicios.exequiales.ingresosyegresos.ingresos_egresos.entity;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
@Table(name = "empleados")
public class Empleado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_empleado", nullable = false)
    private long idEmpleado; // variable de tipo objeto

    @javax.validation.constraints.NotEmpty
    @Column(name = "documento", unique = true)
    private String documento;
    @javax.validation.constraints.NotEmpty
    @Column(name = "nombre",nullable = false)
    private String nombre;
    @Pattern(regexp = "[a-zA-Z0-9!#$%&'*_+-]([\\.]?[a-zA-Z0-9!#$%&'*_+-])+@[a-zA-Z0-9]([^@&%$\\/()=?¿!.,:;]|\\d)+[a-zA-Z0-9][\\.][a-zA-Z]{2,4}([\\.][a-zA-Z]{2})?" ,message = "Debe ser un correo electrónico válido")
    @Column(name = "correo", nullable = false)
    private String correo;
    @javax.validation.constraints.NotEmpty
    @Column(name = "direccion", nullable = false)
    private String direccion;
    @javax.validation.constraints.NotEmpty
    @Column(name = "telefono", nullable = false)
    private String telefono;
    @NotNull
    @ManyToOne
    @JoinColumn(name = "id_rol")
    private Rol rol;
    @NotNull
    @Column(name = "area_empleado")
    private AreaEmpleado areaEmpleado;

    @Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[$@$!%*?&])([A-Za-z\\d$@$!%*?&]|[^ ]){8,15}$" , message = "La contraseña debe contener minimo 8 caracteres, máximo 15, una letra mayúscula, una letra minuscula, un número, un caracter especial y sin espacios en blanco")
    @Column(name = "clave", nullable = false)
    private String clave;

    @Column(name = "estado")
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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
      @Override
    public String toString() {
        return "Empleado{" +
                "idEmpleado=" + idEmpleado +
                ", documento='" + documento + '\'' +
                ", nombre='" + nombre + '\'' +
                ", correo='" + correo + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                ", rol=" + rol +
                ", areaEmpleado=" + areaEmpleado +
                ", clave='" + clave + '\'' +
                ", estado=" + estado +
                '}';
    }
}
