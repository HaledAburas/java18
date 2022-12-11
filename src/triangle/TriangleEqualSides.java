package triangle;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class TriangleEqualSides extends triangle {


    private double a;
    private double c;

    private double h;

    public TriangleEqualSides(double a, double b, double c,double h) {
        super(a,a,c,h);
        this.a = a;
        this.c = c;
        this.h=h;

    }

    @Override
    public double gethekef() {
        return (a*2+c);
    }
}
