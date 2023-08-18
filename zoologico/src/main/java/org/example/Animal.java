package org.example;

public class Animal {

    String nombre;
    String genero;
    double peso;
    Animal pareja;


    public Animal(String nombre, double peso) {
        this.nombre = nombre;
        this.peso = peso;
    }

    public void encontrarPareja(Animal pareja){
        this.pareja=pareja;
    }

    public Animal() {
    }
}
