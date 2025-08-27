package org.ochoa.apiclient.data.repositories;

import org.ochoa.apiclient.data.models.PokemonAPIResponse;
import org.ochoa.apiclient.domain.models.Pokemon;

public interface PokemonRepository {

    Pokemon getPokemonByName(String name) throws Exception;
}
