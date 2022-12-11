package vehicle;

public class vehicleMain {
    public static void main(String[] args) {

        vehicle c = new car();
        truck t = new truck();
        vehicle v = new vehicle();

        c.vehicleinfo();
        t.vehicleinfo();
        v.vehicleinfo();
    }
}
