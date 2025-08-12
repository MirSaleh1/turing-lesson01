package task03;

import task03.City.CapitalCity;
import task03.City.City;
import task03.City.IndustrialCity;
import task03.City.TouristCity;
import task03.Country.AfricanCounty;
import task03.Country.AsianCounty;
import task03.Country.Country;
import task03.Country.EuropeanCountry;

import java.util.Scanner;

public class Runner {
    private static Country[] countries = new Country[100];
    private static City[] cities = new City[100];
    private static int cityCount = 0;
    private static int countryCount = 0;
    Scanner sc = new Scanner(System.in);

    public void addCity() {
        Country country = null;
        System.out.println("Please tell me which country it is a city in:");
        String name = sc.nextLine();
        for (int i = 0; i < countryCount; i++) {
            if (countries[i] != null && countries[i].getName().equals(name)) {
                country = countries[i];
                break;
            }
        }
        if (country == null) {
            System.out.println("Please enter a valid country name");
            return;
        }
        City newCity = null;
        System.out.println("Which type of city would you like to add?");
        System.out.println("1:Capital city\n" +
                "2:Industrial city\n" +
                "3:Tourist city");
        int choice = sc.nextInt();
        int id=0;String name1=null;long population1=0;boolean capital1=false;double area1=0;
        if(choice == 1 || choice == 2 || choice == 3) {
            System.out.println("Enter country details.");
            System.out.println("id:");
             id = sc.nextInt();
            sc.nextLine();
            System.out.println("name:");
            name1 = sc.nextLine();
            System.out.println("population:");
            population1 = sc.nextLong();
            System.out.println("is it capital y/n:");
            char capital = sc.next().charAt(0);
            boolean check=capital=='y';
            capital1 = check;
            System.out.println("area:");
             area1 = sc.nextDouble();

        }
        else{
            System.out.println("Please enter a valid number");
            return;
        }
        if (choice==1) {//int id, String name, long population, boolean isCapital, double area, Country country,String governmentType, int parliamentMembers, String mayorName

            System.out.println("governmentType:");
            String governmentType = sc.nextLine();
            sc.nextLine();
            System.out.println("parliament Members:");
            int parliamentMembers = sc.nextInt();
            sc.nextLine();
            System.out.println("mayor name:");
            String mayorName = sc.nextLine();

            newCity = new CapitalCity(id, name1, population1, capital1, area1, country, governmentType, parliamentMembers, mayorName);
        } else if (choice==2) {//int numberOfFactories, String mainIndustry, double annualProductionVolume




            System.out.println("number of factories:");
            int numberOfFactories = sc.nextInt();

            System.out.println("main industry:");
            String mainIndustry = sc.nextLine();
            sc.nextLine();
            System.out.println("annual production volume:");
            double annualProductionVolume = sc.nextDouble();

            newCity = new IndustrialCity(id, name1, population1, capital1, area1, country, numberOfFactories, mainIndustry, annualProductionVolume);
        } else if (choice==3) {//int annualVisitors ,String mainAttraction, double annualTourismRevenue



            System.out.println("annual visitors:");

            int annualVisitors = sc.nextInt();

            System.out.println("main attraction:");
            String mainAttraction = sc.nextLine();
            sc.nextLine();
            System.out.println("annual tourism revenue:");
            double annualTourismRevenue = sc.nextDouble();
            newCity = new TouristCity(id, name1, population1, capital1, area1, country, annualVisitors, mainAttraction, annualTourismRevenue);
        }
        if (newCity == null) return;

        if (cityCount < cities.length) {
            this.cities[cityCount] = newCity;
            cityCount++;
        }
        country.setCity(newCity);


    }

    public void addCountry() {

        System.out.println("what type of Country do you want to add?");
        System.out.println("1-African\n " +
                "2-Asian\n " +
                "3-Eurpean");
        int choice = sc.nextInt();
        Country country = null;int id=0;String name=null;String continent=null;long population=0;String code=null;
        if(choice == 1 || choice == 2 || choice == 3) {
            System.out.println("Enter city details.");
            System.out.println("id:");

            id = sc.nextInt();
            sc.nextLine();

            System.out.println("name:");
            name = sc.nextLine();

            System.out.println("continent:");
            continent = sc.nextLine();

            System.out.println("population:");
             population = sc.nextInt();

            sc.nextLine();
            System.out.println("code:");
             code = sc.nextLine();
        }
        else{
            System.out.println("Please enter a valid number");
            return;
        }

        if (choice==1) {//int id, String name, String continent, long population, String code,String mainLanguage,boolean isDeveloping,String currency


            System.out.println("main langugae:");
            String mainLanguage = sc.nextLine();


            System.out.println("is developing y/n:");

            char developing = sc.next().charAt(0);

            boolean isDeveloping = developing == 'y';

            sc.nextLine();

            System.out.println("currency:");
            String currency = sc.nextLine();

            country = new AfricanCounty(id, name, continent, population, code, mainLanguage, isDeveloping, currency);
        } else if (choice==2) {//int id, String name, String continent, long population, String code,double gdpPerCapita, boolean hasNuclearPower, String mainReligion


            System.out.println("gdp percapita:");
            double gdpPerCapita = sc.nextDouble();

            System.out.println("has nuclear power y/n:");

            char developing = sc.next().charAt(0);

            boolean hasNuclearPower = developing == 'y';
            sc.nextLine();
            System.out.println("main Religion:");
            String mainReligion = sc.nextLine();

            country = new AsianCounty(id, name, continent, population, code, gdpPerCapita, hasNuclearPower, mainReligion);


        } else if (choice==3) {//nt id, String name, String continent, long population, String code,double isInEuropeanUnion, String mainExport, int foundingYear


            System.out.println("is in EuropeanUnion y/n:");

            char developing = sc.next().charAt(0);

            boolean isInEuropeanUnion = developing == 'y';
            sc.nextLine();
            System.out.println("main Export:");
            String mainExport = sc.nextLine();
            System.out.println("founding year:");
            int year = sc.nextInt();

            country = new EuropeanCountry(id, name, continent, population, code, isInEuropeanUnion, mainExport, year);

        }
        if (country == null) return;

        if (countryCount < countries.length) {

            countries[countryCount] = country;
            countryCount++;
        }


    }

    public void deleteCity() {

        System.out.println("What is the name of the country to be deleted?");
        String name = sc.nextLine();

        for (int i = 0; i < cityCount; i++) {
            if (cities[i] != null && cities[i].getName().equals(name)) {
                Country country=cities[i].getCountry();
                if (country != null) {
                    country.deleteOwnCity(cities[i]);
                }

                for (int j = i; j < cityCount - 1; j++) {

                    cities[j] = cities[j + 1];


                }
                cities[cityCount - 1] = null;
                cityCount--;

                break;
            }
        }


    }

    public void deleteCountry() {
        System.out.println("What is the name of the country to be deleted?");
        String name = sc.nextLine();
        City []uptadeCities=new City[100];
        int newCityCount = 0;
        for (int i = 0; i < countryCount; i++) {
            if (countries[i] != null && countries[i].getName().equals(name)) {
                countries[i].setCities(null);
                for (int j = 0; j < cityCount; j++) {
                if(cities[j] != null && !cities[j].getCountry().getName().equalsIgnoreCase(name)){
                   uptadeCities[newCityCount]=cities[j];
                    newCityCount++;
                    }
                }
                System.arraycopy(uptadeCities, 0, cities, 0, 100);
                cityCount = newCityCount;

                for (int j = i; j < countryCount - 1; j++) {

                    countries[j] = countries[j + 1];
                }
                countries[countryCount - 1] = null;
                countryCount--;
                break;
            }
        }
    }

    public void updateCity() {//int id, String name, long population, boolean isCapital, double area, Country country,String governmentType, int parliamentMembers, String mayorName
        System.out.println("What is the name of the city to be updated?");
        String name = sc.nextLine();
        City uptadeCity=null;
        for (int i = 0; i < cityCount; i++) {

            if (cities[i] != null && cities[i].getName().equals(name)) {

                System.out.println("what do yo want to update?");
                System.out.println("1-name\n" +
                        "2-id\n" +
                        "3-population\n" +
                        "4-is Capital\n" +
                        "5-area\n");
                if (cities[i] instanceof CapitalCity) {
                   uptadeCity = cities[i];
                    System.out.println(

                            "6-government type\n" +
                                    "7-parliament members\n" +
                                    "8-mayor name\"" );


                } else if (cities[i] instanceof IndustrialCity) {//int id, String name, long population, boolean isCapital, double area, Country country, int numberOfFactories, String mainIndustry, double annualProductionVolume

                    uptadeCity =  cities[i];
                    System.out.println(

                            "6-number of factories\n" +
                                    "7-main industry\n" +
                                    "8-annual production volume\"" +
                                    "9-change countyr");


                } else if (cities[i] instanceof TouristCity) {//int id, String name, long population, boolean isCapital, double area, Country country,int annualVisitors ,String mainAttraction, double annualTourismRevenue

                    uptadeCity = cities[i];
                    System.out.println(

                            "6-annual visitors\n" +
                                    "7- main attraction\n" +
                                    "8-annual tourism revenue\"" +
                                    "9-change countyr");


                }

            if (uptadeCity != null) {
                int choice = sc.nextInt();
                sc.nextLine();
                if (choice == 1) {
                    System.out.println("new name:");
                    uptadeCity.setName(sc.nextLine());

                } else if (choice == 2) {
                    System.out.println("new id");
                    uptadeCity.setId(sc.nextInt());
                }
                else if (choice == 3) {
                    System.out.println("new Population:");
                    uptadeCity.setPopulation(sc.nextInt());
                }
                else if (choice == 4) {
                    System.out.println("is captial y/n");
                    char value = sc.next().charAt(0);
                    boolean check =value=='y';
                    uptadeCity.setCapital(check);
                }
                else if (choice == 5) {
                    System.out.println("new area:");
                    uptadeCity.setArea(sc.nextInt());
                }

                if (uptadeCity instanceof CapitalCity) {
                    CapitalCity capitalCity = (CapitalCity) uptadeCity;
                    if (choice==6){
                        System.out.println("new government type");
                        capitalCity.setGovernmentType(sc.nextLine());
                    }else if (choice==7){
                        System.out.println("parliament members");
                        capitalCity.setParliamentMembers(sc.nextInt());
                    }
                    else if (choice==8){
                        System.out.println("mayor name");
                        capitalCity.setMayorName(sc.nextLine());
                    }
                }
                if (uptadeCity instanceof IndustrialCity) {
                    IndustrialCity industrialCity = (IndustrialCity) uptadeCity;
                    if(choice==6){
                        System.out.println("number of factories");
                        industrialCity.setNumberOfFactories(sc.nextInt());
                    }
                    else if (choice==7){
                        System.out.println("main industry");
                        industrialCity.setMainIndustry(sc.nextLine());
                    }
                    else if (choice==8){
                        System.out.println("annual production volume");
                        industrialCity.setAnnualProductionVolume(sc.nextInt());
                    }

                }
                if (uptadeCity instanceof TouristCity) {
                    TouristCity touristCity = (TouristCity) uptadeCity;
                    if(choice==6){
                        System.out.println("annual visitors");
                        touristCity.setAnnualVisitors(sc.nextInt());
                    }
                    else if (choice==7){
                        System.out.println("main attraction");
                        touristCity.setMainAttraction(sc.nextLine());

                    }
                    else if (choice==8){
                        System.out.println("annual tourism revenue");
                        touristCity.setAnnualTourismRevenue(sc.nextInt());
                    }
                }
               }
            }
        }

    } public void uptadeCountry() {//int id, String name, String continent, long population, String code
        System.out.println("What is the name of the city to be updated?");
        String name = sc.nextLine();
        Country uptadeCountry = null;

        for (int i = 0; i < countryCount; i++) {

            if (countries[i] != null && countries[i].getName().equals(name)) {

                System.out.println("what do yo want to update?");
                System.out.println("1-name\n" +
                        "2-id\n" +
                        "3-continent\n" +
                        "4-population\n" +
                        "5-code\n");

                if (countries[i] instanceof AfricanCounty) {//int id, String name, String continent, long population, String code,String mainLanguage,boolean isDeveloping,String currency
                    uptadeCountry = countries[i];
                    System.out.println(

                            "6-main language\n" +
                                    "7-is developing\n" +
                                    "8-currency\"" );


                } else if (countries[i] instanceof AsianCounty) {//int id, String name, String continent, long population, String code,double gdpPerCapita, boolean hasNuclearPower, String mainReligion

                    uptadeCountry =  countries[i];
                    System.out.println(

                            "6-number of factories\n" +
                                    "7-main industry\n" +
                                    "8-annual production volume\"" );


                } else if (countries[i] instanceof EuropeanCountry) {//int id, String name, String continent, long population, String code,boolean isInEuropeanUnion, String mainExport, int foundingYear

                    uptadeCountry =countries[i];
                    System.out.println(

                            "6- is in europeanUnion\n" +
                                    "7- mainE export\n" +
                                    "8-founding year\"" );


                }
                if (uptadeCountry != null) {
                    int choice = sc.nextInt();
                    sc.nextLine();
                    if (choice == 1) {
                        System.out.println("new name:");
                        uptadeCountry.setName(sc.nextLine());

                    } else if (choice == 2) {
                        System.out.println("new id:");
                        uptadeCountry.setId(sc.nextInt());
                    }
                    else if (choice == 3) {
                        System.out.println("new Continent:");
                        uptadeCountry.setContinent(sc.nextLine());
                    }
                    else if (choice == 4) {
                        System.out.println("new Population:");
                        uptadeCountry.setPopulation(sc.nextInt());
                    }
                    else if (choice == 5) {
                        System.out.println("new Code:");
                        uptadeCountry.setCode(sc.nextLine());
                    }

                    if (uptadeCountry instanceof AfricanCounty) {
                        AfricanCounty  africanCounty = ( AfricanCounty) uptadeCountry;
                        if (choice==6){
                            System.out.println("new main language");
                            africanCounty.setMainLanguage(sc.nextLine());
                        }else if (choice==7){
                            System.out.println("new development volume y/n");
                            char value = sc.next().charAt(0);
                            boolean check =value=='y';
                            africanCounty.setDeveloping(check);
                        }
                        else if (choice==8){
                            System.out.println("currensy");
                            africanCounty.setCurrensy(sc.nextLine());
                        }
                    }
                    if (uptadeCountry instanceof AsianCounty) {
                        AsianCounty asianCounty = (AsianCounty) uptadeCountry;
                        if(choice==6){
                            System.out.println("gdp per capita");
                            asianCounty.setGdpPerCapita( sc.nextInt());
                        }
                        else if (choice==7){
                            System.out.println("has nuclear power y/n");
                            char value = sc.next().charAt(0);
                            boolean check =value=='y';
                            asianCounty.setHasNuclearPower( check);

                        }
                        else if (choice==8){
                            System.out.println("main religion");
                            asianCounty.setMainReligion(sc.nextLine());
                        }

                    }
                    if (uptadeCountry instanceof EuropeanCountry) {
                        EuropeanCountry  europeanCountry = ( EuropeanCountry) uptadeCountry;
                        if(choice==6){
                            System.out.println("is in eropean union y/n");
                            char value = sc.next().charAt(0);
                            boolean check =value=='y';
                            europeanCountry.setIsInEuropeanUnion(check);
                        }
                        else if (choice==7){
                            System.out.println("main export");
                            europeanCountry.setMainExport(sc.nextLine());

                        }
                        else if (choice==8){
                            System.out.println("found year ");
                            europeanCountry.setFoundingYear(sc.nextInt());
                              }
                         }
                     }
                 }
            }
        }
        public void showAll(){
        if(countryCount!=0) {
            System.out.println("All countries");
        }else {
            System.out.println("countries do not exist");
            return;
        }
        for (int i = 0; i < countryCount; i++) {
            System.out.println(countries[i]);
        }
        if(cityCount!=0) {
            System.out.println("All cities");
        }
        else{
            System.out.println("cities do not exist");
            return;
        }
        for (int i = 0; i < cityCount; i++) {
            System.out.println(cities[i]);
        }
        }
        public void menu(){
            System.out.println("1.Add City\n" +
                    "2.Add Country\n" +
                    "3.Delete City\n" +
                    "4.Delete Country\n" +
                    "5.Uptade City\n" +
                    "6.Uptade Country\n" +
                    "7.Show All\n" +
                    "8-Exit");
        }
    }


