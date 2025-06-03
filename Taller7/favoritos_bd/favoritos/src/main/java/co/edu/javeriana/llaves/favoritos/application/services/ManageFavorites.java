package co.edu.javeriana.llaves.favoritos.application.services;

import co.edu.javeriana.llaves.favoritos.core.domain.entities.FavoritesEntity;
import co.edu.javeriana.llaves.favoritos.core.use_cases.*;

import java.util.List;

public class ManageFavorites {
    private final AddFavorite addFavorite;
    private final ValidateFavorite validateFavorite;
    private final RemoveFavorite removeFavorite;
    private final UpdateAlias updateAlias;
    private final ListFavorites listFavorites;

    public ManageFavorites(AddFavorite addFavorite,
                           ValidateFavorite validateFavorite,
                           RemoveFavorite removeFavorite,
                           UpdateAlias updateAlias,
                           ListFavorites listFavorites) {
        this.addFavorite = addFavorite;
        this.validateFavorite = validateFavorite;
        this.removeFavorite = removeFavorite;
        this.updateAlias = updateAlias;
        this.listFavorites = listFavorites;
    }

    public FavoritesEntity add(FavoritesEntity favorite) {
        return addFavorite.execute(favorite);
    }

    public boolean exists(String key) {
        return validateFavorite.existsByKey(key);
    }

    public void remove(String key) {
        removeFavorite.execute(key);
    }

    public void updateAlias(String key, String alias) {
        updateAlias.execute(key, alias);
    }

    public List<FavoritesEntity> list() {
        return listFavorites.execute();
    }
}
