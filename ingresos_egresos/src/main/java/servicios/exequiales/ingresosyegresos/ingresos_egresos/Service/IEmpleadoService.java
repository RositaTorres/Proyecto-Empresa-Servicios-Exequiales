package servicios.exequiales.ingresosyegresos.ingresos_egresos.Service;

import servicios.exequiales.ingresosyegresos.ingresos_egresos.entity.Empleado;

import java.util.List;

public interface IEmpleadoService {

    public Empleado findById(int id);
    public List<Empleado> findAll();
    public Empleado createEmpleado(Empleado empleado);
    public Empleado updateEmpleado(int id, Empleado empleado);
    public void deletEmpleado(long id);

}
