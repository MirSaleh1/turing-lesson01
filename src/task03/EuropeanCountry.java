package task03;

public class EuropeanCountry extends Country{
    private boolean isInEuropeanUnion;
    private String mainExprot;

    public EuropeanCountry(int id, String name, String countinent, Long population,String code,City[]cities,int cityCount,boolean isInEuropeanUnion,String mainExprot){
        super(id,name,countinent,population,code,cities,cityCount);
        this.isInEuropeanUnion=isInEuropeanUnion;
        this.mainExprot=mainExprot;
    }

    public boolean isInEuropeanUnion() {
        return isInEuropeanUnion;
    }

    public String getMainExprot() {
        return mainExprot;
    }

    public void setInEuropeanUnion(boolean inEuropeanUnion) {
        isInEuropeanUnion = inEuropeanUnion;
    }

    public void setMainExprot(String mainExprot) {
        this.mainExprot = mainExprot;
    }
}
