public class Example {

    public static void main(String[] args) {
        // Your amazing code goes here...
        System.out.println("We are making a new PEZ Dispenser");
        PezDispenser dispenser = new PezDispenser("Donatello");

        System.out.printf("The dispenser is %s %n",
                dispenser.getCharacterName()
        );

        if (dispenser.isEmpty()) {
            System.out.println("Dispenser is empty");
        }
        System.out.println("Filling the dispenser with pez");
        dispenser.fill();
        if (!dispenser.isEmpty()) {
            System.out.println("Dispenser is full");
        }
        while (dispenser.dispense()) {
            System.out.println("Chomp");
        }
        if (dispenser.isEmpty()) {
            System.out.println("Ate all the pez");
        }
        dispenser.fill(4);
        System.out.println("Just filled with 4 pez");
        dispenser.fill(2);
        while (dispenser.dispense()) {
            System.out.println("Chomp!");
        }
        try {
            dispenser.fill(400);
            System.out.println("Shouldnt see this");
        } catch(IllegalArgumentException iae) {
            System.out.println("cant do that");
            System.out.printf("The error was %s", iae.getMessage());
        }
    }
}
