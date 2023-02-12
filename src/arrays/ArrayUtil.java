package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayUtil {
    Scanner myscanner = new Scanner(System.in);


    // 1. Գրել method, որը տպում է int[] n  array-ի դրական տարրերը․
    public void arrIntPos() {
        int[] n = {1, 0, 2, -5, -856, -95637, 256, 896};
        for (int i = 0; i < n.length; i++) {
            if (n[i] > 0) {
                System.out.println(n[i] + " ");
            }
        }
    }

    // 2. Գրել method, որը տպում է short[] s  array-ի էլեմենտները հակառակ հերթականությամբ  Օրինակ՝ ( 257 -> 752)․
    public void reverseArr() {
        short[] s = {1, 0, 2, -5, 0, -856, -32768, 256, 896};
        for (int i = s.length - 1; i >= 0; i--) {
            System.out.print(s[i] + ", ");
        }
    }

    //  3. Գրել method, որը գտնում և  տպում է  long[] l array-ի ամենամեծ տարրը․
    public void maxArr() {
        long[] l = {1, 2, 5, 896, 54652, 999999, -256, -1};
        long max = l[0];
        for (long value : l) {
            if (value > max) {
                max = value;
            }
        }
        System.out.println("Max: " + max);
    }


    // 4. Գրել method, որը գտնում և տպում է  float[] f  array-ի ամենափոքր տարրը․

    public void minArr() {
        float[] f = {1.222f, 0.555555f, -256.888f, 2.6956f};
        float min = f[0];
        for (float value : f) {
            if (value < min) {
                min = value;
            }
        }
        System.out.println("Min: " + min);
    }

    //5 ․ Գրել method, որը int[] n array-ի էլեմենտները և տեղափոխում  int[] m  array-ի մեջ։

    public void transferArr() {
        int[] n = {1, 2, 3, 4, 5, 6};
        int[] m = new int[n.length];
        for (int i = 0; i < n.length; i++) {
            m[i] = n[i];
        }
        for (int value : m) {
            System.out.print(value + " ");
        }
    }


    /* 6․ Գրել method, որը ստեղծում է երկու նույն չափը ունեցող array-ներ գումարում է array -ի
     համապատասխան էլեմենտները և գրում երրորդ array-ի մեջ։
            Օրինակ՝ array1 = {1,5,6,4,7}; array2 = {7,4,2,3,5};    array3 = {8,9,8,7,12}  */

    public void sumArrays() {
        int[] a = {1, 5, 6, 4, 7};
        int[] b = {7, 4, 2, 3, 5};
        int[] c = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i] + b[i];
        }
        for (int value : c) {
            System.out.print(value + " ");
        }
    }

    /* 7. Գրել method, որը հաշվում է թե քանի անգամ է  k թիվը հանդիպել array-ի  Էլեմենտների մեջ։

            Օրինակ՝  array = {1,5,6,4,5}
                   k = 5;
                    2  */


    public void countK(int k) {
        int[] array = {1, 5, 6, 4, 5};
        int counter = 0;
        for (int value : array) {
            if (value == k) {
                counter++;
            }
        }
        System.out.println("The number " + k + " was encountered " + k + " times in the array.");
    }


    /*8․Գրել method, որը  տպում է բոլոր չկրկնվող եռյակները array -ի։ Եռյակներում թվերի դասավորությունը Էական չէ․

Օրինակ՝  array = {1,5,6,4}
 // {1,5,6},  {1,5,4} ,{1,4,6}, {4,5,6} */

    public int nonRepeatingTriplets() {
        int[] array = {1, 5, 6, 4};
        int count = 0;
        int[][] subarray = new int[count][3];
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                for (int k = j; k < array.length; k++) {
                    if (array[i] != array[j] && array[j] != array[k]) {
                        System.out.println(array[i] + " " + array[j] + " " + array[k]);
                        count++;
                    }
                }
            }
        }
        System.out.println((count + " triplets"));

        return count;
    }

    /* 9․ Դասավորել տրված թվերի հաջորդականության անդամները նվազման կարգո */

    public void desArr() {
        int[] array = {9, 8, 7, 6, 25, 5, 4, 3, 2, 1, 15};
        int temp;
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if (array[i] < array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        for (int value : array) {
            System.out.print(value + " ");
        }
    }

    /* 10․ Դասավորել տրված ամբողջ թվերի հաջորդականության անդամներն անյպես, որ վերջում լինեն կենտերը:

Oրինակ՝  array = {1,5,6,4,9,7,1}  // {6,4,1,5,9,7,1} */

    public void oddsToTheEnd() {
        int[] array = {1, 5, 6, 4, 9, 18, 7, 1, 2, 4,};
        int temp;
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if (array[i] % 2 != 0) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        for (int value : array) {
            System.out.print(value + " ");
        }
    }

    /*11․ Տրված իրական թվերի հաջորդականությունից հեռացնել բոլոր զրոները։

Oրինակ՝  array = {1,0,6,4,9,0,0}  // {1,6,4,9}*/

    public void noZeros() {
        int[] array = {1, 0, 6, 4, 9, 0, 0};
        int len = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                len++;
            }
        }
        int[] no0Array = new int[len];
        for (int i = 0, j = 0; i < array.length; i++) {
            if (array[i] != 0) {
                no0Array[j] = array[i];
                j++;
            }
        }
        for (int value : no0Array) {
            System.out.print(value + " ");
        }
    }


    /* 12․ 9: Տպել թվերի տրված հաջորդականության ամենաերկար աճող ենթահաջորդականությունը

Oրինակ՝  array = {1,5,6,4,9,0,4,7,7,9, 1}  // {0,4,7,7,9} */

    public void maxAscSub() {
        int[] array = {1, 5, 6, 4, 9, 0, 4, 7, 7, 9, 1};
        int counter = 0;
        int maxCounter = 1;
        int start = 0;


        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] <= array[i + 1]) {
                counter++;
                if (counter > maxCounter) {
                    maxCounter = counter + 1;
                    start = i - counter + 1;
                }
            } else {
                counter = 0;
            }
        }
        System.out.println(start);
        int[] finalArray = new int[maxCounter];


        for (int i = 0; i < maxCounter; i++) {
            finalArray[i] = array[i + start];
            System.out.println(finalArray[i]);
        }
    }


/*13․ Ներածել n բնական թիվը 2-ական տեսքով՝ ստանալով 0-ներից ու 1-երից կազմված զանգված և արտածել n  թվի 10-ական ներկայացումը:

Oրինակ՝    array = {1,1,0,0,1,1}  // 51*/


    public int binToDec(int n) {

        int counter = 1;
        int number = n;
        int power = 0;
        int temp = 0;
        int dec = 0;


        while (number / 10 != 0) {
            counter++;
            number /= 10;
        }

        int[] array = new int[counter];

        for (int i = 0; i < counter; i++) {
            array[i] = n % 10;
            n /= 10;
            System.out.println(array[i]);
        }

        for (int j = 0; j < array.length; j++) {
            temp = array[j] * ((int) Math.pow(2, power));
            dec += temp;
            power++;
        }
        return dec;
    }

    /*14․ Տպել տրված մատրիցի գլխավորա անկյունագծից վերև բոլոր տարերը:*/


    public void diagPattern() {
        int[][] array = new int[][]{
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (j > i) {
                    System.out.print(array[i][j] + " ");
                }
            }
            System.out.println(" ");
        }
    }

    /*15․ Շրջել տրված ամբողջ թվերի քառակուսային մատրիցը գլխավոր անկյունագծի նկատմամբ:*/
    public void reverseMatrix() {
        int[][] array = new int[][]{
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};


        int a = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                a = array[i][j];
                array[i][j] = array[j][i];
                array[j][i] = a;
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[j][i] + " ");
            }
            System.out.println(" ");
        }




    }



/*16․ Տրված բնական թվերի քառակուսային մատրիցի համար արտածել YES, եթե նրա բոլոր տողերի տարրերի գումարը զույգ է։  NO հակառակ դեպքում։

Oրինակ՝    a = {1,-1,0,0}
    {2,-2,1,-1}        // YES
    {9,7,1,-17}

                      a = {1,1,0,0}
    {2,-2,1,-1}        //NO
    {9,7,1,-17}
*/


    public void isEven(){
        int[][] a ={{1,-1,0,0},
                {2,-2,1,-1},
                {9,0,-1,-7}};
        int sum = 0;

        for(int i = 0; i < a.length; i++){
            for(int j = 0; j<a[i].length; j++){

                sum += a[i][j];
            }

        }
        if(sum%2 == 0){
            System.out.println(sum);
            System.out.println("Yes");
        }
        else{
            System.out.println(sum);
            System.out.println("No");
        }
    }
}
