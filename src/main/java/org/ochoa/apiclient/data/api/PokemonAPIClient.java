package org.ochoa.apiclient.data.api;

import com.google.gson.Gson;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.ochoa.apiclient.data.models.PokemonAPIResponse;

public class PokemonAPIClient {

    private static final String BASE_URL = "https://pokeapi.co/api/v2/pokemon/";
    private final OkHttpClient client;
    private final Gson gson;

    public PokemonAPIClient(OkHttpClient client, Gson gson) {
        this.client = client;
        this.gson = gson;
    }

    public PokemonAPIResponse getPokemon(String name) throws Exception {

        String url = BASE_URL + name.toLowerCase();
        Request request = new Request.Builder()
                .url(url)
                .get()
                .build();

        try (Response response = client.newCall(request).execute()) {
            if (!response.isSuccessful()) {
                throw new Exception("Error en la petición: " + response.code());
            }

            String responseBody = response.body().string();
            return gson.fromJson(responseBody, PokemonAPIResponse.class);
        }
    }
}
