public class LeapYearCalculator {
    public static void main(String[] args) {
        int year = 1700;
        System.out.println(year + " is a leap year " + isLeapYear(year));

        year = 1900;
        System.out.println(year + " is a leap year " + isLeapYear(year));

        year = 1600;
        System.out.println(year + " is a leap year " + isLeapYear(year));

        year = 2000;
        System.out.println(year + " is a leap year " + isLeapYear(year));

        year = 1924;
        System.out.println(year + " is a leap year " + isLeapYear(year));
    }

    //Write a method isLeapYear with a parameter of type int named year.
    //
    //The parameter needs to be greater than or equal to 1 and less than or equal to 9999.
    //
    //If the parameter is not in that range return false.
    //
    //Otherwise, if it is in the valid range, calculate if the year is a leap year and return true if it is a leap year, otherwise return false.
    //
    //To determine whether a year is a leap year, follow these steps:
    //1. If the year is evenly divisible by 4, go to step 2. Otherwise, go to step 5.
    //2. If the year is evenly divisible by 100, go to step 3. Otherwise, go to step 4.
    //3. If the year is evenly divisible by 400, go to step 4. Otherwise, go to step 5.
    //4. The year is a leap year (it has 366 days). The method isLeapYear needs to return true.
    //5. The year is not a leap year (it has 365 days). The method isLeapYear needs to return false.

    public static boolean   isLeapYear(int year)    {
        boolean returnValue = false;

        if (year >= 1 && year <= 9999 && ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)))  {
            returnValue = true;
        }

        return returnValue;
    }
}
