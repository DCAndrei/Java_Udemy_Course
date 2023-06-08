public class NumberInWord {
    public static void main(String[] args) {

        for (int i = 0; i < 11; i++)    {
            printNumberInWord(i);
        }
    }

    //Number In Word
    //Write a method called printNumberInWord.
    // The method has one parameter number which is the whole number.
    // The method needs to print "ZERO", "ONE", "TWO", ... "NINE", "OTHER"
    // if the int parameter number is 0, 1, 2, .... 9 or other for any other number
    // including negative numbers. You can use if-else statement or switch statement whatever is easier for you.

    public static void printNumberInWord(int number)    {

        String  value = "OTHER";

        switch (number)   {
            case 0:
                value = "ZERO";
                break;
            case 1:
                value = "ONE";
                break;
            case 2:
                value = "TWO";
                break;
            case 3:
                value = "THREE";
                break;
            case 4:
                value = "FOUR";
                break;
            case 5:
                value = "FIVE";
                break;
            case 6:
                value = "SIX";
                break;
            case 7:
                value = "SEVEN";
                break;
            case 8:
                value = "EIGHT";
                break;
            case 9:
                value = "NINE";
                break;
            default:
                break;
        }
        System.out.println(value);
    }
}
