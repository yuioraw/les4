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
        myCat.celebrate();

        Cat anotherCat;
        anotherCat = new Cat();
        anotherCat.color = "белая";
        anotherCat.species = "кошка";
        anotherCat.age = 2;
        anotherCat.breed = "Сиамская";
        anotherCat.weight = 3;

        anotherCat.meow();
        anotherCat.celebrate();


        Dog theDog = new Dog();
        theDog.color = "рыжий";
        theDog.species = "собака";
        theDog.age = 1;
        theDog.breed = "Дворняга";
        theDog.weight = 4;
        theDog.run();

    }

}
