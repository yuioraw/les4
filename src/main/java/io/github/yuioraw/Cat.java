package io.github.yuioraw;

public class Cat {
    String species;
    int weight;
    String color;
    int age;
    String breed;

    public Cat() {
        this.species = species;
        this.weight = weight;
        this.color = color;
        this.age = age;
        this.breed = breed;
    }


    void meow() {
        System.out.println("Я " + color + " " + breed + " " + species + ", вешу " + weight + " кг и мне " + age + " года."
        );
    }
}


