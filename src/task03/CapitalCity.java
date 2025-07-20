package task03;

public class CapitalCity extends City{
    private String governmentType;
    private int parliamentMembers;
    private String mayorName;

    public  CapitalCity(int id, String name, long population, boolean isCapital, double area, Country country,String governmentType,int parliamentMembers,String mayorName) {
        super(id, name, population, isCapital, area, country);
        this.governmentType = governmentType;
        this.parliamentMembers = parliamentMembers;
        this.mayorName = mayorName;

    }

    public int getParliamentMembers() {
        return parliamentMembers;
    }

    public String getMayorName() {
        return mayorName;
    }

    public String getGovernmentType() {
        return governmentType;
    }

    public void setGovernmentType(String governmentType) {
        this.governmentType = governmentType;
    }

    public void setParliamentMembers(int parliamentMembers) {
        this.parliamentMembers = parliamentMembers;
    }

    public void setMayorName(String mayorName) {
        this.mayorName = mayorName;
    }
}
