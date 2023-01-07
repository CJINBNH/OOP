package OOP_seminars.seminar_02.Task0;

public class SquareShape extends Shape {
    private float side; // поле - сторона квадрата

    
    public SquareShape(float side) {
        this.side = side;
    }

    @Override
    public float getArea() {
        return side * side;
    }

    @Override
    public float getPerimeter() {
        return side * 4;
    }

    @Override
    public String toString() {
        return "SquareShape [side=" + side + "]";
    }
}
