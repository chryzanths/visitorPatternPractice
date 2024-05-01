package codes;

import java.util.*;

public class TelcoAllowance implements UsagePromo{

    private static Map<String, Double> allowanceMap = new HashMap<>();

    static{
        allowanceMap.put("Smart", 500.0);
        allowanceMap.put("Globe", 450.0);
        allowanceMap.put("Ditto", 400.0);

    }

    @Override
    public String showAllowance(String telcoName, double money) {

        if (telcoName == "Smart" && money == 500){
            telcoName = "Smart";
            money = 500.0;
        }

        else if (telcoName == "Globe" && money == 450){
            telcoName = "Globe";
            money = 450.0;
        }

        else if (telcoName == "Ditto" && money == 400){
            telcoName = "Ditto";
            money = 400.0;
        }

        return telcoName + ", " + money;
    }

}
