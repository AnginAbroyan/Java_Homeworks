package string_and_stringbuilder;

import java.util.Scanner;
import java.lang.StringBuilder;


public class StringUtil {
    Scanner sc = new Scanner(System.in);


    //1․  Գրել method,  որը  կատարում է String concatenation  տվյալ պարամետրով․
    //      Նույնը  խնդիրը  StringBuilder-ով.


    //   1.1     “hello” , “world” STRING
    public String concString(String a, String b) {
        return a + b;
    }

    public StringBuilder concatStrB(StringBuilder str1, StringBuilder str2) {
        StringBuilder result = new StringBuilder();
        result.append(str1).append(str2).toString();
        return result;
    }


    //   1.2     1 , 2 , “hello”     STRING
    public String concatStrInt(int a, int b, String c) {
        return "" + a + b + c;
    }

    public StringBuilder concat2IntsStrB(int num1, int num2, StringBuilder a) {
        StringBuilder result = new StringBuilder();
        result.append(num1).append(num2).append(a);
        return result;
    }


    //   1.3     “1” , 2 , “hello”  STRING
    public String concatStrIntStr(String a, int b, String c) {
        return a + b + c;
    }

    public StringBuilder concatStrBIntStrB(StringBuilder a, int b, StringBuilder c) {
        return new StringBuilder().append(a).append(b).append(c);
    }


    //   1.4     “hello”, 1 ,2, “world
    public String concatStr2IntStr(String a, int b, int c, String d) {
        return a + b + c + d;
    }

    public StringBuilder concatStrb2IntStrb(StringBuilder a, int b, int c, StringBuilder d) {
        return new StringBuilder().append(a).append(b).append(c).append(d);
    }


// 2․  Գրել method,  որը  ստանում է String պարամետր և տպում է ամեն դատարկ  սիվոլից նոր տողում օգտագործելով  String Literal ( \t, \b ….)․
//actual:  “We are living in”
//result:  We are living in


    public String newLine(String a) {
        return a.replace(" ", "\n");
    }


    // 3․ Գրել method (reverse), որը  շուռ է տալիս String.
    //    actual:   “sample”
    //    result:  “elpmas”

    public String reverseStr(String a) {
        String revStr = "";
        for (int i = a.length() - 1; i >= 0; i--) {
            revStr += String.valueOf(a.charAt(i));
        }
        return revStr;
    }


    //4. Գրել method, որը ստուգում է թե քանի անգամ է տրված տեքստում հանդիպել token ենթատողը.
    //   int countSubString(String line, String token)
    //   token = “in”  ,    line =  “We are living in an yellow submarine. We don't  have anything”    4 անգամ


    public int countSubString(String line, String token) {
        int count = 0;
        String newLine = line;

        while (newLine.contains(token)) {
            newLine = newLine.replaceFirst(token, "");
            count++;
        }

        return count;
    }

    //5․  Գրել method, որը  տեքստը սարքում է մեծատառերով գրված, օգտագործելով String.
    //    Նույնը  խնդիրը   StringBuilder-ով.
    //actual:   “hello world”
    //result:  “HELLO WOLRD”


    public String upperCase(String text) {
        String upperCaseText = "";
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) >= 'a' && text.charAt(i) <= 'z') {
                upperCaseText += (char) (text.charAt(i) - 32);
            } else {
                upperCaseText += text.charAt(i);
            }
        }
        return upperCaseText;
    }


    public StringBuilder upperCase(StringBuilder text) {
        StringBuilder upperCaseText = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) >= 'a' && text.charAt(i) <= 'z') {
                upperCaseText.append((char) (text.charAt(i) - 32));
            } else {
                upperCaseText.append(text.charAt(i));
            }
        }
        return upperCaseText;
    }


    //6․ Գրել method, որը console-ից կարդում է 20 երկարությամբ սիմվոլների տող , տպում այն եթե տողի   երկարությունը
    // պակաս է 20 ից ապա պետք է տողը լռացնենք պակաս սիմվոլների փոխարեն գրելով «*» սիմվոլը.
    //actual:   “Armenia”
    //result:  “Armenia*************”


    public void printStr() {
        System.out.println("Please enter your text: ");
        String text = sc.nextLine();
        if (text.length() > 20) {
            System.out.println("ete");
            printStr();
        } else {
            for (int i = 0; i <= 20; i++) {
                text = text + "*";
            }

        }

        System.out.println(text);
    }


//7. Գրել method, որը տրված տեքստից հեռացնում է բոլոր « a »  սիմվոլները. Նույնը խնդիրը  StringBuilder-ով.
//actual:  “We are living in a yellow submarine. We don't  have anything”
//result:  “We re living in n yellow submrine. We don't  hve nything”

    /// STRING
    public void noA() {
        System.out.println("Please enter your text: ");
        String text = sc.nextLine();
        String newTxt = "";
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != 'a') {
                newTxt += text.charAt(i);
            }
        }
        System.out.println(newTxt);
    }


    /// STRINGBuilder
    public void noAStrB() {
        System.out.println("Please enter your text: ");
        String text = sc.nextLine();
        StringBuilder text1 = new StringBuilder(text);
        StringBuilder newTxt = new StringBuilder();

        for (int i = 0; i < text1.length(); i++) {
            if (text1.charAt(i) != 'a') {
                newTxt.append((char) text1.charAt(i));
            }
        }
        System.out.println(newTxt);
    }


    //8. Գրել method, որը տրված տեքստում բոլոր « a »  սիմվոլները փոխարինում է « * » , օգտագործելով String.
    //actual:  “We are living in an yellow submarine. We don't  have anything”
    //result:  “We *re living in *n yellow subm*rine. We don't  h*ve *nything”

    public void aToStars(){
        System.out.println("Please enter your text: ");
        String text = sc.nextLine();
        String newTxt = "";
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != 'a') {
                newTxt += text.charAt(i);
            }
            else{
                newTxt+= "*";
            }
        }
        System.out.println(newTxt);

    }



    //9. Գրել method, որը գտնում է տեքստում ամենաերկար բառը, տեքստում բառերը անջատված են իրարից պռոբելով.
    //actual:  “We are living in an yellow submarine. We don't  have anything”
    //result:  submarine

    public void maxWord() {
        System.out.println("Please enter your text: ");
        String text = sc.nextLine();
        String maxWord = "";
        String[] words = text.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > maxWord.length()) {
                maxWord = words[i];
            }
        }
        System.out.println("The longest word in the text is: " + maxWord);

    }


    ///10․ Գրել method, որը գտնում է թե, որերորդ ինդեքսում է առաջին անգամ հանդիպել String c  սիմվոլը.
   //         actual:  String c = “a”  ,  “We are living in an yellow submarine. We don't  have anything”
   // result:  index 3


    public int getIndexOfC(){
        System.out.println("Please enter your text: ");
        String text = sc.nextLine();
        System.out.println("Please enter your text: ");
        String c = sc.nextLine();
       // for(int i = 0; i< text.length(); i++){

       // }
        return text.indexOf(c);
    }


    // 11․ Գրել method, որը գտնում և տպում է տրված տողի սկզբից մինչև n-րդ ինդեքսը պարունակող ենթատողը,
    // օգտագործելով String. Նույնը խնդիրը  StringBuilder-ով.
    //void printSubLine(String line, int n)
    //void printSubLine(StringBuilder line, int n)

    public String printSubLine(String line, int n){
        String newStr = "";
        for(int i = 0; i<=n; i++){
            newStr += line.charAt(i);
        }
        return newStr;
    }

    public StringBuilder printSubLine(StringBuilder line, int n){
        StringBuilder newStrB = new StringBuilder();
        for(int i = 0; i<=n; i++){
            newStrB.append(line.charAt(i));
        }
        return newStrB;
    }



    //12. Գրել method, որը ստուգում է թե արդյոք  տրված  String պարամետրը  դատարկ և null չէ․


    public boolean isEmpty(String line){
        String empty = "";
        String isNull = null;
        if(line == empty || line == isNull){
            System.out.println(true);
            return true;
        }
        else {
            System.out.println(false);
            return false;
        }
    }

    //13. Գրել method, որը տրոհում է նախադսությունը ըստ  ‘,’   և գտում ամեներկար բառը ․
    //actual:  “We, are, living, in an, yellow, submarine, We don't,  have anything”
    //result:    have anything

    public void splitStr(String line){

        String maxWord = "";
        String[] words = line.split(",");
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > maxWord.length()) {
                maxWord = words[i];
            }
        }
        System.out.println("The longest word in the text is: " + maxWord);

    }

}

