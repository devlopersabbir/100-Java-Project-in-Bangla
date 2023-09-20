import java.util.Random;

public class IntegerGenerator {
    public static void main(String[] args) {
        Random random = new Random();

        String alpha = "12345";
        System.out.println(alpha.charAt(random.nextInt(alpha.length())));
    }
}
