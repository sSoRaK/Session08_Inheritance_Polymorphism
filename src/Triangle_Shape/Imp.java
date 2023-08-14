package Triangle_Shape;

public class Imp {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(3, 5, 5);
        System.out.println(triangle.toString());
        Shape shape = new Shape(2, 5, 6, "blue");
        System.out.println(shape.toString());
    }
}
