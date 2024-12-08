package com.matdev.service;

import com.matdev.dao.PokemonDAO;
import com.matdev.model.Pokemon;

public class PokemonService {
    private final PokemonDAO pokemonDAO = new PokemonDAO();

    public void savePokemon(Pokemon pokemon){
        pokemonDAO.SavePokemon(pokemon);
    }

    public void removePokemon(int id){
        pokemonDAO.removePokemon(id);
    }
}
