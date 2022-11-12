package moomoo.springframework.moomooPetClinic.services;

import moomoo.springframework.moomooPetClinic.model.Owner;

public interface OwnerService extends CrudService<Owner,Long> {
    Owner findByLastName(String lastname);
}
