package coreJavaAssignments.poolAreaAssignment;

public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double getLength() {
        if(length<0)
        {return 0;}else
        return length;
    }

    public double getWidth() {
        if(width<0)
        {return 0;  }else
        return width;
    }
    public double getArea()
    {
        return getLength()*getWidth();
    }
}
