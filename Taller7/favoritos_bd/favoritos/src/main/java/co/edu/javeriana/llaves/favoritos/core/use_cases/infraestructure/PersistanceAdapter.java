package co.edu.javeriana.llaves.favoritos.core.use_cases.infraestructure;

import co.edu.javeriana.llaves.favoritos.core.domain.entities.FavoritesEntity;
import java.util.List;

public interface PersistanceAdapter {
    FavoritesEntity saveFavorite(FavoritesEntity favorite);
    boolean existsFavoriteByKey(String key);
    void deleteFavorite(String key);
    void updateAlias(String key, String alias);
    List<FavoritesEntity> getAllFavorites();

    List<FavoritesEntity> findAll();

    void save(FavoritesEntity favorite);
}

