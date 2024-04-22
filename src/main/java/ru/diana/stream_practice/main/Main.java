package ru.diana.stream_practice.main;
import ru.diana.stream_practice.entity.Animal;
import ru.diana.stream_practice.service.PrintAnimal;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main (String[] arr) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("cow", 5));
        animals.add(new Animal("lion", 13));
        animals.add(new Animal("zebra", 7));
        animals.add(new Animal("elephant", 24));
        animals.add(new Animal("wolf", 10));
        animals.add(new Animal("penguin", 3));
        animals.add(new Animal("fox", 9));
        animals.add(new Animal("giraffe", 17));
        animals.add(new Animal("horse", 6));
        animals.add(new Animal("deer", 12));
        PrintAnimal.printAnimal(animals);
    }
}
