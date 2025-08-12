package qaraleke;

public class TouristCity extends City{
    private int annualVisitors;
    private String mainAttraction;
    private double annualTourismRevenue;

    public  TouristCity(int id, String name, long population, boolean isCapital, double area,Counrty counrty,int annualVisitors,String mainAttraction,double annualTourismRevenue) {
        super(id,name,population,isCapital,area, counrty);
        this.annualVisitors = annualVisitors;
        this.mainAttraction = mainAttraction;
        this.annualTourismRevenue = annualTourismRevenue;
    }
    public int getAnnualVisitors() {
        return annualVisitors;
    }

    public double getAnnualTourismRevenue() {
        return annualTourismRevenue;
    }

    public String getMainAttraction() {
        return mainAttraction;
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
