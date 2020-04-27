package Maps;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static final String BREAKFAST = "breakfast";
    public static final String LUNCH = "lunch";
    public static final String DINNER = "dinner";

    //Maps cannot have duplicate keys

    public static void main (String[] args) {
        Map<String, String> meals = new HashMap<>();
        meals.put(BREAKFAST, "waffles");
        meals.put(LUNCH, "gyros");
        meals.put(DINNER, "enchiladas");

        System.out.println(meals);

        System.out.println(meals.get(DINNER));

        String lunch = meals.remove(LUNCH);

        boolean hasLunch = meals.containsKey("lunch");
        boolean hasGyros = meals.containsValue("gyros");
        int size = meals.size();

        System.out.println(LUNCH + " " + hasLunch + " " + hasGyros + " " + size);


    }
}
