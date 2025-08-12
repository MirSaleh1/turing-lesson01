package task03;

import java.util.Scanner;

public class CountryAndCityApp {
    public static void main(String[] args) {
        Runner runner = new Runner();
        Scanner input = new Scanner(System.in);
        boolean worked = true;
        while(worked){
            runner.menu();
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    runner.addCity();
                    break;
                case 2:
                    runner.addCountry();
                    break;
                case 3:
                    runner.deleteCity();
                    break;
                case 4:
                    runner.deleteCountry();
                    break;
                case 5:
                    runner.updateCity();
                    break;
                case 6:
                    runner.uptadeCountry();
                    break;
                case 7:
                    runner.showAll();
                    break;
                    case 8:
                        System.out.println("Exiting...");
                        worked = false;
                        break;
                default:
                    System.out.println("Wrong choice");

            }
        }
    }
}
