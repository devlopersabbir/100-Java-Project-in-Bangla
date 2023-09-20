import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

class GenerateString {
    static String password = "22";
    static int length = 2;
    static int wait = 50;

    public static void main(String[] args) {
        Timer timer = new Timer();
        timer.schedule(new GeneratrTask(), 0, wait); // run every second
    }

    // generator method
    static class GeneratrTask extends TimerTask {
        public void run() {
            String generatedPass = generatorLoop(length);

            if (generatedPass.equals(password)) {
                System.out.format("Password matched! -> %s == %s \n", password, generatedPass);
                System.exit(0);
            } else {
                System.out.format("Trying running -> %s != %s \n", password, generatedPass);
            }
        }
    }

    // running loop
    static String generatorLoop(int length) {
        final String numbers = "1234567890";
        // String spacialChar = "~!@#$%^&*()_-+=\\|]}{[?/><";
        // final String alphabet =
        // "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        // make a single string using concat
        String allCharacters = numbers;

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

        return randomString.toString();
    }
}
