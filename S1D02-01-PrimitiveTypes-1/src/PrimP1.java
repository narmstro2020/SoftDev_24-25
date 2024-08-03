public class PrimP1 {

    public static void main(String[] args) {
        // Integer Types

        int myInt = 7;     // 32 bits.  2^32 different values.
        System.out.println(myInt);
        short myShort = 8;  // 16 bits.  2^16 different values
        System.out.println(myShort);
        byte myByte = 9;  // 8 bits.  2 ^ 8 different.  -128 to 127
        System.out.println(myByte);
        long myLong = 230948723049872304L;   // 64 bits.  2^64 different values.
        System.out.println(myLong);

        // Single character
        char myChar = 'a';  // 16 bits.

        //Boolean type
        boolean myBoolean = true;   // 8 bits.  But only really use 1.  Sort of
        boolean myOtherBoolean = false;

        // not a primitive type.  Reference type.
        String myString = "Hello World";

        Integer wrappedInt = 7;

        Long wrappedLong = 870987320498723094L;
        Byte wrappedByte = 8;
        Character wrappedChar = 'b';
        Boolean wrappedBoolean = true;
        Short wrappedShort = 8;

        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);
        System.out.println(Long.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Character.MIN_VALUE);
        System.out.println(Character.MAX_VALUE);

        System.out.println(Integer.MIN_VALUE - 1);
        int myOtherInt3 = 2_147_483_647;



    }
}
