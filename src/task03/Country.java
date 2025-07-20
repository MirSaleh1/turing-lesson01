package task03;

public class Country {
    private int id;
    private String name;
    private String countinent;
    private Long population;
    private String code;
    private City[]cities;
    private int cityCount;
public Country(){

}
    public Country(int id, String name, String countinent, Long population,String code,City[]cities,int cityCount) {
        this.id = id;
        this.name = name;
        this.countinent = countinent;
        this.population = population;
        this.code = code;
        this.cities = cities;
        this.cityCount = cityCount;

    }
    public Country(City[]cities) {
    this.cities = cities;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCountinent() {
        return countinent;
    }

    public Long getPopulation() {
        return population;
    }

    public String getCode() {
        return code;
    }

    public City[] getCities() {
        return cities;
    }

    public int getCityCount() {
        return cityCount;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCountinent(String countinent) {
        this.countinent = countinent;
    }

    public void setPopulation(Long population) {
        this.population = population;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setCities(City city,City[] cities) {
        this.cities = cities;
    for (int i=0;i<cities.length;i++) {
        if(cities[i]==null){
            cities[i]=city;
            break;
        }

    }
    }

    public void setCityCount(int cityCount) {
        this.cityCount = cityCount;
    }
}
