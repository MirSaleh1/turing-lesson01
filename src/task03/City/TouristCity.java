package task03.City;

import task03.Country.Country;

public class TouristCity extends City {
    private int annualVisitors;
    private String mainAttraction;
    private double annualTourismRevenue;


    public TouristCity(int id, String name, long population, boolean isCapital, double area, Country country,int annualVisitors ,String mainAttraction, double annualTourismRevenue) {
       super(id, name, population, isCapital, area, country);
       this.annualVisitors = annualVisitors;
       this.mainAttraction = mainAttraction;
       this.annualTourismRevenue = annualTourismRevenue;
    }

    public int getAnnualVisitors() {
        return annualVisitors;
    }

    public void setAnnualVisitors(int annualVisitors) {
        this.annualVisitors = annualVisitors;
    }

    public String getMainAttraction() {
        return mainAttraction;
    }

    public void setMainAttraction(String mainAttraction) {
        this.mainAttraction = mainAttraction;
    }

    public double getAnnualTourismRevenue() {
        return annualTourismRevenue;
    }

    public void setAnnualTourismRevenue(double annualTourismRevenue) {
        this.annualTourismRevenue = annualTourismRevenue;
    }

    @Override
    public String toString() {
        return "TouristCity{" +super.toString() +
                "annualVisitors=" + annualVisitors +
                ", mainAttraction='" + mainAttraction + '\'' +
                ", annualTourismRevenue=" + annualTourismRevenue +
                '}';
    }
}
