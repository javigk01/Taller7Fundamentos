package co.edu.javeriana.llaves.favoritos.infraestructure.persistance.sql_lite.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.ToString;

@Entity(name = "favorites")
@Data
@ToString
public class Favorites {

    @Id
    @Column(name = "id", nullable = false, unique = true)
    private String id;
    @Column(name = "user", nullable = false)
    private String user;
    @ToString.Exclude
    @Column(name = "alias", nullable = false)
    private String alias;
    @Column(name = "key_text", nullable = false)
    private String keyText;
    @Column(name = "status", nullable = false)
    private String status;

    public String getId() {
        return id;
    }


    public String getUser() {
        return user;
    }

    public String getAlias() {
        return alias;
    }


    public String getKeyText() {
        return keyText;
    }

    public void setId(String id) {
        this.id=id;
    }

    public void setUser(String user) {
        this.user=user;
    }


    public void setAlias(String alias) {
        this.alias=alias;
    }


    public void setKeyText(String keyText) {
        this.keyText=keyText;
    }


    public void setStatus(String name) {
        this.status=status;
    }
}
