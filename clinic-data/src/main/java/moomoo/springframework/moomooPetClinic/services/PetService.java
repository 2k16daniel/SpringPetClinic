package moomoo.springframework.moomooPetClinic.services;

import moomoo.springframework.moomooPetClinic.model.Pet;

import java.util.Set;

public interface PetService {
    Pet findById(Long id);
    Pet save(Pet pet);
    Set<Pet> findAll();
}
