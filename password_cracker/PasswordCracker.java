import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import java.util.HashSet;

class PasswordCracker {
    static String password = "robi";
    static int length = 4;
    static int wait = 50;
    static HashSet<String> generatedStrings = new HashSet<String>();

    // static String spacialChar = "~!@#$%^&*()_-+=\\|]}{[?/><";
    static String alphabetS = "abcdefghijklmnopqrstuvwxyz";
    static String alphabetU = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    // static String numbers = "1234567890";

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
        // make a single string using concat
        String allCharacters = alphabetS;

        // creating an object of random class
        Random random = new Random();

        // Create a StringBuilder to build the random string
        StringBuilder randomString = new StringBuilder();

        // generated string state
        String generated;
        do {
            randomString.setLength(0); // clear string builder

            for (int i = 0; i < length; i++) {
                int randomIndex = random.nextInt(allCharacters.length());
                char randomChar = allCharacters.charAt(randomIndex);
                randomString.append(randomChar);
            }
            generated = randomString.toString();
        } while (generatedStrings.contains(generated));

        generatedStrings.add(generated);
        return generated;
    }
}
