package task03.Country;

public class AfricanCounty extends Country {
    private String mainLanguage;
    private boolean isDeveloping;
    private String currency;


     public AfricanCounty(int id, String name, String continent, long population, String code,String mainLanguage,boolean isDeveloping,String currency) {
         super(id, name, continent, population, code);
         this.mainLanguage = mainLanguage;
         this.isDeveloping = isDeveloping;
         this.currency = currency;
     }

    public String getMainLanguage() {
        return mainLanguage;
    }

    public void setMainLanguage(String mainLanguage) {
        this.mainLanguage = mainLanguage;
    }

    public boolean isDeveloping() {
        return isDeveloping;
    }

    public void setDeveloping(boolean developing) {
        isDeveloping = developing;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrensy(String currency) {
        this.currency = currency;
    }

    @Override
    public String toString() {
        return "AfricanCounty{" + super.toString() +
                "mainLanguage='" + mainLanguage + '\'' +
                ", isDeveloping=" + isDeveloping +
                ", currency='" + currency + '\'' +
                '}';
    }
}
