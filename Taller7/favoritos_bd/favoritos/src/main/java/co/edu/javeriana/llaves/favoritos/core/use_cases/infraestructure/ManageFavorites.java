package co.edu.javeriana.llaves.favoritos.core.use_cases;

import co.edu.javeriana.llaves.favoritos.core.domain.entities.FavoritesEntity;
import co.edu.javeriana.llaves.favoritos.core.domain.enums.FavoriteState;
import co.edu.javeriana.llaves.favoritos.infraestructure.persistance.sql_lite.repositories.FavoritesRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class ManageFavorites {

    private final FavoritesRepository favoritesRepository;

    public ManageFavorites(FavoritesRepository favoritesRepository) {
        this.favoritesRepository = favoritesRepository;
    }

    public FavoritesEntity addFavorite(String userId, String key, String alias) {
        FavoritesEntity favorite = new FavoritesEntity(UUID.randomUUID().toString(), userId, key, alias, FavoriteState.ACTIVE);
        return favoritesRepository.save(favorite);
    }

    public boolean deleteFavorite(String userId, String key) {
        Optional<FavoritesEntity> favoriteOpt = favoritesRepository.findByUserIdAndKey(userId, key);
        if (favoriteOpt.isPresent()) {
            favoritesRepository.delete(favoriteOpt.get());
            return true;
        }
        return false;
    }

    public Optional<FavoritesEntity> updateAlias(String userId, String key, String newAlias) {
        Optional<FavoritesEntity> favoriteOpt = favoritesRepository.findByUserIdAndKey(userId, key);
        favoriteOpt.ifPresent(fav -> {
            fav.setAlias(newAlias);
            favoritesRepository.save(fav);
        });
        return favoriteOpt;
    }

    public List<FavoritesEntity> listFavorites(String userId) {
        return favoritesRepository.findAllByUserId(userId);
    }

    public boolean validateKey(String userId, String key) {
        return favoritesRepository.findByUserIdAndKey(userId, key).isPresent();
    }
}
