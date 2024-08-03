public class FloatDouble {

    public static void main(String[] args) {
        byte myMinByteValue = -128;
//        byte myNewByteValue = (byte) (myMinByteValue / 2);
//        byte myNewByteValue = -128 / 2;
        int myNewByteValue = (myMinByteValue / 2);

        float myNewFloatValue = 1.4e-3F;   // 1.4 * 10 ^ - 3
        double myNewDoubleValue = 1.4e-3;  // 1.4 * 10 ^ - 3
        float myNewFloatValue2 = -23.2344523f;
        double myNewDoubleValue2 = 78.787685345;


        System.out.println(myNewFloatValue);
        System.out.println(myNewDoubleValue);

        System.out.println(myNewFloatValue2);
        System.out.println(myNewDoubleValue2);

        System.out.println(0.1 + 0.1 + 0.1);

        System.out.println(Float.MIN_VALUE);
        System.out.println(Float.MAX_VALUE);

        System.out.println(Double.MIN_VALUE);
        System.out.println(Double.MAX_VALUE);

        double evaluation = 3.0 / 2.0;
        System.out.println(evaluation);

    }
}
