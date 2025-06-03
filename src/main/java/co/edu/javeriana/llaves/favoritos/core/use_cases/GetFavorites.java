package co.edu.javeriana.llaves.favoritos.core.use_cases;

import co.edu.javeriana.llaves.favoritos.core.domain.entities.FavoritesEntity;
import co.edu.javeriana.llaves.favoritos.core.domain.util.IdsGenerator;
import co.edu.javeriana.llaves.favoritos.core.domain.util.UUIDGenerator;
import co.edu.javeriana.llaves.favoritos.core.use_cases.infraestructure.PersistanceAdapter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GetFavorites {

    private IdsGenerator idsGenerator;

    @Autowired
    private PersistanceAdapter persistanceAdapter;

    public GetFavorites() {
        this.idsGenerator = new UUIDGenerator();
    }

    public List<FavoritesEntity> getFavorites(String user) {
        // This method should interact with the repository to fetch favorites for the user
        // For now, we will return an empty list as a placeholder
        return persistanceAdapter.findAll();
    }

    public void registerNewFavorite(FavoritesEntity favorite) {
        persistanceAdapter.save(favorite);
    }
}
