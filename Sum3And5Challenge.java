//loop through the first 1000 integers
//find the ones divisible with 3 and 5
//print the first 5 ones, and break the loop
//print the sum of those 5 numbers

public class Sum3And5Challenge {
    public static void main(String[] args) {

        printNumbers();
    }

    public static void printNumbers()   {
        int sum = 0;
        int total = 0;

        for (int i = 1; i < 1000; i++)  {
            if (total < 5 && i % 15 == 0)   {
                System.out.println(i);
                total++;
                sum += i;
            } else if (total == 5)  {
                break;
            }
        }
        System.out.println("The sum is: " + sum);
    }
}
