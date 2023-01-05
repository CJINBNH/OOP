package OOP_lectures.lecture_01.ex_03;



public class program {
    public static void main(String[] args) {
        point2D a = new point2D(0, 2);

        System.out.println(a.getX());
        // point2D a = new point2D(0, 2);
        System.out.println(a.getX());
        System.out.println(a.getY());
        point2D b = new point2D(0);
        System.out.println(b);
        // point2D b = new point2D(0, 10);

        var dis = point2D.distance(a, b);
        System.out.println(dis);
    }
}
