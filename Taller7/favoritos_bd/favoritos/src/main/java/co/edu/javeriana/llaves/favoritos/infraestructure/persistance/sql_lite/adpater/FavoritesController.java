package co.edu.javeriana.llaves.favoritos.adapters.controllers;

import co.edu.javeriana.llaves.favoritos.application.services.ManageFavorites;
import co.edu.javeriana.llaves.favoritos.core.domain.entities.FavoritesEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/favorites")
public class FavoritesController {

    private final ManageFavorites manageFavorites;

    public FavoritesController(ManageFavorites manageFavorites) {
        this.manageFavorites = manageFavorites;
    }

    @PostMapping
    public ResponseEntity<FavoritesEntity> addFavorite(@RequestBody FavoritesEntity favorite) {
        return ResponseEntity.ok(manageFavorites.add(favorite));
    }

    @GetMapping("/validate/{key}")
    public ResponseEntity<Boolean> validateKey(@PathVariable String key) {
        return ResponseEntity.ok(manageFavorites.exists(key));
    }

    @DeleteMapping("/{key}")
    public ResponseEntity<Void> deleteFavorite(@PathVariable String key) {
        manageFavorites.remove(key);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/{key}/alias")
    public ResponseEntity<Void> updateAlias(@PathVariable String key, @RequestBody String newAlias) {
        manageFavorites.updateAlias(key, newAlias);
        return ResponseEntity.ok().build();
    }

    @GetMapping
    public ResponseEntity<List<FavoritesEntity>> listFavorites() {
        return ResponseEntity.ok(manageFavorites.list());
    }
}
