package com.ferreiraluizga;

public abstract class Animal {

    private String nome;
    private int idade;

    public static int quantidadeAnimais;

    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        quantidadeAnimais++;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public static int getQuantidadeAnimais() {
        return quantidadeAnimais;
    }

    public abstract void emitirSom();
}
