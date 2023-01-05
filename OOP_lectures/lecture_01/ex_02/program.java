package OOP_lectures.lecture_01.ex_02;

public class program {
    static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    static double distance(ex_02 a, ex_02 b) {
        return Math.sqrt(Math.pow(a.x - b.x, 2) + Math.pow(a.y - b.y, 2));
    }

    public static void main(String[] args) {
        ex_02 a = new ex_02();
        a.x = 0;
        a.y = 2;
        System.out.println(a.toString());

        ex_02 b = new ex_02();
        b.x = 0;
        b.y = 10;
        System.out.println(b.toString());
        System.out.println(distance(a, b));
        
    }
}
