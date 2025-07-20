package task03;

public class TouristCity extends City{
    private int annualVisitors;
    private String mainAttraction;
    private double annualTourismRevenue;

    public TouristCity(int id, String name, long population, boolean isCapital, double area, Country country,int annualVisitors, String mainAttraction, double annualTourismRevenue) {
        super(id, name, population, isCapital, area, country);
        this.annualVisitors = annualVisitors;
        this.mainAttraction = mainAttraction;
        this.annualTourismRevenue = annualTourismRevenue;
    }

    public int getAnnualVisitors() {
        return annualVisitors;
    }

    public String getMainAttraction() {
        return mainAttraction;
    }

    public double getAnnualTourismRevenue() {
        return annualTourismRevenue;
    }

    public void setAnnualVisitors(int annualVisitors) {
        this.annualVisitors = annualVisitors;
    }

    public void setMainAttraction(String mainAttraction) {
        this.mainAttraction = mainAttraction;
    }

    public void setAnnualTourismRevenue(double annualTourismRevenue) {
        this.annualTourismRevenue = annualTourismRevenue;
    }
}
