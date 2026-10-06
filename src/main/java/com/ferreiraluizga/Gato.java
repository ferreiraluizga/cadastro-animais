package com.ferreiraluizga;

public class Gato extends Animal implements Brincavel {

    public Gato(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("Miau!");
    }

    @Override
    public void brincar() {
        System.out.println("Gato: " + this.getNome() + " está brincando");
    }

}
