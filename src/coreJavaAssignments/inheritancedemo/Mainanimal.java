package coreJavaAssignments.inheritancedemo;

public class Mainanimal {
    public static void main(String[] args) {
Animal animal = new Animal("Generic Animal ","Huge", 400);
doAnimalStufff(animal,"slow");
Dog dog= new Dog();
doAnimalStufff(dog, "fast");
    }
    public static void doAnimalStufff(Animal animal, String speed)
    {
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
    }
}
