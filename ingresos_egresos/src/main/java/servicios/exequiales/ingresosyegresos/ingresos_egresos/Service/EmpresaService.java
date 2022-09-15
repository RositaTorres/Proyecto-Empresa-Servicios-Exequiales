package servicios.exequiales.ingresosyegresos.ingresos_egresos.Service;

import org.springframework.beans.factory.annotation.Autowired;
import servicios.exequiales.ingresosyegresos.ingresos_egresos.entity.Empresa;
import org.springframework.stereotype.Service;
import servicios.exequiales.ingresosyegresos.ingresos_egresos.repository.IEmpresaRepository;

import java.util.List;
import java.util.Optional;

@Service
public class EmpresaService implements IEmpresaService {

    @Autowired
    private IEmpresaRepository empresaRepository;
    @Override
    public Empresa findById(long id) {
        Optional<Empresa> empresa = empresaRepository.findById((long) id);
        return empresa.get();
    }

    @Override
    public List<Empresa> findAll() {
        List<Empresa> empresas = (List<Empresa>) empresaRepository.findAll();
        return empresas;
    }

    @Override
    public Empresa createEmpresa(Empresa empresa) {
        return empresaRepository.save(empresa);
    }

    @Override
    public Empresa updateEmpresa(int id, Empresa empresa) {
        return empresaRepository.save(empresa);
    }

    @Override
    public void deleteEmpresa(long id) {
        empresaRepository.deleteById((long)id);
    }

}
