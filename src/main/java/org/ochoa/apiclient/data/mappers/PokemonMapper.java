package org.ochoa.apiclient.data.mappers;

import org.ochoa.apiclient.data.models.AbilitiesAPIResponse;
import org.ochoa.apiclient.data.models.MoveAPIResponse;
import org.ochoa.apiclient.data.models.PokemonAPIResponse;
import org.ochoa.apiclient.domain.models.Pokemon;

public class PokemonMapper {

    public static Pokemon toDomain(PokemonAPIResponse apiResponse){
        return new Pokemon(
                apiResponse.id(),
                apiResponse.name(),
                apiResponse
                        .moves()
                        .stream()
                        .map(moveAPIResponse -> moveAPIResponse.move().name())
                        .toList(),
                apiResponse
                        .abilities()
                        .stream()
                        .map(abilitiesAPIResponse -> abilitiesAPIResponse.ability().name())
                        .toList(),
                apiResponse.sprites().front_default()
        );
    }
}
