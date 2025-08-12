package task03.City;

import task03.Country.Country;

public class IndustrialCity extends City {
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

    public void setNumberOfFactories(int numberOfFactories) {
        this.numberOfFactories = numberOfFactories;
    }

    public String getMainIndustry() {
        return mainIndustry;
    }

    public void setMainIndustry(String mainIndustry) {
        this.mainIndustry = mainIndustry;
    }

    public double getAnnualProductionVolume() {
        return annualProductionVolume;
    }

    public void setAnnualProductionVolume(double annualProductionVolume) {
        this.annualProductionVolume = annualProductionVolume;
    }

    @Override
    public String toString() {
        return "IndustrialCity{" +super.toString() +
                "numberOfFactories=" + numberOfFactories +
                ", mainIndustry='" + mainIndustry + '\'' +
                ", annualProductionVolume=" + annualProductionVolume +
                '}';
    }
}
