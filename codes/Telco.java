package codes;

public class Telco implements TelcoSubscription {

    private String telcoName;
    private Double promoPrice;
    private Integer dataAllowance;
    private Boolean unliCallText;

    public Telco(int dataAllowance, double promoPrice, String telcoName, boolean unliCallTest){
        this.telcoName = telcoName;
        this.promoPrice = promoPrice;
        this.dataAllowance = dataAllowance;
        this.unliCallText = unliCallTest;
    }

    public String getTelcoName() {
        return telcoName;
    }

    public void setTelcoName(String telcoName) {
        this.telcoName = telcoName;
    }

    public Double getPromoPrice() {
        return promoPrice;
    }

    public void setPromoPrice(Double promoPrice) {
        this.promoPrice = promoPrice;
    }

    public Integer getDataAllowance() {
        return dataAllowance;
    }

    public void setDataAllowance(Integer dataAllowance) {
        this.dataAllowance = dataAllowance;
    }

    public Boolean getUnliCallText() {
        return unliCallText;
    }

    public void setUnliCallText(Boolean unliCallText) {
        this.unliCallText = unliCallText;
    }

    @Override
    public String accept(UsagePromo promo, double price) {
        this.promoPrice = price;
        return promo.showAllowance(telcoName, promoPrice);
    }

    @Override
    public String accept(UnliCallsTextOffer unliPackage, boolean unliCallText) {
        this.unliCallText = null;
        return unliPackage.showUnliCallsTextOffer(telcoName, unliCallText);
    }
}
