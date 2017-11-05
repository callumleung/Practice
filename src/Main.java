import java.io.IOException;

public class Main {

    public static void main(String argv[]) throws IOException{


        System.out.println(strRev("Test String."));

        int[] testArray = {1,2,3,4,5};

        System.out.println(sumArray(testArray));
        //System.out.println(sumRec(testArray, 0));

        System.out.println(testArm(152, 0, 152));


    }

    //method to reverse a given string
    static String strRev(String str){

        StringBuilder strBuild = new StringBuilder();
        char[] charArray = str.toCharArray();

        for (int i = charArray.length - 1 ; i > -1; --i){
            strBuild.append(charArray[i]);
        }

        return strBuild.toString();
    }

    //two methods to sum an array, one iterative and one recursive
    static int sumArray(int[] Array){

        int sum = 0;

        for (int i = 0; i < Array.length; ++i){
            sum += Array[i];
        }

        return sum;
    }

    static int sumRec(int[] Array, int count){
        int sum = 0;

        if( count > Array.length){
            return sum ;
        }

        return sum + Array[count] + sumRec(Array, count + 1);
    }

    //a method to test if a number is armstrong
    //i.e. is 123 equal to 1^3 + 2^3 + 3^3

    static boolean testArm(int n, int sum, int original){

        if (n ==0 && sum != original){
            return false;
        }

        //for cases <2
        if (sum == original){
            return true;
        }

        int x = n%10;
        sum += x*x*x;

        return testArm(n/10, sum, original);



    }


}
