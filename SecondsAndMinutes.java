public class SecondsAndMinutes {
    public static void main(String[] args) {

        System.out.println(getDurationString(3601));
        System.out.println(getDurationString(20, 32));
        System.out.println(getDurationString(-100));
        System.out.println(getDurationString(80, 80));

    }

    public static String    getDurationString(int seconds)  {
        if (seconds < 0)    {
            return "Wrong input, seconds must be positive";
        }
        int nbMinutes = seconds / 60;
        int remainingSeconds = seconds % 60;

        return getDurationString(nbMinutes, remainingSeconds);
    }

    public static String    getDurationString(int minutes, int seconds) {
        if (seconds < 0 || seconds > 59 || minutes < 0)    {
            return "Wrong input, seconds must be positive";
        }

        int nbHours = minutes / 60;
        int remainingMinutes = minutes % 60;

        return nbHours + "h " + remainingMinutes + "m " + seconds + "s";
    }
}
