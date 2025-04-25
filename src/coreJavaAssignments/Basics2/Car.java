package coreJavaAssignments.Basics2;
import java.security.KeyStore;
public class Car {
    private String make="Tesla";
    private String model="X Model";
    private String color=" White ";
    private int doors=2;
    private boolean convertible = true;
    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getDoors() {
        return doors;
    }

    public boolean isConvertible() {
        return convertible;
    }

    public void describeCar()
    {
        System.out.println(doors+" -Doors  "+color+" "+model+"  "+make+" "+(convertible?" Convertible ":" "));
    }

}
