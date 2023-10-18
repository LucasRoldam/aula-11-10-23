package br.edu.umfg.aula11102023.classes;

import java.util.UUID;

public class Pessoa {

    private UUID id;
    private String nome;
    private String sobreNome;
    private String documento;

    public UUID getId() {
        return id;
    }

    public Pessoa(  String nome, String sobreNome, String documento) {
        this.id = UUID.randomUUID();
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.documento = documento;
    }
}
