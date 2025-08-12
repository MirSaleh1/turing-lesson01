package qaraleke;

public class EuropeanCountry extends Counrty{
    private boolean isInEropeanUnion;
    private String mainExprot;

    public EuropeanCountry(int id, String name, String continet, long population, String code, boolean isInEropeanUnion, String mainExprot) {
        super(id, name, continet, population, code);
        this.isInEropeanUnion = isInEropeanUnion;
        this.mainExprot = mainExprot;
    }

    public boolean isInEropeanUnion() {
        return isInEropeanUnion;
    }

    public String getMainExprot() {
        return mainExprot;
    }

    public void setInEropeanUnion(boolean inEropeanUnion) {
        isInEropeanUnion = inEropeanUnion;
    }

    public void setMainExprot(String mainExprot) {
        this.mainExprot = mainExprot;
    }
}
