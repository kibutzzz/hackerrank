package challenges.problemsolving;

public class TimeConversion {

    static String timeConversion(String s) {

        String[] time = s.split(":");

        int hour = Integer.parseInt(time[0]);
        int minutes = Integer.parseInt(time[1]);
        int seconds = Integer.parseInt(time[2].replaceAll("\\D", ""));

        if (time[2].replaceAll("\\d", "").equals("PM")) {
            if (hour < 12) {
                hour += 12;
            }
        }
        if(hour == 12 && time[2].replaceAll("\\d", "").equals("AM") ) {
            hour = 0;
        }

        return String.format("%02d:%02d:%02d", hour, minutes, seconds);
    }

}
