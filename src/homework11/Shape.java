package homework11;

import java.util.Scanner;

//EX6
public abstract class Shape {

    public abstract void setSides(ShapeType type, double... sides);

    public abstract double getArea(ShapeType type);
    public abstract double getPerimeter(ShapeType type);

}
