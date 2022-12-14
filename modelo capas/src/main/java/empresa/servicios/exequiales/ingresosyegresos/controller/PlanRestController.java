package empresa.servicios.exequiales.ingresosyegresos.controller;

import empresa.servicios.exequiales.ingresosyegresos.Service.IPlanService;
import empresa.servicios.exequiales.ingresosyegresos.entity.Plan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")

public class PlanRestController {
    @Autowired
    private IPlanService planService;

    @GetMapping("/plans/{id}")
    public Plan findById(@PathVariable int id) { return planService.findById(id);  }

    @GetMapping("/plans")
    public List<Plan> findAll(){ return planService.findAll(); }

    @PostMapping("/plans")
    public Plan createPlan(@RequestBody Plan plan){ return planService.creatPlan(plan); }

    @PatchMapping("/plans/{id}")
    public Plan updatePlan(@PathVariable int id, @RequestBody Plan plan){ return planService.updatePlan(id, plan);}

    @DeleteMapping("/plans/{id}")
    public void deletPlan(@PathVariable int id) { planService.deletPlan(id); }
}
