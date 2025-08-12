package qaraleke;

public class CapitalCity extends City{
    private String governmentType;
    private int parliamentMembers;
    private String mayorname;

    public  CapitalCity(int id, String name, long population, boolean isCapital, double area,Counrty counrty,String governmentType, int parliamentMembers, String mayorname) {
        super(id, name, population, isCapital, area, counrty);
        this.governmentType = governmentType;
        this.parliamentMembers = parliamentMembers;
        this.mayorname = mayorname;
    }

    public String getGovernmentType() {
        return governmentType;
    }

    public int getParliamentMembers() {
        return parliamentMembers;
    }

    public String getMayorname() {
        return mayorname;
    }

    public void setGovernmentType(String governmentType) {
        this.governmentType = governmentType;
    }

    public void setParliamentMembers(int parliamentMembers) {
        this.parliamentMembers = parliamentMembers;
    }

    public void setMayorname(String mayorname) {
        this.mayorname = mayorname;
    }
}
