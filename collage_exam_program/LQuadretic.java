// x = −b ± √(b2 − 4ac) / 2a

import java.util.Scanner;

class LSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        double d = ((b*b) - (4*a*c));
        System.out.println("d is: "+d);
        if(d > 0) {
            double r1 = ((-b + Math.sqrt(d))/ 2*a);
            double r2 = ((-b - Math.sqrt(d))/ 2*a);
            System.out.println("Root: "+ r1 + "and " + r2);
        }else if (d == 0) {
            double r = (-b / (2*a));
            System.out.println("Root: "+ r);
        }else {
            System.out.println("Not possible");
        }
        sc.close();
    }
}