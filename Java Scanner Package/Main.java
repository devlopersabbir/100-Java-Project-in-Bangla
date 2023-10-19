import java.util.Scanner;

class Main{
    static Scanner scan;
    public static void main(String[] args){
        scan = new Scanner(System.in);
        // get name
        System.out.print("Enter your name: ");
        String name = scan.nextLine();

        System.out.print("Your age: ");
        int age = scan.nextInt();

        System.out.print("Is Active: ");
        boolean isActive = scan.nextBoolean();


        System.out.println("Name is: "+ name + "; " + "Age is: "+age + "; "+ "Active: "+isActive);
//        getSalary("Enter your selary: ");
        scan.close();
    }

    static void getSalary(String message){
        System.out.print(message);
        double salary = scan.nextDouble();
        System.out.println("Salary is: "+ salary);
    }
}