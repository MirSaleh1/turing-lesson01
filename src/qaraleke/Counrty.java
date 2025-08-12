package qaraleke;

public class Counrty {
    private int id;
    private String name;
    private String continet;
    private long population;
    private String code;
    private City[] cities;
    private int indextCount = 0;

    public Counrty(int id, String name, String continet, long population, String code) {
        this.id = id;
        this.name = name;
        this.continet = continet;
        this.population = population;
        this.code = code;
    }

    public Counrty() {

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getContinet() {
        return continet;
    }

    public long getPopulation() {
        return population;
    }

    public String getCode() {
        return code;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setContinet(String continet) {
        this.continet = continet;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public City[] getCities() {
        return cities;
    }

    public void setCities(City[] cities) {
        this.cities = cities;
    }

    public void addCities(City city) {

        City[] newCities = new City[100];
        for (int i = 0; i < newCities.length; i++) {
            newCities[indextCount] = city;

        }
        cities = newCities;
        indextCount++;
    }

    public boolean removeCities(String name) {
        City[] newCities = new City[indextCount - 1];
        boolean result = false;

        for (int i = 0,j=0; i < cities.length; i++) {
            if (cities[i] != null && cities[i].getName().equals(name)) {
                result = true;
                continue;
            }


                if (j< newCities.length) {

                    newCities[j++] = cities[i];
                }


        }
        if (result) {

        indextCount--;
        cities = newCities;
    }
        return result;
    }
    public City[] removeCountrySCity() {
        City[] newCities = new City[0];
        City[] removcities = new City[100];
        for (int i = 0; i < cities.length; i++) {
            removcities[i] = cities[i];
        }

        this.cities=newCities;

        return removcities;
    }

    public String showCities() {
        StringBuilder cityStr = new StringBuilder();
        for (int i = 0; i < indextCount; i++) {
            cityStr.append(cities[i].getName()).append(", ");
        }
        String nameStr= String.valueOf(cityStr);
       return  nameStr;
    }

    public void show(){

        for (int i = 0; i < indextCount; i++) {
            if (cities[i] != null) {
             cities[i].getName();}
        }
    }

    @Override
    public String toString() {
        return "Counrty{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", continet='" + continet + '\'' +
                ", population=" + population +
                ", code='" + code + '\'' +
                ", cities=" + showCities() +
        ", indextCount=" + indextCount +
                '}';
    }
}