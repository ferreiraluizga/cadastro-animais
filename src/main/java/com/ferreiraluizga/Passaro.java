package com.ferreiraluizga;

public class Passaro extends Animal implements Brincavel {

    public Passaro(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("Piu piu!");
    }

    @Override
    public void brincar() {
        System.out.println("Passaro: " + this.getNome() + " está brincando");
    }

}
