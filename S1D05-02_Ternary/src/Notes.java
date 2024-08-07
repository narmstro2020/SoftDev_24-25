public class Notes {

    public static void main(String[] args) {
        boolean isAlien = false;

        if (isAlien == false) {
            System.out.println("It is not an alien");
            System.out.println("And I'm scared of aliens");
        }

        int topScore = 80;
        if (topScore < 100) {
            System.out.println("You got the high score");
        }

        int secondTopScore = 81;
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater than second top score and less than 100");
        }

        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either or both of the conditions are true");
        }

        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is true");
        }

        boolean isCar = false;
        if (!isCar) {
            System.out.println("This is not supposed to happen");
        }

        String makeOfCar = "Volkswagen";
        boolean isDomestic = makeOfCar.equals("Volkswagen") ? false : true;

        String s = (isDomestic) ? "This car is domestic" : "This car is not domestic";
        System.out.println(s);

        String t = makeOfCar.equals("Volkswagen") ? "This car is not domestic" : "This car is domestic";
        System.out.println(t);

        double myFirstValue = 20.00;
        double mySecondValue = 80.00;
        double myValuesTotal = (myFirstValue + mySecondValue) * 100.00;
        System.out.println("myValuesTotal = " + myValuesTotal);
        double theRemainder = myValuesTotal % 40.00;
        System.out.println("theRemainder = " + theRemainder);
        boolean isNoRemainder = (theRemainder == 0) ? true : false;
        System.out.println("isNoRemainder = " + isNoRemainder);
        if(!isNoRemainder) {
            System.out.println("Got some remainder");
        }



    }
}
