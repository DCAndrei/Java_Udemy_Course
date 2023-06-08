public class InchesToCm {
    public static void main(String[] args) {

        System.out.println(convertToCentimeters(5, 6));

    }

    public static double    convertToCentimeters(int valueInches)   {
        return  valueInches * 2.54;
    }

    public  static  double  convertToCentimeters(int valueFeet, int valueInches)    {
        return  convertToCentimeters((12 * valueFeet) + valueInches);
    }
}
