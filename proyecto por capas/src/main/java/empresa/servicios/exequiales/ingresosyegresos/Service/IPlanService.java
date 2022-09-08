package empresa.servicios.exequiales.ingresosyegresos.Service;

import empresa.servicios.exequiales.ingresosyegresos.entity.Plan;

import java.util.List;

public interface IPlanService {

    public Plan findById(int id);
    public List<Plan> findAll();
    public Plan creatPlan(Plan plan);
    public Plan updatePlan(int id, Plan plan);
    public void deletPlan(int id);
}
