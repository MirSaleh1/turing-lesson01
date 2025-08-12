package task03.City;

import task03.Country.Country;

public class City {
    private int id;
    private String name;
    private long population;
    private boolean isCapital;
    private double area;
    private Country country;

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

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    public boolean isCapital() {
        return isCapital;
    }

    public void setCapital(boolean capital) {
        isCapital = capital;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }


    @Override
    public String toString() {
        return
                "id=" + id +
                ", name='" + name + '\'' +
                ", population=" + population +
                ", isCapital=" + isCapital +
                ", area=" + area +
                ", country=" + country.getName() +
                '}';
    }
}
