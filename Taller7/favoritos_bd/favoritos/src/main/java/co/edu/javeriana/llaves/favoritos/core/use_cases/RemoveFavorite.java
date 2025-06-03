package co.edu.javeriana.llaves.favoritos.core.use_cases;

import co.edu.javeriana.llaves.favoritos.core.use_cases.infraestructure.PersistanceAdapter;

public class RemoveFavorite {
    private final PersistanceAdapter adapter;

    public RemoveFavorite(PersistanceAdapter adapter) {
        this.adapter = adapter;
    }

    public void execute(String key) {
        adapter.deleteFavorite(key);
    }
}