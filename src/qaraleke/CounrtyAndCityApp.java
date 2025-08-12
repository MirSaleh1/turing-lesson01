package qaraleke;

import java.util.Scanner;

public class CounrtyAndCityApp {
    static Counrty[] counrties = new Counrty[100];
    static City[] globalCities = new City[100];
    static int countryCount = 0;
    static int cityCount = 0;

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Welcome to the Counrty And task03.City App");
            menuShow();
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    addCity();
                    break;
                case 2:
                    addCountry();
                    break;
                case 3:
                    deleteCity();
                    break;
                case 4:
                    removeCountry();
                    break;
                case 5:
                    updateCity();
                    break;
                case 6:
                    updateCounrty();
                    break;
                case 7:
                    showAll();
                    break;
                    default:
                        System.out.println("Wrong choice");

            }

        }
    }

    public static void menuShow() {
        System.out.println("1.Add task03.City\n" +
                "2.Add task03.Country.Country\n" +
                "3.Delete task03.City\n" +
                "4.Delete task03.Country.Country\n" +
                "5.Uptade task03.City\n" +
                "6.Uptade task03.Country.Country\n" +
                "7.Show All\n" +
                "8-Exit");
    }


    public static void addCity() {
        Scanner input = new Scanner(System.in);

        boolean done = true;
        while (done) {
            System.out.println("Enter County Name:");
            String countyName = input.nextLine();
            City city = new City();
          /*  for(int i=0;i<counrties.length;i++){
            if(counrties[i]!=null){

            }else {
                System.out.println("we dont have any counrties");
                return;
            }
            }*/

            for (int i = 0; i < counrties.length; i++) {
                if (counrties[i] != null && counrties[i].getName().equals(countyName)) {
                    System.out.println("Chose your conutry type");
                    System.out.println("1-Capital\n" +
                            "2-Tourist\n" +
                            "3-Industiral");
                    int choice = input.nextInt();
                    if (choice == 1) {
                        System.out.println("Enter task03.City skills");
                        System.out.println("id");
                        int id = input.nextInt();
                        input.nextLine();
                        System.out.println("name:");
                        String name = input.nextLine();
                        System.out.println("population:");
                        long population = input.nextInt();
                        input.nextLine();
                        System.out.println("Capital: only answer with true or false");
                        boolean capital = input.nextBoolean();
                        System.out.println("arre only input numbers:");
                        double arre = input.nextDouble();
                        input.nextLine();
                        System.out.println("governmnet type:");
                        String governmnet = input.nextLine();
                        System.out.println("parliament members:");
                        int parliament = input.nextInt();
                        input.nextLine();
                        System.out.println("mayor name:");
                        String mayorName = input.nextLine();
                        City newcity = new CapitalCity(id, name, population, capital, arre, counrties[i], governmnet, parliament, mayorName);
                        city = newcity;


                    } else if (choice == 2) {
                        System.out.println("Enter task03.Country.Country skills");
                        System.out.println("id");
                        int id = input.nextInt();
                        input.nextLine();
                        System.out.println("name:");
                        String name = input.nextLine();
                        System.out.println("population:");
                        long population = input.nextInt();
                        input.nextLine();
                        System.out.println("Capital: only answer with true or false");
                        boolean capital = input.nextBoolean();
                        System.out.println("arre only input numbers:");
                        double arre = input.nextDouble();
                        System.out.println("annual visitors:");
                        int annualVisitors = input.nextInt();
                        input.nextLine();
                        System.out.println("main attraction:");
                        String mainAttraction = input.nextLine();
                        System.out.println("annual tourism revenue");
                        double annualTourismRevenue = input.nextDouble();
                        City newcity = new TouristCity(id, name, population, capital, arre, counrties[i], annualVisitors, mainAttraction, annualTourismRevenue);
                        city = newcity;
                    } else if (choice == 3) {
                        System.out.println("Enter task03.Country.Country skills");
                        System.out.println("id");
                        int id = input.nextInt();
                        input.nextLine();
                        System.out.println("name:");
                        String name = input.nextLine();
                        System.out.println("population:");
                        long population = input.nextInt();
                        System.out.println("Capital: only answer with true or false");
                        boolean capital = input.nextBoolean();
                        System.out.println("arre only input numbers:");
                        double arre = input.nextDouble();
                        System.out.println("number of factories:");
                        int numberOfFactories = input.nextInt();
                        System.out.println("main industry:");
                        String mainIndustry = input.nextLine();
                        System.out.println("annual producttion vloume:");
                        double annualProducttionVloume = input.nextDouble();
                        City newcity = new IndustrialCity(id, name, population, capital, arre, counrties[i], numberOfFactories, mainIndustry, annualProducttionVloume);
                        city = newcity;

                    }
                    globalCities[cityCount] = city;
                    counrties[i].addCities(city);
                    System.out.println("your city added");
                    cityCount++;
                    done = false;
                    break;
                }

            }
            if (done != true) {

                System.out.println("This country does not exist");
            }
        }
    }

    public static void addCountry() {

        Scanner input = new Scanner(System.in);

        boolean done = true;

        Counrty counrty = new Counrty();

        while (done) {

            System.out.println("what type of task03.Country.Country do you want to add?");
            System.out.println("1-African\n " +
                    "2-Asian\n " +
                    "3-Eurpean");

            int choice = input.nextInt();

            if (choice == 1) {
                System.out.println("Enter task03.Country.Country skills");
                System.out.println("id:");
                int id = input.nextInt();
                input.nextLine();
                System.out.println("name:");
                String name = input.nextLine();
                System.out.println("continent:");
                String continent = input.nextLine();
                System.out.println("population:");
                long population = input.nextInt();
                input.nextLine();
                System.out.println("code:");
                String code = input.nextLine();
                System.out.println("citycount:");
                int cityCount = input.nextInt();
                input.nextLine();
                System.out.println("main langugae:");
                String mainLanguage = input.nextLine();
                System.out.println("is developing:");
                boolean developing = input.nextBoolean();
                input.nextLine();
                System.out.println("currency:");
                String currency = input.nextLine();

                Counrty newcountyr = new AfricanCountry(id, name, continent, population, code, mainLanguage, developing, currency);

                counrty = newcountyr;

            } else if (choice == 2) {

                System.out.println("Enter task03.Country.Country skills");
                System.out.println("id:");
                int id = input.nextInt();
                input.nextLine();
                System.out.println("name:");
                String name = input.nextLine();
                System.out.println("continent:");
                String continent = input.nextLine();
                System.out.println("population:");
                long population = input.nextInt();
                input.nextLine();
                System.out.println("code:");
                String code = input.nextLine();
                System.out.println("citycount:");
                int cityCount = input.nextInt();
                input.nextLine();
                System.out.println("gdp per capital:");
                double gdpPerCapital = input.nextDouble();
                System.out.println("has nuclear power:");
                boolean hasNuclearPower = input.nextBoolean();
                input.nextLine();
                System.out.println("main religion:");
                String mainReligion = input.nextLine();

                Counrty newcountyr = new AsianCountry(id, name, continent, population, code, gdpPerCapital, hasNuclearPower, mainReligion);

                counrty = newcountyr;
            } else if (choice == 3) {

                System.out.println("Enter task03.Country.Country skills");
                System.out.println("id:");
                int id = input.nextInt();
                input.nextLine();
                System.out.println("name:");
                String name = input.nextLine();
                System.out.println("continent:");
                String continent = input.nextLine();
                System.out.println("population:");
                long population = input.nextInt();
                input.nextLine();
                System.out.println("code:");
                String code = input.nextLine();
                System.out.println("citycount:");
                int cityCount = input.nextInt();
                input.nextLine();
                System.out.println("is in european union:");
                boolean isInEuropeanUnion = input.nextBoolean();
                input.nextLine();
                System.out.println("main export:");
                String mainExprot = input.nextLine();

                Counrty newcountyr = new EuropeanCountry(id, name, continent, population, code, isInEuropeanUnion, mainExprot);

                counrty = newcountyr;
            }
            counrties[countryCount] = counrty;
            countryCount++;
            done = false;
        }
    }

    public static void deleteCity() {
        boolean done = false;
        Scanner input = new Scanner(System.in);

        System.out.println("Which country's city do you want to delete?");
        String name = input.nextLine();

        City[] newGlobalCities = new City[cityCount - 1];

        for (int i = 0; i < counrties.length; i++) {

            if (counrties[i] != null && counrties[i].getName().equals(name)) {
                System.out.println("Which city do you want to delete?");
                String cityName = input.nextLine();


                counrties[i].removeCities(cityName);


                for (int j = 0; j < globalCities.length; j++) {

                    if (globalCities[j] != null && globalCities[j].getName().equals(cityName)) {
                        continue;
                    }
                    if (j < newGlobalCities.length) {
                        newGlobalCities[j] = globalCities[j];
                    }
                }

                globalCities = newGlobalCities;
                done = true;
                cityCount--;
                break;
            }
        }
        if (!done) {
            System.out.println("There are no cities to delete");
        }
    }

    public static void removeCountry() {
        System.out.println("Which country do you want to delete?");
        boolean done = false;
        boolean done1 = false;
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        Counrty[] newCounrties = new Counrty[counrties.length - 1];
        int count = 0;
        City[] removeCities = new City[0];

        for (int i = 0, j = 0; i < counrties.length; i++) {
            if (counrties[i] != null && counrties[i].getName().equals(name)) {
                if (counrties[i].getCities() != null) {
                    removeCities = counrties[i].removeCountrySCity();
                    for (int l = 0; l < globalCities.length; l++) {
                        for (int m = 0; m < removeCities.length; m++) {
                            if (globalCities[l].getName().equals(removeCities[m].getName())) {
                                globalCities[l] = null;
                                count++;

                            }
                        }

                    }
                    City[] newglobalCities = new City[globalCities.length - count];
                    for (int l = 0, m = 0; l < globalCities.length; l++) {
                        if (globalCities[l] != null) {
                            continue;
                        }
                        if (m < newglobalCities.length) {
                            newglobalCities[m++] = globalCities[l];

                        }
                    }
                    done = true;
                    done1 = true;
                    cityCount -= count;
                    continue;
                }
                if (!done) {
                    done1 = true;
                    continue;
                }

                if (j < newCounrties.length) {

                    newCounrties[j++] = counrties[i];
                }
            }
        }

        if (done1) {
            countryCount--;
            counrties = newCounrties;

        }
        if (!done1) {
            System.out.println("This country doesn't exist!");
        }


    }

    public static void updateCity() {
        Scanner input = new Scanner(System.in);
        int choice;
        String name;
        boolean done = true;
        boolean done1 = false;
        System.out.println("Which  city do you want to uptade?");

        name = input.nextLine();

        while (done) {

            for (int i = 0; i < cityCount; i++) {
                if (globalCities[i] != null && globalCities[i].getName().equals(name)) {


                    if(globalCities[i] instanceof CapitalCity) {
                        done1 = true;
                        System.out.println("Which skills do you want to uptade?");
                        System.out.println("1-name\n" +
                                "2-id\n" +
                                "3-population\n" +
                                "4-exit");
                        choice = input.nextInt();
                    switch (choice) {
                        case 1:
                            System.out.println("new name");
                            input.nextLine();
                             name = input.nextLine();
                           globalCities[i].setName(name);
                            break;
                        case 2:
                            System.out.println("new id");
                            choice = input.nextInt();
                            input.nextLine();

                            globalCities[i].setId(choice);
                            break;
                        case 3:
                            System.out.println("new population");
                            choice = input.nextInt();
                            input.nextLine();
                            globalCities[i].setPopulation(choice);
                            break;
                        case 4:
                            System.out.println("exit");
                            input.nextLine();
                            done = false;
                            break;
                    }
                    } else if (globalCities[i]instanceof TouristCity) {
                            done1 = true;
                        System.out.println("Which skills do you want to uptade?");
                        System.out.println("1-name\n" +
                                "2-id\n" +
                                "3-population\n" +
                                "4-exit");
                        choice = input.nextInt();
                        switch (choice) {

                        }

                    } else if (globalCities[i] instanceof IndustrialCity) {
                        done1 = true;
                        System.out.println("Which skills do you want to uptade?");
                        System.out.println("1-name\n" +
                                "2-id\n" +
                                "3-population\n" +
                                "4-exit");
                        choice = input.nextInt();
                        switch (choice) {

                        }
                    }

                }if(!done1) {
                    System.out.println("We couldn't find anything");
                    return;
                }

            }
        }

    }

    public static void updateCounrty() {
        Scanner input = new Scanner(System.in);
        int choice;
        String name;
        boolean done = true;
        boolean done1 = true;
        System.out.println("Which  country do you want to uptade?");
        name = input.nextLine();
        while (done) {

            for (int i = 0; i < countryCount; i++) {
                if (counrties[i] != null && counrties[i].getName().equals(name)) {
                    done1 = false;
                    System.out.println("Which skills do you want to uptade?");
                    System.out.println("1-name\n" +
                            "2-id\n" +
                            "3-population\n" +
                            "4-continet\n" +
                            "5-exit");
                    choice = input.nextInt();
                    switch (choice) {
                        case 1:
                            System.out.println("new name");
                            input.nextLine();
                            name = input.nextLine();

                            counrties[i].setName(name);
                            break;
                        case 2:
                            System.out.println("new id");
                            choice = input.nextInt();
                            counrties[i].setId(choice);
                            break;
                        case 3:
                            System.out.println("new population");
                            input.nextLine();
                            choice = input.nextInt();

                            counrties[i].setPopulation(choice);
                            break;
                        case 4:
                            System.out.println("new continet");
                            name = input.nextLine();
                            input.nextLine();
                            counrties[i].setContinet(name);
                            break;
                        case 5:
                            System.out.println("exit");
                            done = false;
                            input.nextLine();
                            break;

                    }
                }if (done1) {
                    System.out.println("This country doesn't exist!");
                    break;
                }

            }
        }

    }

    public static void showAll() {
       for (int i = 0; i < countryCount; i++) {
           counrties[i].show();
       }
        System.out.println("All counrties");
       for (int i = 0; i < countryCount; i++) {
           System.out.println(counrties[i].toString());

       }
        System.out.println("All cities");
       for (int i = 0; i < cityCount; i++) {
           System.out.println(globalCities[i].toString());
       }
    }
}




