package stringAndStringBuilder;

import java.util.Scanner;
import java.lang.StringBuilder;


public class StringUtil {


    //1․  Գրել method,  որը  կատարում է String concatenation  տվյալ պարամետրով․
    //      Նույնը  խնդիրը  StringBuilder-ով.


    //   1.1     “hello” , “world” STRING
    public String concString(String a, String b) {
        String concat = a + b;


        return concat;
    }

    public StringBuilder concatStrb(StringBuilder str1, StringBuilder str2) {
        StringBuilder result = new StringBuilder();
        result.append(str1).append(str2).toString();
        return result;
    }


    //   1.2     1 , 2 , “hello”     STRING
    public String concatStrInt(int a, int b, String c) {
        String result = "" + a + b + c;
        return result;
    }

    public StringBuilder concat2IntsStrb(int num1, int num2, StringBuilder a) {
        StringBuilder result = new StringBuilder();
        result.append(num1).append(num2).append(a);
        return result;
    }


    //   1.3     “1” , 2 , “hello”  STRING
    public String concatStrIntStr(String a, int b, String c) {
        String result = a + b + c;
        return result;
    }

    public StringBuilder concatStrbIntStrb(StringBuilder a, int b, StringBuilder c) {
        StringBuilder result = new StringBuilder().append(a).append(b).append(c);
        return result;
    }


    //   1.4     “hello”, 1 ,2, “world
    public String concatStr2IntStr(String a, int b, int c, String d) {
        String result = a + b + c + d;
        return result;
    }

    public StringBuilder concatStrb2IntStrb(StringBuilder a, int b, int c, StringBuilder d) {
        StringBuilder result = new StringBuilder().append(a).append(b).append(c).append(d);
        return result;
    }


// 2․  Գրել method,  որը  ստանում է String պարամետր և տպում է ամեն դատարկ  սիվոլից նոր տողում օգտագործելով  String Literal ( \t, \b ….)․
//actual:  “We are living in”
//result:  We are living in


    public String newLine(String a) {
        String b =  a.replace(" ", "\n");
        return b;
    }


    // 3․ Գրել method (reverse), որը  շուռ է տալիս String.
    //    actual:   “sample”
    //    result:  “elpmas”

    public String reverseStr(String a){
        for(int i = a.length() - 1; i >= 0; i--){
            String b =
    }
        return revStr;

}

