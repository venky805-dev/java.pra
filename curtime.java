
    import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

class curtime {
    public static void main(String[] args) {
        // This is Java CURTIME()
        LocalTime currentTime = LocalTime.now();
        System.out.println("Current Time (CURTIME): " + currentTime);

        // Formatted like MySQL - HH:MM:SS
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        String formattedTime = currentTime.format(formatter);
        System.out.println("Formatted Time: " + formattedTime);
    }
}

