package servicios.exequiales.ingresosyegresos.ingresos_egresos.Service;

import servicios.exequiales.ingresosyegresos.ingresos_egresos.entity.Plan;

import java.util.List;

public interface IPlanService {

    public Plan findById(int id);
    public List<Plan> findAll();
    public Plan creatPlan(Plan plan);
    public Plan updatePlan(int id, Plan plan);
    public void deletPlan(int id);
}
