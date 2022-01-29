package io.github.yuioraw;

public class Dog {


    public Dog(String species, int weight, String color, int age, String breed) {
        this.species = species;
        this.weight = weight;
        this.color = color;
        this.age = age;
        this.breed = breed;
    }

    String species;
    int weight;
    String color;
    int age;
    String breed;

    public Dog() {

    }


    void run() {
        System.out.println("Собака бегает");
    }

}

