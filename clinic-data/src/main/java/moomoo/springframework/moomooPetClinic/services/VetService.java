package moomoo.springframework.moomooPetClinic.services;

import moomoo.springframework.moomooPetClinic.model.Vet;

public interface VetService extends CrudService<Vet,Long>{
    Vet findByLastName(String lastname);
}
