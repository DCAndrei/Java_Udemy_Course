public class SwitchStatement {
    public static void main(String[] args) {
        int value = 4;

        String  month = "December";
        System.out.println(getQuarter(month));

        switch (value) {
            case 1 -> System.out.println("value 1");
            case 2 -> System.out.println("value was 2");
            case 3, 4, 5 -> {
                System.out.println("value was " + value);
                System.out.println("some other message");
            }
            default -> System.out.println("none of 1 to 5");
        }
    }

    public static String getQuarter(String month)   {

//        switch (month)  {
//            case "January":
//            case "February":
//            case "March":
//                return "1st";
//            case "April":
//            case "May":
//            case "June":
//                return "2nd";
//            case "July":
//            case "August":
//            case "September":
//                return "3rd";
//            case "October":
//            case "November":
//            case "December":
//                return "4th";
//        }

        return switch (month) {
            case "January", "February", "March" -> "1st";
            case "April", "May", "June" -> "2nd";
            case "July", "August", "September" -> "3rd";
            case "October", "November", "December" -> "4th";
            default -> "bad";
        };
    }
}
