package triangle;

public class Triangle90 extends triangle{
    public Triangle90(double a, double b, double c) {
        super(a,b,c,c);

        this.a = a;
        this.b = b;
        this.c = c;

    }
    @Override
    public double getare() {
        return (a*b/2);
    }
}
