import java.util.*;

public class UnliCallTextPackage implements UnliCallOffer {

    private static Map<String, String> callTextPackage = new HashMap<>();

    static {
        callTextPackage.put("Smart", "Do not offer any free calls or texts, and you will be charged per use.");
        callTextPackage.put("Globe",
                "Comes with unlimited calls and texts to subscribers within their network. Calls and texts to other networks are charged extra.");
        callTextPackage.put("Ditto", "Includes unlimited calls and texts to all networks within the country.");
    }

    @Override
    public String showUnliCallsTextOffer(String telcoName, boolean unliCallText) {

        if (!unliCallText) {
            return "Do not offer any free calls or texts, and you will be charged per use.";
        } else {
            return callTextPackage.getOrDefault(telcoName, "package");
        }
    }
}
