package moomoo.springframework.moomooPetClinic.services;

import java.util.Set;

public interface CrudService<T, ID> {
    Set<T> findAll();
    public T findByID(ID object);
    public T save(T object);
    void delete();
    void deleteByID(ID object);

}
