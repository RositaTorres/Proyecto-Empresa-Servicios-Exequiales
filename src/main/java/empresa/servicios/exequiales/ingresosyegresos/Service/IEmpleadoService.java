package empresa.servicios.exequiales.ingresosyegresos.Service;

import empresa.servicios.exequiales.ingresosyegresos.entity.Empleado;

import java.util.List;

public interface IEmpleadoService {

    public Empleado findById(int id);
    public List<Empleado> findAll();
    public Empleado createEmpleado(Empleado empleado);
    public Empleado updateEmpleado(int id, Empleado empleado);
    public void deleteEmpleado(int id);

}
