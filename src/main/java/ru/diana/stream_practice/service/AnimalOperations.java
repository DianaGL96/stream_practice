package ru.diana.stream_practice.service;
import ru.diana.stream_practice.entity.Animal;
import java.util.*;
import java.util.stream.Collectors;

public class AnimalOperations {
    public static void checkForLion(List<Animal> animals) {
        boolean lionExist = animals.stream()
                .anyMatch(animal -> animal.getName().equals("lion"));
        if (lionExist) {
            Animal lion = new Animal("lion", 13);
            System.out.println("The animal was found. Name - " + lion.getName() + ", age - " + lion.getAge());
        }
        else {
            throw new IllegalArgumentException();
        }
    }

    public static void sortedForAnimals(List<Animal> animals) {
        animals.stream()
                .sorted(Comparator.comparingInt(Animal::getAge))
                .forEach(animal -> System.out.println("Name: " + animal.getName() + ", age: " + animal.getAge()));
    }

    public static void checkCountAnimals(List<Animal> animals) {
        animals.stream()
                .filter(animal -> animal.getAge() > 4)
                .forEach(animal -> System.out.println("Name: " + animal.getName() + ", Age: " + animal.getAge()));
    }

    public static void convertingToMap(List<Animal> animals) {
        Map<String, Animal>animalMap = animals.stream()
                .collect(Collectors.toMap(Animal::getName, animal -> animal));
        animalMap.forEach((name, animal) -> System.out.println("Name: " + name + ", age: " + animal.getAge()));
    }

    public static void animalsToString(List<Animal>animals) {
        String result = animals.stream()
                .map(animal -> animal.getName() + " (" + animal.getAge() + " years)")
                .reduce(new StringJoiner(", ", "Animals: ", "")
                        , StringJoiner::add
                        , StringJoiner::merge)
                .toString();
        System.out.println(result);
    }
}
