package co.edu.javeriana.llaves.favoritos.gateways.service;

import co.edu.javeriana.llaves.favoritos.core.domain.entities.FavoritesEntity;
import co.edu.javeriana.llaves.favoritos.application.services.ManageFavorites;
import co.edu.javeriana.llaves.favoritos.infraestructure.persistance.sql_lite.repositories.FavoritesRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FavoritesFacade {

    private final ManageFavorites manageFavorites;

    public FavoritesFacade(FavoritesRepository favoritesRepository) {
        this.manageFavorites = new ManageFavorites(favoritesRepository);
    }

    public FavoritesEntity addFavorite(String userId, String key, String alias) {
        return manageFavorites.addFavorite(userId, key, alias);
    }

    public boolean deleteFavorite(String userId, String key) {
        return manageFavorites.deleteFavorite(userId, key);
    }

    public Optional<FavoritesEntity> updateAlias(String userId, String key, String newAlias) {
        return manageFavorites.updateAlias(userId, key, newAlias);
    }

    public List<FavoritesEntity> listFavorites(String userId) {
        return manageFavorites.listFavorites(userId);
    }

    public boolean validateKey(String userId, String key) {
        return manageFavorites.validateKey(userId, key);
    }
}