package moomoo.springframework.moomooPetClinic.services;

import moomoo.springframework.moomooPetClinic.model.Vet;

import java.util.Set;

public interface VetService {
    Vet findById(Long id);
    Vet save(Vet owner);
    Set<Vet> findAll();
}
