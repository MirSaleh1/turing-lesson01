package task03;

public class IndustrialCity extends City{
    private int numberOfFactories;
    private String mainIndustry;
    private double annualProductionVolume;

    public IndustrialCity(int id, String name, long population, boolean isCapital, double area, Country country, int numberOfFactories, String mainIndustry, double annualProductionVolume) {
        super(id, name, population, isCapital, area, country);
        this.numberOfFactories = numberOfFactories;
        this.mainIndustry = mainIndustry;
        this.annualProductionVolume = annualProductionVolume;

    }

    public int getNumberOfFactories() {
        return numberOfFactories;
    }

    public String getMainIndustry() {
        return mainIndustry;
    }

    public double getAnnualProductionVolume() {
        return annualProductionVolume;
    }

    public void setNumberOfFactories(int numberOfFactories) {
        this.numberOfFactories = numberOfFactories;
    }

    public void setMainIndustry(String mainIndustry) {
        this.mainIndustry = mainIndustry;
    }

    public void setAnnualProductionVolume(double annualProductionVolume) {
        this.annualProductionVolume = annualProductionVolume;
    }
}
