public class Main {
    public static void main(String[] args) {
        newTestMethod1(3, 4);
        int result = testMethod2(6, 8);
        System.out.println(result);
    }

    public static void newTestMethod1(int newArg1, int arg2) {
        System.out.println(newArg1 + arg2);
    }

    public static int testMethod2(int arg1, int arg2) {
        return arg1 + arg2;
    }
}
