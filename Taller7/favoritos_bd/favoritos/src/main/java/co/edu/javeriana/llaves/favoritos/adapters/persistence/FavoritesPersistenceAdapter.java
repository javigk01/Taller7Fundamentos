package co.edu.javeriana.llaves.favoritos.adapters.persistence;

import co.edu.javeriana.llaves.favoritos.core.domain.entities.FavoritesEntity;
import co.edu.javeriana.llaves.favoritos.core.use_cases.infraestructure.PersistanceAdapter;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FavoritesPersistenceAdapter implements PersistanceAdapter {

    private final FavoritesRepository repository;

    public FavoritesPersistenceAdapter(FavoritesRepository repository) {
        this.repository = repository;
    }

    @Override
    public FavoritesEntity saveFavorite(FavoritesEntity favorite) {
        return repository.save(favorite);
    }

    @Override
    public boolean existsFavoriteByKey(String key) {
        return repository.existsById(key);
    }

    @Override
    public void deleteFavorite(String key) {
        repository.deleteById(key);
    }

    @Override
    public void updateAlias(String key, String alias) {
        FavoritesEntity favorite = repository.findById(key).orElseThrow();
        favorite.setAlias(alias);
        repository.save(favorite);
    }

    @Override
    public List<FavoritesEntity> getAllFavorites() {
        return repository.findAll();
    }

    @Override
    public List<FavoritesEntity> findAll() {
        return List.of();
    }

    @Override
    public void save(FavoritesEntity favorite) {

    }

}