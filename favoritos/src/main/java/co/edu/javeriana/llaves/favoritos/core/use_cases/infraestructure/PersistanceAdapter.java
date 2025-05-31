package co.edu.javeriana.llaves.favoritos.core.use_cases.infraestructure;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PersistanceAdapter<T> {

    void save(T entity);

    <T> T findById(Class<T> entityClass, String id);

    void delete(T entity);

    <T> List<T> findAll();

    void update(T entity);
}
