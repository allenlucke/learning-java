import java.io.Console;

public class Syntax {
    public static void main(String[] args) {
        Console console = System.console();

        console.printf("String syntax test");
        String firstName = "Allen";
        String lastName = console.readLine("what is your last name?  ");
        console.printf("%s %S is testing stuff\n", firstName, lastName);
    }
}
