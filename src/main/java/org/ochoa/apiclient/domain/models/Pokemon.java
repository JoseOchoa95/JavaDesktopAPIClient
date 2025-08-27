package org.ochoa.apiclient.domain.models;

public class Pokemon {

    private String name;
    private Integer numero;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Pokemon(String name, Integer numero) {
        this.name = name;
        this.numero = numero;
    }
}
