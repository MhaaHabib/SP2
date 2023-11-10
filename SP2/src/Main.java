import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        FleetOfCars foc = new FleetOfCars();

        Car car1 = new GasolineCar(" NM2987958 ", " BMW ", " X1 ", 5, 58);
        Car car2 = new DieselCar (" KL289074 "," Skoda ", " Karoq ", 5, 17, true);
        Car car3 = new ElectricCar(" DJ847308 ", " Tesla" , " model3 ", 5, 100, 614);

        foc.addfleetOfCars(car1);
        foc.addfleetOfCars (car2);
        foc.addfleetOfCars (car3);

        System.out.println(foc.toString());
        System.out.println("registrations fee for the fleet is: " + foc.getTotalRegistrationFeeForFleet());







    }
}
