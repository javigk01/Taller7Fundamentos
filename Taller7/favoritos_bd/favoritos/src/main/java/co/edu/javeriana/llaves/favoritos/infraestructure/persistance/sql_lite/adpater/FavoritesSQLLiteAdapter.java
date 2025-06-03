package co.edu.javeriana.llaves.favoritos.infraestructure.persistance.sql_lite.adpater;

import co.edu.javeriana.llaves.favoritos.core.domain.entities.FavoritesEntity;
import co.edu.javeriana.llaves.favoritos.core.use_cases.infraestructure.PersistanceAdapter;
import co.edu.javeriana.llaves.favoritos.infraestructure.persistance.sql_lite.entities.Favorites;
import co.edu.javeriana.llaves.favoritos.infraestructure.persistance.sql_lite.mapper.FavoriteMapper;
import co.edu.javeriana.llaves.favoritos.infraestructure.persistance.sql_lite.repositories.FavoritesDataAccess;
import co.edu.javeriana.llaves.favoritos.infraestructure.persistance.sql_lite.repositories.FavoritesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class FavoritesSQLLiteAdapter implements PersistanceAdapter {

    @Autowired
    private FavoritesDataAccess favoritesDataAccess;

    @Override
    public void save(FavoritesEntity entity) {
        //mapper
        Favorites favorite = FavoriteMapper.toDatabaseEntity(entity);
        favoritesDataAccess.saveFavorite(favorite);
    }

    @Override
    public <T> T findById(Class<T> entityClass, String id) {
        return null;
    }

    @Override
    public void delete(FavoritesEntity entity) {

    }

    @Override
    public List<FavoritesEntity> findAll() {
        System.out.println(favoritesDataAccess.getAllFavorites());
        return favoritesDataAccess.getAllFavorites().stream()
                .map(FavoriteMapper::toDomainEntity)
                .toList();
    }

    @Override
    public void update(FavoritesEntity entity) {

    }

    @Override
    public FavoritesEntity saveFavorite(FavoritesEntity favorite) {
        return null;
    }

    @Override
    public boolean existsFavoriteByKey(String key) {
        return false;
    }

    @Override
    public void deleteFavorite(String key) {

    }

    @Override
    public void updateAlias(String key, String alias) {

    }

    @Override
    public List<FavoritesEntity> getAllFavorites() {
        return List.of();
    }
}
