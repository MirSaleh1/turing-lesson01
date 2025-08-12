package task03.Country;

import task03.City.City;

import java.util.Arrays;

public class Country {
    private int id;
    private String name;
    private String continent;
    private long population;
    private String code;
    private City[] cities=new City[100];
    private int cityCount=0;

    public Country(int id, String name, String continent, long population, String code) {
        this.id = id;
        this.name = name;
        this.continent = continent;
        this.population = population;
        this.code = code;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
    public int cityCount() {
        return cityCount;
    }

    public City[] getCities() {
        return cities;
    }
    public void setCities(City[] cities) {
        this.cities = cities;
    }

    public void setCity(City city) {
        if(cityCount<cities.length) {

            this.cities[cityCount] = city;
            cityCount++;
            }

        }

        public void deleteOwnCity(City city) {
        for(int i=0;i<cityCount;i++) {
            if(cities[i]==city) {

                for(int j=i;j<cityCount-1;j++) {

                    cities[j]=cities[j+1];

                }
                cities[cityCount - 1] = null;
                cityCount--;

            }
        }

        }
        public StringBuilder showAllCity(){
        StringBuilder city=new StringBuilder();
            city.append("[");
        for(int i=0;i<cityCount;i++) {
            city.append(cities[i]);


            if (i < cityCount - 1) {
                city.append(", ");
            }
        } city.append("]");
        return city;
        }

    @Override
    public String toString() {
        return
                "id=" + id +
                ", name='" + name + '\'' +
                ", continent='" + continent + '\'' +
                ", population=" + population +
                ", code='" + code + '\'' +
                ", cities=" +  showAllCity().toString() +
                ", cityCount=" + cityCount +
                '}';
    }
}

