package com.ferreiraluizga;

public class Cachorro extends Animal implements Brincavel {

    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("Au au!");
    }

    @Override
    public void brincar() {
        System.out.println("Cachorro: " + this.getNome() + " está brincando");
    }
}
