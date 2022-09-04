package empresa.servicios.exequiales.ingresosyegresos.Service;

import empresa.servicios.exequiales.ingresosyegresos.entity.Empleado;
import empresa.servicios.exequiales.ingresosyegresos.entity.Empresa;
import empresa.servicios.exequiales.ingresosyegresos.entity.Rol;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmpleadoService implements IEmpleadoService {

    @Override
    public Empleado findById(int id) {
        Empleado empleado = new Empleado();
        empleado.setIdEmpleado(id);
        Empresa empresa = new Empresa();
        empresa.setIdEmpresa(id);
        empresa.setNit("80889956-9");
        empresa.setNombreEmpresa("Exequiales Escocia SAS");
        empresa.setDireccion("Cll 45 con 23 Esquina");
        empresa.setTelefono("24658936");
        empresa.setEstado(false);
        empleado.setEmpresa(empresa);
        empleado.setDocumento("10306546798");
        empleado.setNombreEmpleado("Pepito Perez");
        empleado.setDireccion("Avenida 5 # 10-40");
        empleado.setCorreo("Pepito.1@correo.com");
        empleado.setTelefono("323450678");
        Rol rol = new Rol();
        rol.setIdRol(1);
        rol.setDescripcion("Admin");
        rol.setEstado(true);
        empleado.setRol(new Rol());
        empleado.setEstado(true);
        return empleado;
    }

    @Override
    public List<Empleado> findAll() {
        List<Empleado> empleados = new ArrayList<Empleado>();
        Empleado empleado1 = new Empleado();
        empleado1.setIdEmpleado(1);
        Empresa empresa1 = new Empresa();
        empresa1.setIdEmpresa(1);
        empresa1.setNit("80889956-9");
        empresa1.setNombreEmpresa("Exequiales Escocia SAS");
        empresa1.setDireccion("Cll 45 con 23 Esquina");
        empresa1.setTelefono("24658936");
        empresa1.setEstado(true);
        empleado1.setEmpresa(empresa1);
        empleado1.setDocumento("10306546798");
        empleado1.setNombreEmpleado("Pepito Perez");
        empleado1.setDireccion("Avenida 5 # 10-40");
        empleado1.setTelefono("323450678");
        empleado1.setCorreo("Pepito.1@correo.com");
        Rol rol1 = new Rol();
        rol1.setIdRol(1);
        rol1.setDescripcion("Admin");
        rol1.setEstado(true);
        empleado1.setRol(rol1);
        empleado1.setEstado(true);
        empleado1.setRol(new Rol());
        empleado1.setEstado(true);
        empleados.add(empleado1);

        Empleado empleado2 = new Empleado();
        empleado2.setIdEmpleado(2);
        Empresa empresa2 = new Empresa();
        empresa2.setIdEmpresa(2);
        empresa2.setNit("808568956-9");
        empresa2.setNombreEmpresa("Exequiales Martinez");
        empresa2.setDireccion("Cra. 123 NO. 25-14");
        empresa2.setTelefono("2568965");
        empresa2.setEstado(true);
        empleado2.setEmpresa(empresa2);
        empleado2.setDocumento("104567983");
        empleado2.setNombreEmpleado("Lucas Martinez");
        empleado2.setDireccion("Cll. 69a NO. 43-14");
        empleado2.setTelefono("3124567894");
        empleado2.setCorreo("Pepito.1@correo.com");
        Rol rol2 = new Rol();
        rol2.setIdRol(1);
        rol2.setDescripcion("User");
        rol2.setEstado(true);
        empleado2.setRol(rol2);
        empleado2.setEstado(true);
        empleados.add(empleado2);
        return empleados;
    }


    @Override
    public Empleado createEmpleado(Empleado empleado) {
        Empleado creatempleado = new Empleado();
        creatempleado.setDocumento(empleado.getDocumento());
        creatempleado.setNombreEmpleado(empleado.getNombreEmpleado());
        creatempleado.setDireccion(empleado.getDireccion());
        creatempleado.setTelefono(empleado.getTelefono());
        creatempleado.setEstado(empleado.isEstado());
        return creatempleado;
    }

    @Override
    public Empleado updateEmpleado(int id, Empleado empleado) {
        Empleado patchempleado = findById(id);
        patchempleado.setDocumento(empleado.getDocumento());
        patchempleado.setNombreEmpleado(empleado.getNombreEmpleado());
        patchempleado.setDireccion(empleado.getDireccion());
        patchempleado.setTelefono(empleado.getTelefono());
        patchempleado.setEstado(empleado.isEstado());
        return patchempleado;
    }

    @Override
    public void deletEmpleado(int id) {
        Empleado deletEmpleado = findById(id);
    }


}
