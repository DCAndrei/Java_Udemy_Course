public class TeenNumberChecker {
    public static void main(String[] args) {

        System.out.println(hasTeen(9, 99, 19));
        System.out.println(hasTeen(23, 15, 42));
        System.out.println(hasTeen(22, 23, 34));


    }

    //Teen Number Checker
    //We'll say that a number is "teen" if it is in the range 13 -19 (inclusive).
    //
    //Write a method named hasTeen with 3 parameters of type int.
    //
    //The method should return boolean and it needs to return true if one of the parameters is in range 13(inclusive) - 19 (inclusive). Otherwise return false.

    public static boolean   hasTeen(int firstNb, int secondNb, int thirdNb) {
        return isTeen(firstNb) || isTeen(secondNb) || isTeen(thirdNb);
    }

    //Write another method named isTeen with 1 parameter of type int.

    //The method should return boolean and it needs to return true if the parameter is in range 13(inclusive) - 19 (inclusive). Otherwise return false.

    public static boolean   isTeen(int number)  {
        return (number > 12) && (number < 20);
    }
}
