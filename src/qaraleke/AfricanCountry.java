package qaraleke;

public class AfricanCountry extends Counrty{
    private String mainLangugae;
    private boolean isDeveloping;
    private String currency;

    public AfricanCountry(int id, String name, String continet, long population, String code, String mainLangugae, boolean isDeveloping, String currency) {
        super(id, name, continet, population, code);
        this.mainLangugae = mainLangugae;
        this.isDeveloping = isDeveloping;
        this.currency = currency;
    }
    public String getMainLangugae() {
        return mainLangugae;
    }

    public void setMainLangugae(String mainLangugae) {
        this.mainLangugae = mainLangugae;

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

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
