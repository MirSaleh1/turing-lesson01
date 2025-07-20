package task03;

public class AsianCountry extends Country {
    private double gdpPerCapita;
    private boolean hasNuclearPower;
    private String mainReligion;

    public AsianCountry(int id, String name, String countinent, Long population,String code,City[]cities,int cityCount,double gdpPerCapita,boolean hasNuclearPower,String mainReligion) {
        super(id, name, countinent, population, code, cities, cityCount);
        this.gdpPerCapita=gdpPerCapita;
        this.hasNuclearPower=hasNuclearPower;
        this.mainReligion=mainReligion;

    }

    public double getGdpPerCapita() {
        return gdpPerCapita;
    }

    public boolean isHasNuclearPower() {
        return hasNuclearPower;
    }

    public String getMainReligion() {
        return mainReligion;
    }

    public void setGdpPerCapita(double gdpPerCapita) {
        this.gdpPerCapita = gdpPerCapita;
    }

    public void setHasNuclearPower(boolean hasNuclearPower) {
        this.hasNuclearPower = hasNuclearPower;
    }

    public void setMainReligion(String mainReligion) {
        this.mainReligion = mainReligion;
    }
}
