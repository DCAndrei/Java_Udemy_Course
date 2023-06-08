public class EqualityPrinter {
    public static void main(String[] args) {

        printEqual(1, 1, 1);
        printEqual(1, 1, 2);
        printEqual(-1, -1, -1);
        printEqual(1, 2, 3);
        printEqual(1, 1, 2);
    }

    //Equality Printer
    //Write a method printEqual with 3 parameters of type int. The method should not return anything (void).
    //
    //If one of the parameters is less than 0, print text "Invalid Value".
    //
    //If all numbers are equal print text "All numbers are equal"
    //
    //If all numbers are different print text "All numbers are different".
    //
    //Otherwise, print "Neither all are equal or different".

    public static void printEqual(int value1, int value2, int value3)   {

        if (value1 < 0 || value2 < 0 || value3 < 0) {
            System.out.println("Invalid Value");
        } else if (value1 == value2 && value2 == value3)  {
            System.out.println("All numbers are equal");
        } else if (value1 != value2 && value2 != value3 && value3 != value1)    {
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }
    }
}
