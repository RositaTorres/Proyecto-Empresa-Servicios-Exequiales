package empresa.servicios.exequiales.ingresosyegresos.Service;

import empresa.servicios.exequiales.ingresosyegresos.entity.Rol;

import java.util.List;

public interface IRolService {

    public Rol findById(int id);

    public List<Rol> findAll();

    public Rol createRol(Rol rol);

    public Rol updateRol(int id, Rol rol);

    public void deletRol(int id);
}
