package task03;

public class AfricanCountry extends Country {

    private	String mainLanguage;
    private	boolean isDeveloping;
    private	String currency;

    public AfricanCountry(int id, String name, String countinent, Long population,String code,City[]cities,int cityCount,String mainLanguage,boolean isDeveloping,String currency) {
        super(id, name, countinent, population, code, cities, cityCount);
        this.mainLanguage = mainLanguage;
        this.isDeveloping = isDeveloping;
        this.currency = currency;
    }

    public String getMainLanguage() {
        return mainLanguage;
    }

    public boolean isDeveloping() {
        return isDeveloping;
    }

    public String getCurrency() {
        return currency;
    }

    public void setMainLanguage(String mainLanguage) {
        this.mainLanguage = mainLanguage;
    }

    public void setDeveloping(boolean developing) {
        isDeveloping = developing;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
