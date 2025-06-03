package co.edu.javeriana.llaves.favoritos.application.services;

import co.edu.javeriana.llaves.favoritos.core.domain.entities.FavoritesEntity;
import co.edu.javeriana.llaves.favoritos.infraestructure.persistance.sql_lite.repositories.FavoritesRepository;

import java.util.List;
import java.util.Optional;

public class ManageFavorites {

    private final FavoritesRepository favoritesRepository;

    public ManageFavorites(FavoritesRepository favoritesRepository) {
        this.favoritesRepository = favoritesRepository;
    }

    public FavoritesEntity addFavorite(String userId, String key, String alias) {
        FavoritesEntity entity = new FavoritesEntity();
        entity.setUserId(userId);
        entity.setKey(key);
        entity.setAlias(alias);
        return favoritesRepository.save(entity);
    }

    public boolean deleteFavorite(String userId, String key) {
        Optional<FavoritesEntity> optional = favoritesRepository.findByUserIdAndKey(userId, key);
        if (optional.isPresent()) {
            favoritesRepository.delete(optional.get());
            return true;
        }
        return false;
    }

    public Optional<FavoritesEntity> updateAlias(String userId, String key, String newAlias) {
        Optional<FavoritesEntity> optional = favoritesRepository.findByUserIdAndKey(userId, key);
        if (optional.isPresent()) {
            FavoritesEntity favorite = optional.get();
            favorite.setAlias(newAlias);
            favoritesRepository.save(favorite);
            return Optional.of(favorite);
        }
        return Optional.empty();
    }

    public List<FavoritesEntity> listFavorites(String userId) {
        return favoritesRepository.findAllByUserId(userId);
    }

    public boolean validateKey(String userId, String key) {
        return favoritesRepository.findByUserIdAndKey(userId, key).isPresent();
    }
}