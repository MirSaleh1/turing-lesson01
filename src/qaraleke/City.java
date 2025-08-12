package qaraleke;

public class City {
    private int id;
    private String name;
    private long population;
    private boolean isCapital;
    private double area;
    private Counrty counrty;

    public City(int id, String name, long population, boolean isCapital, double area,Counrty counrty) {
        this.id = id;
        this.name = name;
        this.population = population;
        this.isCapital = isCapital;
        this.area = area;
        this.counrty = counrty;
    }
    public City(){

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

    public Counrty getCounrty() {
        return counrty;
    }

    public void setCounrty(Counrty counrty) {
        this.counrty = counrty;
    }
    public City[]addCity(City city) {
        City[] globalCities=new City[100];
        for (int i = 0; i < globalCities.length; i++) {
            if(globalCities[i]==null){
                globalCities[i]=city;
            }

        }
        return globalCities;
    }

    @Override
    public String toString() {
        return "task03.City{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", population=" + population +
                ", isCapital=" + isCapital +
                ", area=" + area +
                ", counrty=" + counrty +
                '}';
    }
}
