package codes;

public class UnliCallTextPackage implements UnliCallsTextOffer {


    @Override
    public String showUnliCallsTextOffer(String telcoName, boolean unliCallText) {

        String output = "";

        if(telcoName == "Smart" && unliCallText == false){
            output =  "Doesn't inlcude free calls or text";
        }

        if(telcoName == "Globe" && unliCallText == true){
            output = "Comes with unlimited calls and texts to subscribers within their network";

        }

        if(telcoName == "Ditto" && unliCallText == true){
            output = "Includes unlimited calls and texts to all networks within the country";

        }


        return output;
    }
}
