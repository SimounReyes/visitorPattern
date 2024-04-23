public class Telco implements TelcoSubscription {
    private String telcoName;
    private double promoPrice;
    private Integer dateAllowance;
    private boolean unliCallText;

    public Telco(Integer dateAllowance, double promoPrice, String telcoName, boolean unliCallText) {
        this.promoPrice = promoPrice;
        this.dateAllowance = dateAllowance;
        this.telcoName = telcoName;
        this.unliCallText = unliCallText;
    }

    public String getTelcoName() {
        return telcoName;
    }

    public double getPromoPrice() {
        return promoPrice;
    }

    public Integer getDataAllowance() {
        return dateAllowance;
    }

    public boolean getUnliCallText() {
        return unliCallText;
    }

    @Override
    public String accept(UsagePromo promo, double price) {
        this.promoPrice = price;
        return promo.showAllowance(telcoName, price);
    }

    @Override
    public String accept(UnliCallOffer unli, boolean unliCallText) {
        this.unliCallText = unliCallText;
        return unli.showUnliCallsTextOffer(telcoName, unliCallText);
    }

}
