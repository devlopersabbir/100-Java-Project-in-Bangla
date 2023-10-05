import java.util.HashMap;
import java.util.Scanner;

class UserAuthentication {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // our database with initial value
        HashMap<String, String> users = new HashMap<String, String>();
        users.put("devlopersabbir", "sabbir");
        users.put("rafiul", "rafiul20");

        System.out.println("User Authentication");
        System.out.println("-------------------");

        // get username from user input
        System.out.print("Enter your username: ");
        String username = scan.nextLine();

        // check if user not exist in our DB
        if(!users.containsKey(username)){
            System.out.println("User not found!");
        }else {
            // take password
            System.out.print("Enter your password: ");
            String password = scan.nextLine();

            // check if password is matched with our bd
            if(!password.equals(users.get(username))){
                System.out.println("Password is wrong!");
            }else {
                System.out.println("login successfull!");
            }
        }
    }
}
