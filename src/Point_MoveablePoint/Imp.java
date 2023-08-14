package Point_MoveablePoint;

public class Imp {
    public static void main(String[] args) {
        Point point = new Point(5, 7);
        System.out.println(point.toString());
        MoveablePoint moveablePoint = new MoveablePoint(3, 4, 8, 9);
        System.out.println(moveablePoint.toString());
    }
}
