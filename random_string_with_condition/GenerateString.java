import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

class GenerateString {
    public static void main(String[] args) {
        generator(4);
    }

    // generator method
    static void generator(int length) {
        String numbers = "1234567890";
        // String spacialChar = "~!@#$%^&*()_-+=\\|]}{[?/><";
        String alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

        // make a single string using concat
        String allCharacters = numbers + alphabet;

        // creating an object of random class
        Random random = new Random();

        // Create a StringBuilder to build the random string
        StringBuilder randomString = new StringBuilder();

        // Generate the random string
        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(allCharacters.length());
            char randomChar = allCharacters.charAt(randomIndex);
            randomString.append(randomChar);
        }
        System.out.println(randomString.toString());
    }
}
