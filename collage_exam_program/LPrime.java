import java.util.Scanner;

public class LPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isPrime = true;

        int number = sc.nextInt();

        for (int i = 2; i <= number / 2; i++) {
            int temp = number % i;
            if (temp == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println(number + " Number is prim.");
        } else {
            System.out.println(number + " Number is not prime");
        }
        sc.close();
    }
}
