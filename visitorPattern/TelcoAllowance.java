import java.util.*;

public class TelcoAllowance implements UsagePromo {

    private static Map<String, Integer> tele = new HashMap<>();

    static {
        tele.put("Smart", 15);
        tele.put("Globe", 10);
        tele.put("Ditto", 8);
    }

    @Override
    public String showAllowance(String telcomName, double money) {

        Integer allowance = tele.getOrDefault(telcomName, 0);

        return allowance + " GB for a price of " + money + " pesos per month.";

    }
}
