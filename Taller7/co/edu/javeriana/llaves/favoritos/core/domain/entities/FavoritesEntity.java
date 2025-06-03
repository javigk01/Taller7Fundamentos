package co.edu.javeriana.llaves.favoritos.core.domain.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class FavoritesEntity {

    @Id
    private String key;

    private String userId;
    private String alias;

    public String getKey() { return key; }
    public String getUserId() { return userId; }
    public String getAlias() { return alias; }

    public void setKey(String key) { this.key = key; }
    public void setUserId(String userId) { this.userId = userId; }
    public void setAlias(String alias) { this.alias = alias; }
}