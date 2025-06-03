package co.edu.javeriana.llaves.favoritos.core.use_cases;

import co.edu.javeriana.llaves.favoritos.core.domain.entities.FavoritesEntity;
import co.edu.javeriana.llaves.favoritos.core.use_cases.infraestructure.PersistanceAdapter;

public class AddFavorite {
    private final PersistanceAdapter adapter;

    public AddFavorite(PersistanceAdapter adapter) {
        this.adapter = adapter;
    }

    public FavoritesEntity execute(FavoritesEntity favorite) {
        return adapter.saveFavorite(favorite);
    }
}