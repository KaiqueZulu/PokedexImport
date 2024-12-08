package com.matdev.service;

import com.matdev.model.Pokemon;
import com.matdev.utils.CsvUtils;

import java.io.IOException;
import java.util.List;

public class CsvService {
    public void importPokemonDataFromCsv() throws IOException {
        PokemonService pokemonService = new PokemonService();
        CsvUtils csvUtils = new CsvUtils();

        List<String> lines = csvUtils.readLines();

        for (final String line : lines){
            String[] columns = line.split(",");
            Pokemon pokemon = createPokemonInstance(columns);
            pokemonService.savePokemon(pokemon);
        }

        System.out.println("File imported successfully!");

    }

    private Pokemon createPokemonInstance(String[] columns){
        int id = Integer.parseInt(columns[0]);
        String name = columns[1];
        String type = columns[2];
        String heightFt = columns[3];
        float heightM = Float.parseFloat(columns[4]);
        float weightLbs = Float.parseFloat(columns[5]);
        float weightKgs = Float.parseFloat(columns[6]);

        return new Pokemon(id, name, type, heightFt, heightM, weightLbs, weightKgs );
    }
}
