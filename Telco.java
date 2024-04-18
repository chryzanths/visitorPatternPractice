import java.util.*;
public class Telco implements TelcoSubscription{
    private String telcoName;
    private double promoPrice;
    private int dateAllowance;
    public boolean unliCallText;

    public Telco(String telcoName, double promoPrice, int dateAllowance, boolean unliCallText){
        this.telcoName = telcoName;
        this.promoPrice = promoPrice;
        this.dateAllowance = dateAllowance;
        this.unliCallText = unliCallText;
    }


    @Override
    public accept(UsagePromo usagePromo, double promoPrice){
        this.promoPrice = 0.0;
        return usagePromo.showAllowance(telcoName, promoPrice);
    }

    @Override
    public accept(UnliCallOffer unliCallOffer, boolean unliCallText){
        this.unliCallText = false; //maybe add boolean 
        return unliCallOffer.showUnliCallsTextOffer(telcoName, unliCallText);

    }

    public void setTelcoName(String telcoName){
        this.telcoName = telcoName;
    }
      public void setPromoPrice(double promoPrice){
        this.promoPrice = promoPrice;
    }
      public void setDateAllowance(int dateAllowance){
        this.dateAllowance = dateAllowance;
    }
      public void setUnliCallText(boolean telcoName){
        this.unliCallText = false;
    }

    public String telcoName(){
        return telcoName;
    }
      public double promoPrice(){
        return promoPrice;
    }
      public int dateAllowance(){
        return dateAllowance;
    }
    public boolean unliCallText(){
        return unliCallText;
    }
}