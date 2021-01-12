public class Main {
    public static void main(String[] args) {
        Point point2D = new Point(3, 4);
        System.out.println(point2D.toString());
        MoveablePoint moveablePoint = new MoveablePoint(5, 6, 2, 1);
        System.out.println(moveablePoint.toString());
        moveablePoint.move();
        System.out.println(moveablePoint.toString());
    }

}
