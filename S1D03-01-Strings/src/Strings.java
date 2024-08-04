public class Strings {
    public static void main(String[] args) {
        String greeting = "Hello";
        String otherGreeting = "Software";
        System.out.println(greeting + " " + otherGreeting + " " + "Development");

        //Strings are immutable.
        String startString = "The value is: ";
        System.out.println(startString);
        double number = 3.14;
        startString = startString + number;
        System.out.println(startString);

    }
}
