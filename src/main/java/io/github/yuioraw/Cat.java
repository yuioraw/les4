package io.github.yuioraw;


public class Cat {


    String species;
    int weight;
    String color;
    int age;
    int currentAge;
    String breed;

    public Cat(String species, int weight, String color, int age, int currentAge, String breed) {
        this.species = species;
        this.weight = weight;
        this.color = color;
        this.age = age;
        this.currentAge = currentAge;
        this.breed = breed;
    }

    public Cat() {

    }


    void celebrate() {
        if (currentAge > age)
            System.out.println("Ура! У меня день рождения, мне исполнилось " + age + " !");
    }

    void meow() {
        System.out.println("Я " + color + " " + breed + " " + species + ", вешу " + weight + " кг и мне " + age + " года."
        );
    }
}

