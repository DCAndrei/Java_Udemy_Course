public class MinutesToYearsDaysCalculator {
    public static void main(String[] args) {

        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);
    }

    //Minutes To Years and Days Calculator
    //Write a method printYearsAndDays with parameter of type long named minutes.
    //
    //The method should not return anything (void) and it needs to calculate the years and days from the minutes parameter.
    //
    //If the parameter is less than 0, print text "Invalid Value".
    //
    //Otherwise, if the parameter is valid then it needs to print a message in the format "XX min = YY y and ZZ d".
    //
    //XX represents the original value minutes.
    //YY represents the calculated years.
    //ZZ represents the calculated days.

    public static void printYearsAndDays(long minutes)  {
        if (minutes < 0)    {
            System.out.println("Invalid Value");
            return;
        }

        long    hours = minutes / 60L;
        long    days = hours / 24L;
        long    years = days / 365L;

        String  returnValue = minutes + " min = " + years + " y and " + days % 365L + " d";

        System.out.println((returnValue));
    }
}
