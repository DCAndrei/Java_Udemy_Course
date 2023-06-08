public class TraditionalEnhancedSwitchChallenge {
    public static void main(String[] args) {

        char    c = 'F';

        System.out.println("The character " + c + " translates as: " + getNatoWord(c));

        for (int i = 0; i < 8 ; i++)    {
            System.out.println(dayOfTheWeek(i));
        }

    }

    //using the traditional switch statement

    public static String getNatoWord(char c)    {

        String  returnValue = "Not found";

        switch (c)  {
            case 'A':
                returnValue = "Able";
                break;
            case 'B':
                returnValue = "Baker";
                break;
            case 'C':
                returnValue = "Charlie";
                break;
            case 'D':
                returnValue = "Dog";
                break;
            case 'E':
                returnValue = "Easy";
                break;
            default:
                break;
        }
        return returnValue;
    }

    //The new enhanced version of switch

    public static String dayOfTheWeek(int value) {

        return switch (value) {
            case 0 -> "Sunday";
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "Invalid Day";
        };
    }
}
