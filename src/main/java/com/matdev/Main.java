package com.matdev;

import com.matdev.service.CsvService;

import java.io.IOException;


public class Main {

    public static void main(String[] args) throws IOException {

        CsvService csvService = new CsvService();

        csvService.importPokemonDataFromCsv();

//        try {
//            CsvUtils.readAndRewriteCSV();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

//       PokemonDAO pokemonDAO = new PokemonDAO();
//
//        Pokemon pokemon = new Pokemon(1, "Bulbasaur", "Grass\n Poison", 2.04f, 0.7f, 15.2f, 6.9f);
//
//        pokemonDAO.SavePokemon(pokemon);

//        pokemonDAO.removePokemon(1);
//
//        pokemonDAO.shutdown();


    }
}