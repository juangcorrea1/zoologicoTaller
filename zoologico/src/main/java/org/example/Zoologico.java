package org.example;

public class Zoologico {
    public static void main(String[] args) {


        Animal animal1 = new Animal("Cebra", 1);


        Animal animal2 = new Animal("Caballo", 1);

        Animal hijo = new Animal();

        animal1.encontrarPareja(animal2); //Un animal consigue pareja


        Familia familia = new Familia(animal1,animal2 ,hijo);


        familia.tenerHijo("Cebrallo");


        familia.imprimirFamilia();


    }
}