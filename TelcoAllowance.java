import java.util.*;
public class TelcoAllowance implements UsagePromo{
    private static Map<String, Double> allowanceMap = new HashMap<>();

    static{
        allowanceMap.put("Smart", 500.0);
        allowanceMap.put("Globe", 450.0);
        allowanceMap.put("Ditto", 400.0);
    }

    @Override
    public String showAllowance(String telcoName, double money){
        //double allowanceValue = allowanceMap.getOrDefault(telcoName, 0.0);
        

        if (telcoName == "Smart" && money == 500){
            double price = money * 15.0;
            String price2 = Double.toString(price);
            System.out.println(price2);
        }
        else if (telcoName == "Globe" && money == 450){
            double price = money * 10.0;
            String price2 = Double.toString(price);
            System.out.println(price2);
        }
        else if (telcoName == "Ditto" && money == 400){
            double price = money * 8.0;
            String price2 = Double.toString(price);
            System.out.println(price2);
        }
        else {
            double price = 0.0;
            String price2 = Double.toString(price);
            System.out.println(price2);
        }


    }

}