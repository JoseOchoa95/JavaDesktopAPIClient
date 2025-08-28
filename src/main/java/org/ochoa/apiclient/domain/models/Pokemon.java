package org.ochoa.apiclient.domain.models;

import java.util.List;

public class Pokemon {

    private Integer id;
    private String name;
    private List<String> moves;
    private List<String> abilities;
    private String defaultSprite;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getMoves() {
        return moves;
    }

    public void setMoves(List<String> moves) {
        this.moves = moves;
    }

    public List<String> getAbilities() {
        return abilities;
    }

    public void setAbilities(List<String> abilities) {
        this.abilities = abilities;
    }

    public String getDefaultSprite() {
        return defaultSprite;
    }

    public void setDefaultSprite(String defaultSprite) {
        this.defaultSprite = defaultSprite;
    }

    public Pokemon(Integer id, String name, List<String> moves, List<String> abilities, String defaultSprite) {
        this.id = id;
        this.name = name;
        this.moves = moves;
        this.abilities = abilities;
        this.defaultSprite = defaultSprite;
    }
}
