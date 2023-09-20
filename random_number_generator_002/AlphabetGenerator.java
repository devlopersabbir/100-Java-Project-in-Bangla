import java.util.Random;

public class AlphabetGenerator {
    public static void main(String[] args) {
        Random random = new Random();
        StringBuilder randomString = new StringBuilder();

        String alpha = "abcdefghijklmnopqrstwxyz";

        String generated;
        for (int i = 0; i < 4; i++) {
            char randomChar = alpha.charAt(random.nextInt(alpha.length()));
            randomString.append(randomChar);
        }
        generated = randomString.toString();

        System.out.println(generated);
    }
}
