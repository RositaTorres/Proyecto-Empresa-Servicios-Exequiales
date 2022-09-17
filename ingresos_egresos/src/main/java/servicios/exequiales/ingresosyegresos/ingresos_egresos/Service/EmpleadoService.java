package servicios.exequiales.ingresosyegresos.ingresos_egresos.Service;

import org.springframework.beans.factory.annotation.Autowired;
import servicios.exequiales.ingresosyegresos.ingresos_egresos.entity.Empleado;
import org.springframework.stereotype.Service;
import servicios.exequiales.ingresosyegresos.ingresos_egresos.repository.IEmpleadoRepository;


import java.util.List;
import java.util.Optional;

@Service
public class EmpleadoService implements IEmpleadoService {

    @Autowired
    private IEmpleadoRepository empleadoRepository;

    @Override
    public Empleado findById(long id) {
        Optional<Empleado> empleado = empleadoRepository.findById(id);
        return empleado.get();
    }

    @Override
    public List<Empleado> findAll() {
        List<Empleado> empleados = (List<Empleado>) empleadoRepository.findAll();
        return empleados;
    }


    @Override
    public Empleado createEmpleado(Empleado empleado) {
        return empleadoRepository.save(empleado);
    }

    @Override
    public Empleado updateEmpleado(int id, Empleado empleado) {
        return empleadoRepository.save(empleado);
    }

    @Override
    public void deletEmpleado(long id) {
        empleadoRepository.deleteById(id);
    }


}
