package org.ochoa.apiclient.ui.controllers;

import com.google.gson.Gson;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import okhttp3.OkHttpClient;
import org.ochoa.apiclient.data.PokemonRepositoryImp;
import org.ochoa.apiclient.data.api.PokemonAPIClient;
import org.ochoa.apiclient.domain.models.Pokemon;
import org.ochoa.apiclient.domain.usecases.GetPokemonUseCase;

public class Controller {

    @FXML
    private TextField searchField;

    private GetPokemonUseCase getPokemonUseCase;

    public Controller() {
    }

    @FXML
    public void initialize(){
        OkHttpClient okHttpClient = new OkHttpClient();
        Gson gson = new Gson();
        PokemonAPIClient apiClient = new PokemonAPIClient(okHttpClient, gson);
        PokemonRepositoryImp repository = new PokemonRepositoryImp(apiClient);
        this.getPokemonUseCase = new GetPokemonUseCase(repository);
    }

    public void onSearchButtonClick(ActionEvent actionEvent) {

        try{
            String pokemonName = searchField.getText().trim();
            if (pokemonName.isEmpty()) {
                System.out.println("Por favor, escribe un nombre de Pokémon");
                return;
            }

            Pokemon pokemon = getPokemonUseCase.execute(pokemonName);

            System.out.println("El nombre del pokemon es: " + pokemon.getNumero());
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
