package task02;

public class Taxi extends Vehicle{

    private int passengerCount;
    private String taxiCompany;

    public Taxi(String brand, String model, String plateNumber, boolean isAvailable,int passengerCount,String taxiCompany){
    super(brand,model,plateNumber,isAvailable);
    this.passengerCount=passengerCount;
    this.taxiCompany=taxiCompany;

    }
    public int getPassengerCount() {
        return passengerCount;
    }
    public void setPassengerCount(int passengerCount) {
        this.passengerCount = passengerCount;
    }
    public String getTaxiCompany() {
        return taxiCompany;
    }
    public void setTaxiCompany(String taxiCompany) {
        this.taxiCompany = taxiCompany;
    }
    public void calculateFare(int km){
        System.out.println("You are a good driver.");
    }
    public void calculateFare(int km, boolean nightShift){
        System.out.println("You are a good driver, but be careful when driving at night.");
    }


    @Override
    public void drive(){
        System.out.println("Taksi:"+ taxiCompany +'\n'+  "şirkətindən:"+passengerCount  + " sərnişinlə hərəkət edir.");
    }

    @Override
    public String toString() {
        return super.toString() +
                "passengerCount=" + passengerCount +
                ", taxiCompany='" + taxiCompany + '\'' +
                '}';
    }
}




