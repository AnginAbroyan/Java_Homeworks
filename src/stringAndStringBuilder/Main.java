package stringAndStringBuilder;
import java.util.Scanner;


public class Main {


    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        StringUtil exercises = new StringUtil();


        //   1.1     “hello” , “world”
        //   STRING
//        System.out.println("Please enter the first line: ");
//        String line1 = myScanner.nextLine();
//        System.out.println("Please enter the 2nd line: ");
//        String line2 = myScanner.nextLine();
//        String concat = "";
//        System.out.println(exercises.concString(line1, line2));




        //StringBuilder
//        System.out.println("Please enter a StringBuilder value: ");
//        String  str6 = myScanner.nextLine();
//        StringBuilder strb6 = new StringBuilder(str6);
//        System.out.println("Please enter a StringBuilder value: ");
//        String  str7 = myScanner.nextLine();
//        StringBuilder strb7 = new StringBuilder(str7);
//        System.out.println(exercises.concatStrb(strb6, strb7));






        //   1.2     1 , 2 , “hello”     STRING
//        System.out.println("Please enter the first number: ");
//        int num1 = myScanner.nextInt();
//        System.out.println("Please enter the 2nd number: ");
//        int num2 = myScanner.nextInt();
//        myScanner.nextLine();
//        System.out.println("Please enter a word: ");
//        String str1 = myScanner.nextLine();
//        System.out.println(exercises.concatStrInt(num1, num2, str1));




        //StringBuilder
//        System.out.println("Please enter the first number: ");
//        int num6 = myScanner.nextInt();
//        System.out.println("Please enter the 2nd number: ");
//        int num7 = myScanner.nextInt();
//        myScanner.nextLine();
//        System.out.println("Please enter a StringBuilder value: ");
//        String  str8 = myScanner.nextLine();
//        StringBuilder strb8 = new StringBuilder(str8);
//        System.out.println(exercises.concat2IntsStrb(num6, num7, strb8));




        //   1.3     “1” , 2 , “hello”  STRING
//        System.out.println("Please enter a String value: ");
//        String str2 = myScanner.nextLine();
//        System.out.println("Please enter an int value: ");
//        int num3 = myScanner.nextInt();
//        myScanner.nextLine();
//        System.out.println("Please enter a String value: ");
//        String str3 = myScanner.nextLine();
//        System.out.println(exercises.concatStrIntStr(str2, num3, str3));


        //StringBuilder
//        System.out.println("Please enter a StringBuilder value: ");
//        String  str9 = myScanner.nextLine();
//        StringBuilder strb9 = new StringBuilder(str9);
//        System.out.println("Please enter the 2nd number: ");
//        int num8 = myScanner.nextInt();
//        myScanner.nextLine();
//        System.out.println("Please enter a StringBuilder value: ");
//        String  str10 = myScanner.nextLine();
//        StringBuilder strb10 = new StringBuilder(str10);
//        System.out.println(exercises.concatStrbIntStrb(strb9, num8, strb10));






        //   1.4     “hello”, 1 ,2, “world
//        System.out.println("Please enter a String value: ");
//        String str4 = myScanner.nextLine();
//        System.out.println("Please enter an int value: ");
//        int num4 = myScanner.nextInt();
//        System.out.println("Please enter an int value: ");
//        int num5 = myScanner.nextInt();
//        myScanner.nextLine();
//        System.out.println("Please enter a String value: ");
//        String str5 = myScanner.nextLine();
//        System.out.println(exercises.concatStr2IntStr(str4, num4, num5, str5));






        //StringBuilder
//        System.out.println("Please enter a StringBuilder value: ");
//        String  str11 = myScanner.nextLine();
//        StringBuilder strb11 = new StringBuilder(str11);
//        System.out.println("Please enter the an int value: ");
//        int num9 = myScanner.nextInt();
//        System.out.println("Please enter an int value: ");
//        int num10 = myScanner.nextInt();
//        myScanner.nextLine();
//        System.out.println("Please enter a StringBuilder value: ");
//        String  str12 = myScanner.nextLine();
//        StringBuilder strb12 = new StringBuilder(str12);
//        System.out.println(exercises.concatStrb2IntStrb(strb11, num9, num10, strb12));



        //2ND EXERCISE
        System.out.println("Please enter your text: ");
        String a = myScanner.nextLine();
        System.out.println(exercises.newLine(a));








    }
}

