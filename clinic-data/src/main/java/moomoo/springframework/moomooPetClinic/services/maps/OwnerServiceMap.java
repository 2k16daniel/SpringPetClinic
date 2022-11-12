package moomoo.springframework.moomooPetClinic.services.maps;

import moomoo.springframework.moomooPetClinic.model.Owner;
import moomoo.springframework.moomooPetClinic.services.CrudService;

import java.util.Set;

public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements CrudService<Owner,Long> {

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public Owner findByID(Long object) {
        return super.findById(object);
    }

    @Override
    public Owner save(Owner object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Owner object) {
        super.delete(object);
    }

    @Override
    public void deleteByID(Long object) {
        super.deleteById(object);
    }

}
