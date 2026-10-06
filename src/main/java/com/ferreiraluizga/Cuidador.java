package com.ferreiraluizga;

import java.util.ArrayList;

public class Cuidador {

    private String nome;
    private ArrayList<Animal> animais = new ArrayList<>();

    public Cuidador(String nome) {
        this.nome = nome;
    }

    public void adicionarAnimal(Animal animal) {
        animais.add(animal);
    }

    public void listarAnimais() {
        String txt = "====== CUIDADOR: " + this.nome.toUpperCase() + " ======";

        System.out.println(txt);

        if (animais.isEmpty()) {
            System.out.println("Nenhum animal cadastrado para esse cuidador");
        } else {
            for (Animal a : animais) {
                System.out.println(a.getNome() + " | " + a.getIdade() + " anos");
            }
        }

        System.out.println(txt.replaceAll(".", "=") + "\n");
    }

}
