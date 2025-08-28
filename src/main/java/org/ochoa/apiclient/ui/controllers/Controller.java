package org.ochoa.apiclient.ui.controllers;

import com.google.gson.Gson;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import okhttp3.OkHttpClient;
import org.ochoa.apiclient.data.PokemonRepositoryImp;
import org.ochoa.apiclient.data.api.PokemonAPIClient;
import org.ochoa.apiclient.domain.models.Pokemon;
import org.ochoa.apiclient.domain.usecases.GetPokemonUseCase;

import java.util.List;

public class Controller {

    @FXML
    private TextField searchField;

    @FXML
    private Label errorLabel;

    @FXML
    private Label numberNameLabel;

    @FXML
    private ImageView pokemonImageView;

    @FXML
    private VBox abilities;

    @FXML
    private VBox moves;

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

    /**
     * Method responsible for making the request to the API to get Pokémon info
     *
     * @param actionEvent
     */
    public void onSearchButtonClick(ActionEvent actionEvent) {

        try{
            String pokemonName = searchField.getText().trim();
            if (pokemonName.isEmpty()) {
                errorLabel.setText("Por favor, escribe un nombre de Pokémon");
                return;
            }

            Pokemon pokemon = getPokemonUseCase.execute(pokemonName);
            numberNameLabel.setText("#" + pokemon.getId() + " " + pokemon.getName());
            loadImageFormUrl(pokemonImageView, pokemon.getDefaultSprite());
            loadAbilities(pokemon.getAbilities());
            loadMoves(pokemon.getMoves());

            errorLabel.setText(null);
        }catch (Exception e){
            errorLabel.setText("Pokémon no encontrado.");
        }

    }

    /**
     * Method to load image from URL
     *
     * @param view View responsible for displaying the image
     * @param imageUrl Image URL
     */
    private void loadImageFormUrl(ImageView view, String imageUrl) {
        try {
            Image image = new Image(imageUrl);
            view.setImage(image);
        } catch (Exception e) {
            System.err.println("Error al cargar la imagen: " + e.getMessage());
        }
    }

    private void loadAbilities(List<String> abilitiesList) {

        abilities.getChildren().clear();
        for (String ability : abilitiesList) {
            Label label = new Label(ability);
            label.setStyle("-fx-font-size: 12px; -fx-padding: 2px 5px;");
            label.setWrapText(true);
            abilities.getChildren().add(label);
        }
    }

    private void loadMoves(List<String> movesList) {

        moves.getChildren().clear();
        for (String ability : movesList) {
            Label label = new Label(ability);
            label.setStyle("-fx-font-size: 12px; -fx-padding: 2px 5px;");
            label.setWrapText(true);
            moves.getChildren().add(label);
        }
    }
}
