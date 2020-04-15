import java.io.Console;

public class DoWhile {
    public static void main(String[] args) {
        Console console = System.console();
        String ageAsString = console.readLine("How old are you?  ");

        int age = Integer.parseInt(ageAsString);

        if (age < 13) {
            console.printf("sorry you must be 13 to use this program.\n");
            System.exit(0);
        }
        String name = console.readLine("Enter your name:  ");
        String adjective = console.readLine("Enter an adjective:  ");
        String verb = console.readLine("Enter a verb:  ");
        String noun = console.readLine("Enter a noun:  ");
        boolean isInvalid;

        do {
            noun = console.readLine("Enter a noun:  ");
            isInvalid = noun.equalsIgnoreCase("dork") ||
                    noun.equalsIgnoreCase("jerk") ||
                    noun.equalsIgnoreCase("pinhead");
            if(isInvalid) {
                console.printf("you must choose another noun  ");
            }
        }while(isInvalid);
        console.printf("%s is very %s while %s\n", name, adjective, verb);
    }
}
