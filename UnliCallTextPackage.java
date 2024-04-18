import java.util.*;
public class UnliCallTextPackage implements UnliCallOffer{
    private static Map<String, Double> packageMap = new HashMap<>();

    static{
        packageMap.put("Smart", 500.0);
        packageMap.put("Globe", 450.0);
        packageMap.put("Ditto", 400.0);
    }

    @Override
    public String showUnliCallsTextOffer(String telcoName, boolean unliCallText){
        return packageMap.get(telcoName) * money;

        
    }
}