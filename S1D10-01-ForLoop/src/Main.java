public class Main {

    public static void main(String[] args) {
        for (double rate = 7.5; rate <= 10; rate += 0.25) {
            System.out.println(calculateInterest(100, rate));
        }

        int test = 4;
        for (int number = test; number <= 1000; number++) {
            if (isPrime(number)) {
                System.out.println("Is " + number + " prime: " + isPrime(number));
            }
        }

        int accumulator = 0;
        int count = 0;
        for (int i = 1; i <= 1000; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                accumulator += i;
                System.out.println(i + " has met the condition.");
                count++;
            }
            if(count == 5){
                break;
            }

        }

        System.out.println("The total is: " + accumulator);

    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }

    public static boolean isPrime(int wholeNumber) {

        if (wholeNumber <= 2) {
            return (wholeNumber == 2);
        }

        for (int divisor = 2; divisor <= wholeNumber / 2; divisor++) {
            if (wholeNumber % divisor == 0) {
                return false;
            }
        }

        return true;
    }

}
