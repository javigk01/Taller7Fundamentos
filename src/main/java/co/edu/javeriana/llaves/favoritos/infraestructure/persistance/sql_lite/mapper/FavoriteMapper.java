package co.edu.javeriana.llaves.favoritos.infraestructure.persistance.sql_lite.mapper;

import co.edu.javeriana.llaves.favoritos.core.domain.entities.FavoritesEntity;
import co.edu.javeriana.llaves.favoritos.core.domain.enums.FavoriteState;
import co.edu.javeriana.llaves.favoritos.infraestructure.persistance.sql_lite.entities.Favorites;

public class FavoriteMapper {

    public static Favorites toDatabaseEntity(FavoritesEntity favoritesEntity) {
        Favorites favorites = new Favorites();
        favorites.setId(favoritesEntity.getId());
        favorites.setUser(favoritesEntity.getUser());
        favorites.setAlias(favoritesEntity.getAlias());
        favorites.setKeyText(favoritesEntity.getKeyText());
        favorites.setStatus(favoritesEntity.getStatus().name());
        return favorites;
    }

    public static FavoritesEntity toDomainEntity(Favorites favorites) {
        FavoritesEntity favoritesEntity = new FavoritesEntity(
                favorites.getId(),
                favorites.getUser(),
                favorites.getAlias(),
                favorites.getKeyText()
        );
        //TODO mostrar el de la base de datos
        favoritesEntity.initStatus(FavoriteState.ACTIVE);
        return favoritesEntity;
    }
}
