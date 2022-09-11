package servicios.exequiales.ingresosyegresos.ingresos_egresos.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "empresas")
public class Empresa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_empresa", nullable = false)
    private long idEmpresa; // variable de tipo objeto
    @Column(name = "documento_nit", unique = true)
    private String nit;
    @Column(name = "nombre_empresa")
    private String nombreEmpresa;
    @Column(name = "direccion", nullable = false)
    private String direccion;
    @Column(name = "telefono_empresa", nullable = false)
    private String telefono;

    @Column(name = "estado", nullable = false)
    private boolean estado;
    private List<MovimientoDinero> lineas = new ArrayList<MovimientoDinero>();

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

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public List<MovimientoDinero> getLineas() {
        return lineas;
    }

    public void setLineas(List<MovimientoDinero> lineas) {
        this.lineas = lineas;
    }

    public void addLinea(MovimientoDinero linea) {
        this.lineas.add(linea);
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
                ", lineas=" + lineas +
                '}';
    }
}
