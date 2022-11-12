package moomoo.springframework.moomooPetClinic.services.maps;

import moomoo.springframework.moomooPetClinic.model.Vet;
import moomoo.springframework.moomooPetClinic.services.CrudService;

import java.util.Set;

public class VetServiceMap extends AbstractMapService<Vet,Long> implements CrudService<Vet,Long> {
    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet findByID(Long object) {
        return super.findById(object);
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object.getId(),object);
    }

    @Override
    public void deleteByID(Long object) {
        super.deleteById(object);
    }
    @Override
    public void delete(Vet object) {
        super.delete(object);
    }
}
