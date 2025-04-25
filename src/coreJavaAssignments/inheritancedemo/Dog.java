package coreJavaAssignments.inheritancedemo;
public class Dog extends Animal{
  private String earshape;
  private String tailshape;
    public Dog() {
        super("mutt ", "medium heavy ", 300);
    }
    public Dog(String type, String size, double weight, String earshape, String tailshape) {
        super(type, size, weight);
        this.earshape = earshape;
        this.tailshape = tailshape;
    }
    @Override
    public String toString() {
        return "Dog{" +
                "earshape='" + earshape + '\'' +
                ", tailshape='" + tailshape + '\'' +
                "} " + super.toString();
    }    }
