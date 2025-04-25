package coreJavaAssignments.Basics2;

public class Main
{
    public static void main(String[] args) {
Car car= new Car();
car.setColor("Brown");
car.setConvertible(true);
car.setDoors(2);
car.setMake("Tesla");
car.setModel("Ymodel");

car.describeCar();
        Car targa= new Car();
        targa.setColor("Red");
        targa.setConvertible(false);
        targa.setDoors(2);
        targa.setMake("Porsche");
        targa.setModel("Zmodel");
        targa.describeCar();
    }
}
