package persistencia.persistenceCollections;

import modelos.Mascota;
import persistencia.IMascotaPersistence;

import java.util.List;

public class MascotaPersistenceUseList implements IMascotaPersistence {
    @Override
    public void guardar(Mascota mascota) {
        bdMascota.add(mascota);
    }

    @Override
    public Mascota getMascota(int id) {
        return bdMascota.get(id);
    }

    @Override
    public Mascota getMascota(String nombre) {
        for (Mascota elemento : bdMascota) {
            if (elemento.getNombre().equals(nombre)) {
                return elemento;
            }
        }
        return null;
    }

    @Override
    public List<Mascota> getAllMascota() {
        return bdMascota;
    }

    @Override
    public void updateMascota(int id,Mascota mascota) {
        bdMascota.set(id, mascota);

    }

    @Override
    public void deleteMascota(int id) {
        bdMascota.remove(getMascota(id));

    }
}

