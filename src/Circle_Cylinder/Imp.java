package Circle_Cylinder;

import java.util.Scanner;

public class Imp {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0, "blue");
        System.out.println(circle.toString());
        Cylinder cylinder = new Cylinder(4.0, "yellow", 5.5);
        System.out.println(cylinder.toString());
    }
}
