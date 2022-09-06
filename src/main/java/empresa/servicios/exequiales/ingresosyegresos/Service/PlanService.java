package empresa.servicios.exequiales.ingresosyegresos.Service;

import empresa.servicios.exequiales.ingresosyegresos.entity.Plan;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PlanService implements IPlanService{

    @Override
    public Plan findById(int id) {
        Plan plan = new Plan();
        plan.setIdPlan(id);
        plan.setNombrePlan("Basico Cundinamarca");
        plan.setEstadoPlan(true);
        return plan;
    }

    @Override
    public List<Plan> findAll() {
        List<Plan> planes = new ArrayList<Plan>();
        Plan plan1 = new Plan();
        plan1.setIdPlan(1);
        plan1.setNombrePlan("Basico Cundinamarca");
        plan1.setEstadoPlan(true);
        planes.add(plan1);

        Plan plan2 = new Plan();
        plan2.setIdPlan(2);
        plan2.setNombrePlan("Basico Cundinamarca");
        plan2.setEstadoPlan(true);
        planes.add(plan2);
        return planes;
    }

    @Override
    public Plan creatPlan(Plan plan) {
        Plan creatPlan = new Plan();
        creatPlan.setNombrePlan(plan.getNombrePlan());
        creatPlan.setEstadoPlan(plan.isEstadoPlan());
        return creatPlan;
    }

    @Override
    public Plan updatePlan(int id, Plan plan) {
        Plan patchplan = findById(id);
        patchplan.setNombrePlan(plan.getNombrePlan());
        patchplan.setEstadoPlan(plan.isEstadoPlan());
        return patchplan;
    }

    @Override
    public void deletPlan(int id) { Plan deletPlan = findById(id); }
}
