package co.edu.javeriana.llaves.favoritos.core.domain.entities;

import co.edu.javeriana.llaves.favoritos.core.domain.enums.FavoriteState;
import lombok.Getter;

@Getter
public class FavoritesEntity {
    private final String id;
    private final String user;
    private String alias;
    private final String keyText;
    private FavoriteState status;

    public FavoritesEntity(String id, String user, String alias, String keyText) {
        this.id = id;
        this.user = user;
        this.alias = alias;
        this.keyText = keyText;
        this.status = FavoriteState.ACTIVE; // Default status is ACTIVE
    }

    public FavoritesEntity(String id, String user, String alias, String keyText, FavoriteState status) {
        this.id = id;
        this.user = user;
        this.alias = alias;
        this.keyText = keyText;
        this.status = status != null ? status : FavoriteState.ACTIVE;
    }

    public void initStatus(FavoriteState state) {
        if (state == null) {
            throw new IllegalArgumentException("Status cannot be null");
        }
        this.status = state;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getId(){
        return id;
    }

    public String getUser() {
        return user;
    }

    public String getAlias(){
        return alias;
    }

    public String getKeyText(){
        return keyText;
    }

    public FavoriteState getStatus(){
        return status;
    }
}
