package servicios.exequiales.ingresosyegresos.ingresos_egresos.Service;

import servicios.exequiales.ingresosyegresos.ingresos_egresos.entity.Empresa;

import java.util.List;

public interface IEmpresaService {

    public Empresa findById(long id);
    public List<Empresa> findAll();
    public Empresa createEmpresa(Empresa empresa);
    public Empresa updateEmpresa(int id, Empresa empresa);
    public void deleteEmpresa(long id);
}
