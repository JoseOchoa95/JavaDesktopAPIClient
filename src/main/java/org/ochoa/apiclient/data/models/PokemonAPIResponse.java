package org.ochoa.apiclient.data.models;

import java.util.List;

public record PokemonAPIResponse(
        Integer id,
        String name,
        List<MoveAPIResponse> moves,
        List<AbilityAPIResponse> abilities
) {
}
