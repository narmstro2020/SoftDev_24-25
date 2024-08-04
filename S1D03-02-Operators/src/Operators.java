public class Operators {
    public static void main(String[] args) {
        byte byteValue = 35;
        byte shortValue = 25;
        int intValue;
        intValue = 3;
        long longTotal = 50000L + 10L * (byteValue + shortValue + intValue);
        System.out.println(longTotal);
        char charValue = 'A';
        char charValue2 = 'B';
        char charValue3 = (char) (charValue + charValue2);
        System.out.println(charValue3);
        int myIntValue = 50;
        myIntValue += 1;
        System.out.println(myIntValue);
        myIntValue %= 2;
        System.out.println(myIntValue);
        ++myIntValue;
        System.out.println(myIntValue);
        myIntValue--;
        System.out.println(myIntValue);


    }
}
