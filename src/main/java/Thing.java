public class Thing {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";

    public static  void explore(String assumption,
                                boolean result) {
        StringBuilder sb = new StringBuilder();
        if (result) {
            sb.append(String.format("%sYAY!%s",
                    ANSI_GREEN,
                    ANSI_RESET));
        }

        sb.append("  ");
        sb.append(assumption);
        if(!result) {
            sb.append(" (Your assumption is incorrect)");
        }
        System.out.println(sb.toString());
    }

    public static void main(String[] args) {
    int firstNumber = 12;
    int secondNumber = 12;
    explore("Primitives use double equals",
            firstNumber == secondNumber);
    Object firstObject = new Object();
    Object secondObject = new Object();

    explore("Objects references use double equal to check if they" +
                    "refer to the same object in memory, seemingly equal objects are not equal",
            firstObject != secondObject);

    Object sameObject = firstObject;
    explore("Object references must refer to the same object",
            firstObject == sameObject);

    String firstString = "testing";
    String secondString = "testing";
    explore("String literals are referring to the same object",
            firstString == secondString);

    String differentString = new String("testing");
    explore("String objects that contain the same characters, but" +
            "point to different objects cannot use double equals",
            firstString != differentString);

    String anotherString = new String("testing");
    explore("String Interning adds to the same String Pool where literals live," +
            "so you get back the same reference",
            anotherString.intern() == firstString);

    explore("All Objects should use quals to check equality",
            firstString.equals(differentString));
    }
}
