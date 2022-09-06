package empresa.servicios.exequiales.ingresosyegresos.Service;

import empresa.servicios.exequiales.ingresosyegresos.entity.Rol;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class RolService implements IRolService {

    @Override
    public Rol findById(int id) {
        Rol rol = new Rol();
        rol.setIdRol(id);
        rol.setDescripcion("Admin");
        rol.setEstado(true);
        return rol;
    }

    @Override
    public List<Rol> findAll() {
        List<Rol> roles = new ArrayList<Rol>();
        Rol rol1 = new Rol();
        rol1.setIdRol(1);
        rol1.setDescripcion("Admin");
        rol1.setEstado(true);
        roles.add(rol1);

        Rol rol2 = new Rol();
        rol2.setIdRol(2);
        rol2.setDescripcion("User");
        rol2.setEstado(true);
        roles.add(rol2);
        return roles;
    }

    @Override
    public Rol createRol(Rol rol) {
        Rol createRol = new Rol();
        createRol.setIdRol(rol.getIdRol());
        createRol.setDescripcion(rol.getDescripcion());
        createRol.setEstado(rol.isEstado());
        return createRol;
    }

    @Override
    public Rol updateRol(int id, Rol rol) {
        Rol patchrol = findById(id);
        patchrol.setIdRol(rol.getIdRol());
        patchrol.setDescripcion(rol.getDescripcion());
        patchrol.setEstado(rol.isEstado());
        return patchrol;
    }

    @Override
    public void deletRol(int id) {
        Rol deletRol = findById(id);
    }
}