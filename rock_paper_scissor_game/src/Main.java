import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String random = generate(1, 3);
        String user = userInput();

        if(random.equals(user)){
            System.out.println("Match draw");
        }else {
           playerWins(random, user);
        }
    }
    static public String generate(int lower, int upper){
        String com;
        Random rand = new Random();
        int generatedNumber = rand.nextInt((upper- lower) + lower) + lower;

        switch (generatedNumber){
            case 1 -> com = "Rock";
            case 2 -> com = "Paper";
            default -> com = "Scissor";
        }
        return com;
    }

    // get user input
    static public String userInput(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Choose one (Rock/Paper/Scissor) ");
        String inputs = scan.nextLine();
        scan.close();
        return inputs;
    }
    static public void playerWins(String comRandom, String userTake){
        switch (userTake) {
            case "Rock" -> {
                if (comRandom.equals("Scissor")) {
                    System.out.println("Player wins! Coz User take: " + userTake + "; And computer take: " + comRandom);
                }else if(comRandom.equals("Paper")){
                    System.out.println("Computer wins! Coz User take: " + userTake + "; And computer take: " + comRandom);
                }
            }
            case "Paper" -> {
                if (comRandom.equals("Rock")) {
                    System.out.println("Player wins! Coz User take: " + userTake + "; And computer take: " + comRandom);
                }else if(comRandom.equals("Scissor")){
                    System.out.println("Computer wins! Coz User take: " + userTake + "; And computer take: " + comRandom);
                }
            }
            case "Scissor" -> {
                if (comRandom.equals("Rock")) {
                    System.out.println("Computer wins! Coz User take: " + userTake + "; And computer take: " + comRandom);
                }else if(comRandom.equals("Paper")){
                    System.out.println("Player wins! Coz User take: " + userTake + "; And computer take: " + comRandom);
                }
            }
            default ->
                    System.out.println("Incorrect input! Coz User take: " + userTake + "; And computer take: " + comRandom);
        }
    }
}