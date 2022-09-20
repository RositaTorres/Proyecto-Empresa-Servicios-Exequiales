package servicios.exequiales.ingresosyegresos.ingresos_egresos.entity;

import javax.persistence.*;
@Entity
@Table(name = "empresas")
public class Empresa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_empresa", nullable = false)
    private long idEmpresa; // variable de tipo objeto
    @javax.validation.constraints.NotEmpty
    @Column(name = "documento_nit", unique = true)
    private String nit;
    @javax.validation.constraints.NotEmpty
    @Column(name = "nombre_empresa", nullable = false)
    private String nombreEmpresa;
    @javax.validation.constraints.NotEmpty
    @Column(name = "direccion", nullable = false)
    private String direccion;
    @javax.validation.constraints.NotEmpty
    @Column(name = "telefono_empresa", nullable = false)
    private String telefono;

    @Column(name = "estado", nullable = false)
    private boolean estado;


    public Empresa(long idEmpresa, String nit, String nombreEmpresa, String direccion, String telefono, boolean estado) {
        this.idEmpresa = idEmpresa;
        this.nit = nit;
        this.nombreEmpresa = nombreEmpresa;
        this.direccion = direccion;
        this.telefono = telefono;
        this.estado = estado;
    }

    public Empresa() {

    }
    public long getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(long idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
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

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }


    @Override
    public String toString() {
        return "Empresa{" +
                "idEmpresa=" + idEmpresa +
                ", nit='" + nit + '\'' +
                ", nombreEmpresa='" + nombreEmpresa + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                ", estado=" + estado +
                '}';
    }
}
