package moomoo.springframework.moomooPetClinic.services.maps;

import moomoo.springframework.moomooPetClinic.model.Pet;
import moomoo.springframework.moomooPetClinic.services.CrudService;

import java.util.Set;

public class PetServiceMap extends AbstractMapService<Pet,Long> implements CrudService<Pet,Long> {
    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public Pet findByID(Long object) {
        return super.findById(object);
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object.getId(),object);
    }

    @Override
    public void deleteByID(Long object) {
        super.deleteById(object);
    }
    @Override
    public void delete(Pet object) {
        super.delete(object);
    }
}
