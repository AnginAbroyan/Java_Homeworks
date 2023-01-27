package integer_min_max_5;

public class Main {
    public static void main(String[] args) {
        byte min_byte = -128;
        byte max_byte = 127;
        short min_short = -32768;
        short max_short = 32767;
        int min_int = -2147483648;
        int max_int = 2147483647;
        long min_long = -9223372036854775808l;
        long max_long = 9223372036854775807l;
        System.out.print("Minimum byte value is " + min_byte + " and maximum byte value is " + max_byte + ".\n");
        System.out.print("Minimum shot value is " + min_short + " and maximum shot value is " + max_short + ".\n");
        System.out.print("Minimum int value is " + min_int + " and maximum int value is " + max_int + ".\n");
        System.out.print("Minimum long value is " + min_long + " and maximum long value is " + max_long + ".");
    }
}
