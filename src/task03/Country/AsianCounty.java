package task03.Country;

public class AsianCounty extends Country {
    private double gdpPerCapita;
    private boolean hasNuclearPower;
    private String mainReligion;

    public AsianCounty(int id, String name, String continent, long population, String code,double gdpPerCapita, boolean hasNuclearPower, String mainReligion) {
        super(id, name, continent, population, code);
        this.gdpPerCapita = gdpPerCapita;
        this.hasNuclearPower = hasNuclearPower;
        this.mainReligion = mainReligion;
    }

    public double getGdpPerCapita() {
        return gdpPerCapita;
    }

    public void setGdpPerCapita(double gdpPerCapita) {
        this.gdpPerCapita = gdpPerCapita;
    }

    public boolean getHasNuclearPower() {
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

    @Override
    public String toString() {
        return "AsianCounty{" +super.toString() +
                "gdpPerCapita=" + gdpPerCapita +
                ", hasNuclearPower=" + hasNuclearPower +
                ", mainReligion='" + mainReligion + '\'' +
                '}';
    }
}
