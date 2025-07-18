package task02;

public class DriveApp {

    public static void main(String[] args) {

        Vehicle v1=new Taxi("mercedes","c200","123321",true,3,"189TAxi");
        Vehicle v2=new Bus("volvo","volvo 9600","321123",true,45,false);
        v1.drive();
        v2.drive();
        if (v1 instanceof  Taxi){
            Taxi taxi=(Taxi)v1;
            taxi.calculateFare(1500);
            taxi.calculateFare(1500,true);
        }
        Driver driver=new Driver("Saleh",43,"332211");
        String about=driver.toString();
        System.out.println(about);

        driver.getName();
        driver.getLicenseNumber();
        driver.getAge();

        driver.setName("Mir Saleh");
        driver.setLicenseNumber("112233");
        driver.setAge(20);

        System.out.println(v1.toString());
        System.out.println(v2.toString());
        System.out.println(driver.toString());


    }
}
