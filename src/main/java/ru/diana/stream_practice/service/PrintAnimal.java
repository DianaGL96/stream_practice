package ru.diana.stream_practice.service;
import ru.diana.stream_practice.entity.Animal;
import java.util.List;

public class PrintAnimal {
    public static void printAnimal(List<Animal>animals) {
        AnimalOperations.checkForLion(animals);
        AnimalOperations.sortedForAnimals(animals);
        AnimalOperations.checkCountAnimals(animals);
        AnimalOperations.convertingToMap(animals);
        AnimalOperations.animalsToString(animals);
    }
}
