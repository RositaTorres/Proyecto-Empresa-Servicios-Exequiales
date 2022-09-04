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
        empleado.setEmpresa(new Empresa());
        empleado.setDocumento("10306546798");
        empleado.setNombreEmpleado("Pepito Perez");
        empleado.setDireccion("Avenida 5 # 10-40");
        empleado.setCorreo("Pepito.1@correo.com");
        empleado.setTelefono("323450678");
        empleado.setRol(new Rol());
        empleado.setEstado(false);
        return empleado;
    }

    @Override
    public List<Empleado> findAll() {
        List<Empleado> empleados = new ArrayList<Empleado>();
        Empleado empleado1 = new Empleado();
        empleado1.setIdEmpleado(1);
        empleado1.setEmpresa(new Empresa());
        empleado1.setDocumento("10306546798");
        empleado1.setNombreEmpleado("Pepito Perez");
        empleado1.setDireccion("Avenida 5 # 10-40");
        empleado1.setTelefono("323450678");
        empleado1.setCorreo("Pepito.1@correo.com");
        empleado1.setRol(new Rol());
        empleado1.setEstado(true);
        empleados.add(empleado1);

        Empleado empleado2 = new Empleado();
        empleado2.setIdEmpleado(2);
        empleado2.setEmpresa(new Empresa());
        empleado2.setDocumento("104567983");
        empleado2.setNombreEmpleado("Lucas Martinez");
        empleado2.setDireccion("Cll. 69a NO. 43-14");
        empleado2.setTelefono("3124567894");
        empleado2.setCorreo("Pepito.1@correo.com");
        empleado2.setRol(new Rol());
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
