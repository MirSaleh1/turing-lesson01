package task03;

import java.util.Scanner;

public class CountyrandCtiyApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Country[]countries=new Country[100];
        City[]cities=new City[100];
        City[]globalCities=new City[100];

        while(true){
            menu();
            int choice = input.nextInt();
            switch (choice){
                case 1:Country country=addCountry(countries);
                for (int i=0;i<countries.length;i++) {
                    if(countries[i]==null){
                        countries[i]=country;
                    }
                }break;
                case 2: for (Country country1 : countries) {
                    for(int j=0;countries.length>j;j++){
                        if(countries[j]==null) {
                            countries[j] = country1;
                            System.out.println(country1.getName());
                            break;
                        }
                    }
                    System.out.println("olkeni secin");
                    String name=input.next();
                    if (country1.getName().equals(name)) {
                        country = country1;
                        City newname = null;
                        for (int i = 0; i < globalCities.length; i++) {
                            if (globalCities[i] == null) {
                                globalCities[i] = addCity(country);
                                newname = globalCities[i];

                                break;
                            }
                        }
                        country1.setCities(newname, cities);
                        break;
                    }

                }break;

                case 3:System.out.println("olkeni uptade etmek isteyirsense 1  sehir uptade etmek isteyirsnse 2");
                int choice1 = input.nextInt();
                    if(choice1==1){
                        updateCountry(countries);
                    }
                    else if(choice1==2){
                        updateCity(countries,cities);
                    }
                    else{
                        System.out.println("inviable coise");
                    }
                }

            }
        }




    public static void menu(){
        System.out.println("Welcome to App\n 1:Add country\n 2:Add city\n 3:upted countyr or city\n 4: Delete country or city\n 5:show all\n 6:close");
    }

    public static Country addCountry(Country[] countries){

        Country newcountr=new Country();
        System.out.println("Which type of country would you like to add? ");
        System.out.println("1:African\n 2:Asian\n 3:European");
        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();
        boolean complete;
        if(choice==1){
            System.out.println("select skils");
            System.out.println("idisi");  int id = input.nextInt();
            System.out.println("name"); String name = input.next();
            System.out.println("countinet");  String countinet = input.next();
            System.out.println("population");  long population = input.nextLong();
            System.out.println("code"); String code= input.next();
            System.out.println("city count");  int cityCount = input.nextInt();
            System.out.println("mainLanguage"); String mainLanguage = input.next();
            System.out.println("isdecloping");  boolean isDecloping=input.nextBoolean();
            System.out.println("currensy"); String currensy=input.next();
           newcountr=new AfricanCountry(id,name,countinet,population,code,null,cityCount,mainLanguage,isDecloping,currensy);


            complete=true;
        }else if(choice==2){
            System.out.println("select skils");

            System.out.println("idisi"); int id = input.nextInt();
            System.out.println("name");   String name = input.next();
            System.out.println("countinet");   String countinet = input.next();
            System.out.println("population"); long population = input.nextLong();
            System.out.println("code"); String code= input.next();
            System.out.println("city count"); int cityCount = input.nextInt();

            System.out.println("gdpeCaital");   double gdpeCapital = input.nextDouble();
            System.out.println("hasnuclerpower");  boolean hasNuclerpower=input.nextBoolean();

            System.out.println("mainreligion"); String mainReligion=input.next();
             newcountr=new AsianCountry(id,name,countinet,population,code,null,cityCount,gdpeCapital,hasNuclerpower,mainReligion);

            complete=true;
        }
        else if(choice==3){
            System.out.println("select skils");
            System.out.println("id");   int id = input.nextInt();
            System.out.println("name");  String name = input.next();
            System.out.println("countinet");  String countinet = input.next();
            System.out.println("population");  long population = input.nextLong();
            System.out.println("code");   String code= input.next();
            System.out.println("city count");   int cityCount = input.nextInt();

            System.out.println("isieropeanunion");  boolean isinEuropeanUnion=input.nextBoolean();
            System.out.println("mainexport"); String mainExprot = input.next();
             newcountr=new EuropeanCountry(id,name,countinet,population,code,null,cityCount,isinEuropeanUnion, mainExprot);

            complete=true;
        }
        else{
            System.out.println("Invalid choice");
            complete=false;
        }
        for(int i=0;i<countries.length;i++){
            if(countries[i]==null){
                countries[i]=newcountr;
            }
        }
      return newcountr;

    }

    public static City addCity(Country country){


        Scanner input = new Scanner(System.in);
        City newcity=new City();
        City [] globalcity= new City[10];
            System.out.println("Which type of city would you like to add? ");
            System.out.println("1:Capital\n 2:Industrial\n 3:Tourist");
            int choice = input.nextInt();
            if(choice==1){
                System.out.println("Select skils");
                System.out.println("id");   int id = input.nextInt();
                System.out.println("name");  String name = input.next();
                System.out.println("iscpatial"); boolean isCapital=input.nextBoolean();
                System.out.println("population"); long population=input.nextLong();
                System.out.println("area"); double area=input.nextDouble();
                System.out.println("gaverment"); String govermentType=input.next();
                System.out.println("parlament"); int parlamentMembers=input.nextInt();
                System.out.println("mayor"); String mayorName=input.next();
                 newcity=new CapitalCity(id,name,population,isCapital,area,country,govermentType,parlamentMembers,mayorName);

                for (int i=0 ; i<globalcity.length ; i++){
                    if(globalcity[i]==null){
                        globalcity[i]=newcity;
                        break;
                    }
                }
                System.out.println(country.getName()+"bu olkenin"+newcity.getName()+"bu seheridi");

            }else if(choice==2){
                System.out.println("Select skils");
                System.out.println("id");   int id = input.nextInt();
                System.out.println("name");  String name = input.next();
                System.out.println("iscpatial");  boolean isCapital=input.nextBoolean();
                System.out.println("population"); long population=input.nextLong();
                System.out.println("area");  double area=input.nextDouble();
                System.out.println("annualVisitors");  int annualVisitors=input.nextInt();
                System.out.println("mainAttraction"); String mainAttraction=input.next();
                System.out.println("annualToursimRevenue");   double annualTourismRevenue=input.nextDouble();
                newcity=new TouristCity(id,name,population,isCapital,area,country,annualVisitors,mainAttraction,annualTourismRevenue);

                for (int i=0 ; i<globalcity.length ; i++){
                    if(globalcity[i]==null){
                        globalcity[i]=newcity;
                        break;
                    }
                }
                System.out.println(country.getName()+"bu olkenin"+newcity.getName()+"bu seheridi");

            }  else if(choice==3){
                System.out.println("Select skils");
                System.out.println("id");  int id = input.nextInt();
                System.out.println("name");  String name = input.next();
                System.out.println("iscapital"); boolean isCapital=input.nextBoolean();
                System.out.println("population"); long population=input.nextLong();
                System.out.println("area");  double area=input.nextDouble();
                System.out.println("numberoffactories");  int nuberofFactories=input.nextInt();
                System.out.println("mainlndustyr"); String mainlndustyr=input.next();
                System.out.println("annualProductionVolume");  double annualProductionVolume=input.nextDouble();
                 newcity=new IndustrialCity(id,name,population,isCapital,area,country,nuberofFactories,mainlndustyr,annualProductionVolume);

                for (int i=0 ; i<globalcity.length ; i++){
                    if(globalcity[i]==null){
                        globalcity[i]=newcity;
                        break;
                    }
                }
                System.out.println(country.getName()+"bu olkenin"+newcity.getName()+"bu seheridi");


            }
            else{
                System.out.println("Invalid choice");
            }
            return newcity;

        }
        public static void updateCity( Country []country,City[]cities) {
            System.out.println("hamsi olkenin sherini upatde etmek isteryirsen");
            Scanner sc=new Scanner(System.in);
            for (Country country1 : country) {
            String name1=sc.next();
            if (country1.getName().equals(name1)) {
                System.out.println("which city do you want uptade");
                String name3=sc.next();
                for (City city : country1.getCities()) {
                    if (city.getName().equals(name3)) {
                        System.out.println("seherin yeni adini yazin");
                        String name2=sc.next();
                        city.setName(name2);
                        country1.setCities(city,cities);
                        city.setGlobalcities(city,name2,cities);
                    }


                }

            }
        }
    }
    public static void updateCountry(Country []country) {
        System.out.println("hansi olkeni upatde etmek isteryirsen");
        Scanner sc=new Scanner(System.in);
        for (Country country1 : country) {
            String name1=sc.next();
            if (country1.getName().equals(name1)) {
                System.out.println("olkenin yeni adini yazin");
                String name2=sc.next();
            country1.setName(name2);}
            break;
        }
    }




    }



