package task03;

public class City {
    public boolean governmentType;
    private int id;
    private String name;
    private long population;
    private boolean isCapital;
    private double area;
    private Country country;
    private City[] globalcities;
public City(){

}
public City(City []globalcities){
    this.globalcities=globalcities;
}
    public City(int id, String name, long population, boolean isCapital, double area, Country country) {
        this.id = id;
        this.name = name;
        this.population = population;
        this.isCapital = isCapital;
        this.area = area;
        this.country = country;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public long getPopulation() {
        return population;
    }

    public boolean isCapital() {
        return isCapital;
    }

    public double getArea() {
        return area;
    }

    public Country getCountry() {
        return country;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    public void setCapital(boolean capital) {
        isCapital = capital;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public City[] getGlobalcities() {
        return globalcities;
    }

    public void setGlobalcities(City city,String name,City []globalcities) {
    this.globalcities=globalcities;
       for(int i=0;i<globalcities.length;i++){
           if(globalcities[i]==city){
               city.setName(name);

           }
           }
       }
    }


