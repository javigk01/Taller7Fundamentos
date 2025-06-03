package co.edu.javeriana.llaves.favoritos.gateways.dtos;

public class FavoriteRequest {
    private String userId;
    private String key;
    private String alias;

    public FavoriteRequest() {
    }

    public FavoriteRequest(String userId, String key, String alias) {
        this.userId = userId;
        this.key = key;
        this.alias = alias;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }
}