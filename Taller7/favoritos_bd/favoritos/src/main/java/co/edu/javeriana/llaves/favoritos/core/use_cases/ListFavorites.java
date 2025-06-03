package co.edu.javeriana.llaves.favoritos.core.use_cases;

import co.edu.javeriana.llaves.favoritos.core.domain.entities.FavoritesEntity;
import co.edu.javeriana.llaves.favoritos.core.use_cases.infraestructure.PersistanceAdapter;

import java.util.List;

public class ListFavorites {
    private final PersistanceAdapter adapter;

    public ListFavorites(PersistanceAdapter adapter) {
        this.adapter = adapter;
    }

    public List<FavoritesEntity> execute() {
        return adapter.getAllFavorites();
    }
}