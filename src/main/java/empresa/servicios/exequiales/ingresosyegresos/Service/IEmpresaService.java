package empresa.servicios.exequiales.ingresosyegresos.Service;

import empresa.servicios.exequiales.ingresosyegresos.entity.Empresa;

import java.util.List;

public interface IEmpresaService {

    public Empresa findById(int id);
    public List<Empresa> findAll();
    public Empresa createEmpresa(Empresa empresa);
    public Empresa updateEmpresa(int id, Empresa empresa);
    public void deletEmpresa(int id);
}
