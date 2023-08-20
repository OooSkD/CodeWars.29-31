import task31.FindOdd;
import task30.Parser;
import task29.CountingDuplicates;

public class Main {
    public static void main(String[] args) {
        System.out.println(CountingDuplicates.duplicateCount("aabbcdeeee"));
        String strNum = "seven hundred eighty-three thousand nine hundred and nineteen";
        System.out.println(Parser.parseInt(strNum)); //783919
        int[] test ={20,1,-1,2,-2,3,3,5,5,1,2,4,20,4,-1,-2,5};
        System.out.println(FindOdd.findIt(test));
    }
}
