package co.edu.javeriana.llaves.favoritos.adapters.persistence;

import co.edu.javeriana.llaves.favoritos.core.domain.entities.FavoritesEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FavoritesRepository extends JpaRepository<FavoritesEntity, String> {
    boolean existsByKey(String key);  // You can define custom query methods if needed
    void deleteByKey(String key);
}