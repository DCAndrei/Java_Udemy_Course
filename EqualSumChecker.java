public class EqualSumChecker {
    public static void main(String[] args) {
        System.out.println(hasEqualSum(1,1,1));
        System.out.println(hasEqualSum(1,1,2));
        System.out.println(hasEqualSum(1,-1,0));
    }

    //Equal Sum Checker
    //Write a method hasEqualSum with 3 parameters of type int.
    //
    //The method should return boolean and it needs to return true if the sum of the first and second parameter is equal to the third parameter. Otherwise, return false.

    public static boolean   hasEqualSum(int firstNb, int secodnNb, int thirdNb) {
        return  (firstNb + secodnNb) == thirdNb;
    }
}
