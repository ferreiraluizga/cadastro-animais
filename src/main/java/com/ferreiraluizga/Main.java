package com.ferreiraluizga;

public class Main {
    public static void main(String[] args) {
        Cachorro c1 = new Cachorro("Bolt", 3);
        Gato g1 = new Gato("Luna", 2);
        Passaro p1 = new Passaro("Passarinho", 4);

        Cuidador cuidador = new Cuidador("Carlos");

        cuidador.adicionarAnimal(c1);
        cuidador.adicionarAnimal(g1);
        cuidador.adicionarAnimal(p1);

        cuidador.listarAnimais();

        c1.emitirSom();
        c1.brincar();

        g1.emitirSom();
        g1.brincar();

        p1.emitirSom();
        p1.brincar();

        System.out.println("Quantidade de animais: " + Animal.getQuantidadeAnimais());
    }
}
