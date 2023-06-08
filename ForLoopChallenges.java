public class ForLoopChallenges {
    public static void main(String[] args) {

        for (int i = 1; i < 1000; i++)  {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean isPrime(int wholeNumber)  {

        if (wholeNumber < 3 || wholeNumber % 2 == 0)    {
            return (wholeNumber == 2);
        }

        for (int i = 3; i <= wholeNumber / 2; i += 2)   {
            if (wholeNumber % i == 0)   {
                return false;
            }
        }
        return true;
    }
}
