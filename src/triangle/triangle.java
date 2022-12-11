package triangle;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class triangle {
    protected double a , b , c , h;

    public triangle(double a, double b, double c, double h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.h = h;
    }

    public double getare()
    {
        return (c*h/2.0);
    }

    public double gethekef()
    {
        return (a+b+c);
    }
}
