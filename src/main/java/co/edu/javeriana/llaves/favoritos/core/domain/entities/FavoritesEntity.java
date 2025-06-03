package co.edu.javeriana.llaves.favoritos.core.domain.entities;

import co.edu.javeriana.llaves.favoritos.core.domain.enums.FavoriteState;
import lombok.Getter;

@Getter
public class FavoritesEntity {
    private final String id;
    private final String user;
    private final String alias;
    private final String keyText;
    private FavoriteState status;

    public FavoritesEntity(String id, String user, String alias, String keyText) {
        this.id = id;
        this.user = user;
        this.alias = alias;
        this.keyText = keyText;
        this.status = FavoriteState.ACTIVE; // Default status is ACTIVE
    }

    public void initStatus(FavoriteState state) {
        if (state == null) {
            throw new IllegalArgumentException("Status cannot be null");
        }
        this.status = state;
    }


}
