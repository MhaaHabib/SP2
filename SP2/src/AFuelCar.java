public abstract class AFuelCar extends ACar {

    protected int kmPrLitre;

    public AFuelCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPrLitre) {
        //så jeg ikke behøver instatere igen fordi i ACar klasse har jeg allerede gjort det
        super(registrationNumber, make, model, numberOfDoors);
        this.kmPrLitre = kmPrLitre;

    }

    public abstract String getFuelType();

    public int getKmPrLitre(int kmPrLitre) {
        return kmPrLitre;
    }
}


          /*  @Override

    public String toString(){

       return "getFuelType"+getFuelType() + "kmPrLitre" + kmPrLitre;


    }
*/
