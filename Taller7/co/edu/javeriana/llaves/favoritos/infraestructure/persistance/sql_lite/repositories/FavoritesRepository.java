package co.edu.javeriana.llaves.favoritos.infraestructure.persistance.sql_lite.repositories;

import co.edu.javeriana.llaves.favoritos.core.domain.entities.FavoritesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface FavoritesRepository extends JpaRepository<FavoritesEntity, String> {
    Optional<FavoritesEntity> findByUserIdAndKey(String userId, String key);
    List<FavoritesEntity> findAllByUserId(String userId);
}