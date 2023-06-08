public class DecimalComparator {
    public static void main(String[] args) {

        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.176));
    }

    //DecimalComparator
    //Write a method areEqualByThreeDecimalPlaces with two parameters of type double.
    //
    //The method should return boolean and it needs to return true if two double numbers are the same up to three decimal places. Otherwise, return false.


    public static boolean   areEqualByThreeDecimalPlaces(double firstNb, double secondNb) {

        return (int)(firstNb * 1000) == (int)(secondNb * 1000);
    }
}
