package servicios.exequiales.ingresosyegresos.ingresos_egresos.Service;

import servicios.exequiales.ingresosyegresos.ingresos_egresos.entity.Empresa;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmpresaService implements IEmpresaService {
    @Override
    public Empresa findById(int id) {
        Empresa empresa = new Empresa();
        empresa.setIdEmpresa(id);
        empresa.setNit("80889956-9");
        empresa.setNombreEmpresa("Exequiales Escocia SAS");
        empresa.setDireccion("Cll 45 con 23 Esquina");
        empresa.setTelefono("24658936");
        empresa.setEstado(false);
        return empresa;
    }

    @Override
    public List<Empresa> findAll() {
        List<Empresa> empresas = new ArrayList<Empresa>();
        Empresa empresa1 = new Empresa();
        empresa1.setIdEmpresa(1);
        empresa1.setNit("80889956-9");
        empresa1.setNombreEmpresa("Exequiales Escocia SAS");
        empresa1.setDireccion("Cll 45 con 23 Esquina");
        empresa1.setTelefono("24658936");
        empresa1.setEstado(false);
        empresas.add(empresa1);

        Empresa empresa2 = new Empresa();
        empresa2.setIdEmpresa(2);
        empresa2.setNit("808568956-9");
        empresa2.setNombreEmpresa("Exequiales Martinez");
        empresa2.setDireccion("Cra. 123 NO. 25-14");
        empresa2.setTelefono("2568965");
        empresa2.setEstado(false);
        empresas.add(empresa2);
        return empresas;
    }

    @Override
    public Empresa createEmpresa(Empresa empresa) {
        Empresa creatempresa = new Empresa();
        creatempresa.setNit(empresa.getNit());
        creatempresa.setNombreEmpresa(empresa.getNombreEmpresa());
        creatempresa.setDireccion(empresa.getDireccion());
        creatempresa.setTelefono(empresa.getTelefono());
        creatempresa.setEstado(empresa.isEstado());
        return creatempresa;
    }

    @Override
    public Empresa updateEmpresa(int id, Empresa empresa) {
        Empresa patchempresa = findById(id);
        patchempresa.setNit(empresa.getNit());
        patchempresa.setNombreEmpresa(empresa.getNombreEmpresa());
        patchempresa.setDireccion(empresa.getDireccion());
        patchempresa.setTelefono(empresa.getTelefono());
        patchempresa.setEstado(empresa.isEstado());
        return patchempresa;
    }

    @Override
    public void deletEmpresa(int id) {
        Empresa deletEmpresa = findById(id);
    }

}
