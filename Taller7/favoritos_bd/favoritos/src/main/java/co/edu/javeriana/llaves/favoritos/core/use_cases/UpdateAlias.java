package co.edu.javeriana.llaves.favoritos.core.use_cases;

import co.edu.javeriana.llaves.favoritos.core.use_cases.infraestructure.PersistanceAdapter;

public class UpdateAlias {
    private final PersistanceAdapter adapter;

    public UpdateAlias(PersistanceAdapter adapter) {
        this.adapter = adapter;
    }

    public void execute(String key, String newAlias) {
        adapter.updateAlias(key, newAlias);
    }
}
