package co.edu.javeriana.llaves.favoritos.infraestructure.persistance.sql_lite.repositories;

import co.edu.javeriana.llaves.favoritos.infraestructure.persistance.sql_lite.entities.Favorites;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FavoritesDataAccess {

    @Autowired
    FavoritesRepository favoritesRepository;

    public void saveFavorite(Favorites favorite) {
        favoritesRepository.save(favorite);
    }

    public List<Favorites> getAllFavorites() {
        return favoritesRepository.findAll();
    }
}
