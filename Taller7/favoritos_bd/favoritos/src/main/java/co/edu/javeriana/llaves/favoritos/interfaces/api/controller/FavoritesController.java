package co.edu.javeriana.llaves.favoritos.interfaces.api.controller;

import co.edu.javeriana.llaves.favoritos.gateways.dtos.FavoritesDTO;
import co.edu.javeriana.llaves.favoritos.gateways.service.FavoritesFacade;

import jakarta.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 * Controller for managing user favorites.
 * This controller provides an endpoint to retrieve a list of favorites for a given user.
 * */
@RestController
@RequestMapping("/api/v1/favorites")
public class FavoritesController {

    private final static Logger log = Logger.getLogger(FavoritesController.class.getName());

    @Autowired
    private FavoritesFacade favoritesFacade;

    @GetMapping
    public List<FavoritesDTO> getFavorites(@PathParam("user_name") String userName) {


        log.log(Level.INFO, "getFavorites called");
        log.log(Level.INFO, "userName: " + userName);
        return favoritesFacade.getFavorites(userName);
    }

    @PostMapping
    public void addFavorite(FavoritesDTO favorite) {
        log.log(Level.INFO, "addFavorite called");
        log.log(Level.INFO, "favorite: " + favorite);
        favoritesFacade.addFavorite(favorite);
    }


}
