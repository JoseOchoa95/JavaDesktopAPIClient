package org.ochoa.apiclient.domain.usecases;

import org.ochoa.apiclient.data.repositories.PokemonRepository;
import org.ochoa.apiclient.domain.models.Pokemon;

public class GetPokemonUseCase {

    private final PokemonRepository repository;

    public GetPokemonUseCase(PokemonRepository repository) {
        this.repository = repository;
    }

    public Pokemon execute(String name) throws Exception {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre del Pokémon no puede estar vacío");
        }
        return repository.getPokemonByName(name);
    }
}
