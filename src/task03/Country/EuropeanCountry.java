package task03.Country;

public class EuropeanCountry extends Country {
    private boolean isInEuropeanUnion;
    private String mainExport;
    private int foundingYear;

    public EuropeanCountry(int id, String name, String continent, long population, String code,boolean isInEuropeanUnion, String mainExport, int foundingYear) {
        super(id, name, continent, population, code);
        this.isInEuropeanUnion=isInEuropeanUnion;
        this.mainExport=mainExport;
        this.foundingYear=foundingYear;
    }

    public boolean getIsInEuropeanUnion() {
        return isInEuropeanUnion;
    }

    public void setIsInEuropeanUnion(boolean isInEuropeanUnion) {
        this.isInEuropeanUnion = isInEuropeanUnion;
    }

    public String getMainExport() {
        return mainExport;
    }

    public void setMainExport(String mainExport) {
        this.mainExport = mainExport;
    }

    public int getFoundingYear() {
        return foundingYear;
    }

    public void setFoundingYear(int foundingYear) {
        this.foundingYear = foundingYear;
    }

    @Override
    public String toString() {
        return "EuropeanCountry{"+super.toString() +
                "isInEuropeanUnion=" + isInEuropeanUnion +
                ", mainExport='" + mainExport + '\'' +
                ", foundingYear=" + foundingYear +
                '}';
    }
}
