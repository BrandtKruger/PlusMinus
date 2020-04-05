import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Main {


    private static DecimalFormat df6 = new DecimalFormat("#.######");

    static void plusMinus(int[] arr) {

        if(arr.length > 100 || arr.length == 0 )
            return;

        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;

        for (int i = 0; i < arr.length; i++){
            if(arr[i] > 100 || arr[i] < -100)
                return;

            if(arr[i] > 0){
                positiveCount++;
            } else if( arr[i] < 0){
                negativeCount++;
            } else {
                zeroCount++;
            }
        }

        double positiveCalcuated =  ((double)positiveCount / (double)arr.length);
        BigDecimal ps = new BigDecimal(positiveCalcuated).setScale(6, RoundingMode.HALF_UP);
        System.out.println(ps);

        double negativeCalcuated =  ((double)negativeCount / (double)arr.length);
        BigDecimal ng = new BigDecimal(negativeCalcuated).setScale(6, RoundingMode.HALF_UP);
        System.out.println(ng);

        double zeroCalcuated =  ((double)zeroCount / (double)arr.length);
        BigDecimal bd = new BigDecimal(zeroCalcuated).setScale(6, RoundingMode.HALF_UP);
        System.out.println(bd);

    }

    public static void main(String[] args) {

        int[] arr = new int[]{-4, 3, -9, 0, 4, 1};
        plusMinus(arr);
    }

}