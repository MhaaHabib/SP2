import java.util.ArrayList;

public class FleetOfCars {

    ArrayList<Car> cars = new ArrayList <>();

    void addfleetOfCars (Car car){
        cars.add(car);
    }
@Override

    public String toString(){
StringBuilder builder= new StringBuilder("Fleet of cars: \n ");
       for( Car car:cars){
           builder.append(car.toString()).append("\n");
       }
       return builder.toString();
    }

    int getTotalRegistrationFeeForFleet() {
        int totalFee = 0;
        for (Car car:cars){
            totalFee+=car.getRegistrationFee();

        }

        return totalFee;
    }
}
