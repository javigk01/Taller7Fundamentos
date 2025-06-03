package co.edu.javeriana.llaves.favoritos.core.use_cases;

import co.edu.javeriana.llaves.favoritos.core.use_cases.infraestructure.PersistanceAdapter;

public class ValidateFavorite {
    private final PersistanceAdapter adapter;

    public ValidateFavorite(PersistanceAdapter adapter) {
        this.adapter = adapter;
    }

    public boolean existsByKey(String key) {
        return adapter.existsFavoriteByKey(key);
    }
}