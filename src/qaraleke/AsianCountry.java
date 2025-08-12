package qaraleke;

public class AsianCountry extends Counrty {
    private double gdpPerCapital;
    private boolean hasNuclearPower;
    private String mainReligion;

    public AsianCountry(int id, String name, String continet, long population, String code, double gdpPerCapital, boolean hasNuclearPower,String mainReligion) {
        super(id,name,continet,population,code);
        this.gdpPerCapital = gdpPerCapital;
        this.hasNuclearPower = hasNuclearPower;
        this.mainReligion = mainReligion;
    }
    public double getGdpPerCapital() {
        return gdpPerCapital;
    }

    public void setGdpPerCapital(double gdpPerCapital) {
        this.gdpPerCapital = gdpPerCapital;
    }

    public boolean isHasNuclearPower() {
        return hasNuclearPower;
    }

    public void setHasNuclearPower(boolean hasNuclearPower) {
        this.hasNuclearPower = hasNuclearPower;
    }

    public String getMainReligion() {
        return mainReligion;
    }

    public void setMainReligion(String mainReligion) {
        this.mainReligion = mainReligion;
    }

}
