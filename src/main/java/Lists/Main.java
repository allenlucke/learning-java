package Lists;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main (String[] args) {
        List<String> groceryLine = new ArrayList<>();
        groceryLine.add("Jerome");
        groceryLine.add("Beth");
        groceryLine.add("Sam");

        System.out.println(groceryLine);

        groceryLine.remove("Beth");

        System.out.println(groceryLine);

        String jerome = groceryLine.get(0);
        System.out.println(jerome);

        int samIndex = groceryLine.indexOf("Sam");
        System.out.println(samIndex);

        int pamIndex = groceryLine.indexOf("Pam");
        //Will return -1 bc Pam is not in the list
        System.out.println(pamIndex);

        System.out.println(groceryLine.size());

        for (String name : groceryLine) {
            System.out.println(name);
        }

    }
}
