package floating_point_number_8;

public class Main {
    public static void main(String[] args) {
        float min_float = 1.175494351E-38f;
        float max_float = 3.402823466E+38f;
        double min_double = 2.2250738585072014E-308d;
        double max_double = 1.7976931348623158E+308d;
        System.out.print("Minimum float value is " + min_float + " and maximum float value is " + max_float + ".\n");
        System.out.print("Minimum double value is " + min_double + " and maximum double value is " + max_double + ".");
    }
}
