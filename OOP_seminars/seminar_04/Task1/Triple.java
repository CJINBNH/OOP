package OOP_seminars.seminar_04.Task1;

public class Triple<First, Second, Third> {
    
    private First first;
    private Second second;
    private Third third;
    
    public Triple(First first, Second second, Third third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public First getFirst() {
        return first;
    }

    public Second getSecond() {
        return second;
    }

    public Third getThird() {
        return third;
    }

    @Override
    public String toString() {
        return "Triple (" + first + 
        ", " + second + 
        ", " + third + ")";
    }
    
}
