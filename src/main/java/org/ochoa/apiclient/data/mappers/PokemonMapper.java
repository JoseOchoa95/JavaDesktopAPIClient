package org.ochoa.apiclient.data.mappers;

import org.ochoa.apiclient.data.models.PokemonAPIResponse;
import org.ochoa.apiclient.domain.models.Pokemon;

public class PokemonMapper {

    public static Pokemon toDomain(PokemonAPIResponse apiResponse){
        return new Pokemon(
                apiResponse.name(),
                apiResponse.id()
        );
    }
}
