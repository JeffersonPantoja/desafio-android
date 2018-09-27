package br.com.alura.javapop.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Usuario {

    @JsonProperty("login")
    private String nome;

    private String sobrenome;

    @JsonProperty("avatar_url")
    private String urlAvatar;

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public String getUrlAvatar() {
        return urlAvatar;
    }
}
