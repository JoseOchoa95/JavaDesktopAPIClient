package org.ochoa.apiclient.data;

import org.ochoa.apiclient.data.api.PokemonAPIClient;
import org.ochoa.apiclient.data.mappers.PokemonMapper;
import org.ochoa.apiclient.data.models.PokemonAPIResponse;
import org.ochoa.apiclient.data.repositories.PokemonRepository;
import org.ochoa.apiclient.domain.models.Pokemon;

public class PokemonRepositoryImp implements PokemonRepository {

    private final PokemonAPIClient pokemonAPIClient;

    public PokemonRepositoryImp(PokemonAPIClient pokemonAPIClient) {
        this.pokemonAPIClient = pokemonAPIClient;
    }

    @Override
    public Pokemon getPokemonByName(String name) throws Exception {

        return PokemonMapper.toDomain(
                pokemonAPIClient.getPokemon(name)
        );
    }
}
