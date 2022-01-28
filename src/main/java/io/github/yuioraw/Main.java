package io.github.yuioraw;

public class Main {

    public static void main(String[] args) {
        Cat myCat = new Cat();
        myCat.color = "черная";
        myCat.species = "кошка";
        myCat.age = 3;
        myCat.breed = "Cибирская";
        myCat.weight = 4;

        myCat.meow();
    }

}
