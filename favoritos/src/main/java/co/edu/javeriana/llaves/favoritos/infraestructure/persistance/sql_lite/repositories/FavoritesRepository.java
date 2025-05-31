package co.edu.javeriana.llaves.favoritos.infraestructure.persistance.sql_lite.repositories;

import co.edu.javeriana.llaves.favoritos.infraestructure.persistance.sql_lite.entities.Favorites;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FavoritesRepository extends JpaRepository<Favorites, String> {
}
