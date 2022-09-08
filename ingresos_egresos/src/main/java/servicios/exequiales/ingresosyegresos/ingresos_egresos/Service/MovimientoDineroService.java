package servicios.exequiales.ingresosyegresos.ingresos_egresos.Service;

import servicios.exequiales.ingresosyegresos.ingresos_egresos.entity.*;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MovimientoDineroService implements IMovimientoDineroService {

    @Override
    public MovimientoDinero findById(int id) {
        MovimientoDinero movimiento = new MovimientoDinero();
        movimiento.setIdMovimientoDinero(id);
        movimiento.setMontoMovimiento(5000000);
        movimiento.setConceptoMovimiento("Venta plan Vida Enterna");
        return movimiento;
    }

    @Override
    public List<MovimientoDinero> findAll() {
        List<MovimientoDinero> movimientos = new ArrayList<MovimientoDinero>();
        MovimientoDinero movimiento1 = new MovimientoDinero();
        movimiento1.setIdMovimientoDinero(1);
        movimiento1.setMontoMovimiento(500000);
        movimiento1.setConceptoMovimiento("Venta Plan Basico Medellin");
        movimientos.add(movimiento1);
        Empresa empresa1 = new Empresa();
        empresa1.setIdEmpresa(1);
        empresa1.setNit("80889956-9");
        empresa1.setNombreEmpresa("Exequiales Escocia SAS");
        empresa1.setDireccion("Cll 45 con 23 Esquina");
        empresa1.setTelefono("24658936");
        empresa1.setEstado(false);
        Empleado empleado1 = new Empleado();
        empleado1.setEmpresa(empresa1);
        empleado1.setDocumento("10306546798");
        empleado1.setNombreEmpleado("Pepito Perez");
        empleado1.setDireccion("Avenida 5 # 10-40");
        empleado1.setTelefono("323450678");
        empleado1.setCorreo("Pepito.1@correo.com");
        Plan plan1 = new Plan();
        plan1.setIdPlan(1);
        plan1.setNombrePlan("Basico Cundinamarca");
        plan1.setEstadoPlan(true);
        Producto producto1 = new Producto();
        producto1.setIdProducto(1);
        producto1.setNombreProducto("Cofre Azul");
        producto1.setEstadoProducto(true);

        MovimientoDinero movimiento2 = new MovimientoDinero();
        movimiento2.setIdMovimientoDinero(2);
        movimiento2.setMontoMovimiento(2500000);
        movimiento2.setConceptoMovimiento("Venta Plan Basico Cali");
        movimientos.add(movimiento2);
        Empresa empresa2 = new Empresa();
        empresa2.setIdEmpresa(1);
        empresa2.setNit("80889956-9");
        empresa2.setNombreEmpresa("Exequiales Escocia SAS");
        empresa2.setDireccion("Cll 45 con 23 Esquina");
        empresa2.setTelefono("24658936");
        empresa2.setEstado(false);
        Empleado empleado2 = new Empleado();
        empleado2.setEmpresa(empresa2);
        empleado2.setDocumento("10306546798");
        empleado2.setNombreEmpleado("Lucas Martinez");
        empleado2.setDireccion("Cll. 69a NO. 43-14");
        empleado2.setTelefono("3124567894");
        empleado2.setCorreo("lucas.1@correo.com");
        Plan plan2 = new Plan();
        plan2.setIdPlan(1);
        plan2.setNombrePlan("Basico Cundinamarca");
        plan2.setEstadoPlan(true);
        Producto producto2 = new Producto();
        producto2.setIdProducto(1);
        producto2.setNombreProducto("Sala de velacion");
        producto2.setEstadoProducto(true);
        return movimientos;
    }

    @Override
    public MovimientoDinero creatMovimiento(MovimientoDinero movimiento) {
        MovimientoDinero creatMovimiento = new MovimientoDinero();
        creatMovimiento.setConceptoMovimiento(movimiento.getConceptoMovimiento());
        creatMovimiento.setMontoMovimiento(movimiento.getMontoMovimiento());
        return creatMovimiento;
    }

    @Override
    public MovimientoDinero updateMovimiento(int id, MovimientoDinero movimiento) {
        MovimientoDinero patchmovimiento = findById(id);
        patchmovimiento.setIdMovimientoDinero(movimiento.getIdMovimientoDinero());
        patchmovimiento.setConceptoMovimiento(movimiento.getConceptoMovimiento());
        patchmovimiento.setMontoMovimiento(movimiento.getMontoMovimiento());
        return patchmovimiento;
    }

    @Override
    public void deletMovimiento(int id) { MovimientoDinero deletMovimiento = findById(id);

    }
}
