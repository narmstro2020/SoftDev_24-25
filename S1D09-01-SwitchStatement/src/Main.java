public class Main {

    public static void main(String[] args) {
        String letterForC = natoAlphabet('C');
        System.out.println(letterForC);
        String letterForA = natoAlphabet('A');
        System.out.println(letterForA);

        printDayOfWeek(1);
        printDayOfWeek(2);
        printDayOfWeek(3);
        System.out.println(dayOfWeek(1));
        System.out.println(dayOfWeek(2));


    }

    private static void printDayOfWeek(int day) {
        switch (day) {
            case 0 -> System.out.println("Sunday");
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            default -> System.out.println("Invalid Day");
        }
    }

    private static String dayOfWeek(int day) {
        return switch (day) {
            case 0 -> "Sunday";
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> {
                String value = day + " is invalid";
                yield value;
            }
        };
    }

    private static String natoAlphabet(char letter) {
        return switch (letter) {
            case 'A' -> "Able";
            case 'B' -> "Baker";
            case 'C' -> "Charlie";
            // And do the rest
            default -> "Not a Valid Letter";
        };
    }


}


