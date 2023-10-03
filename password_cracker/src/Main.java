import java.util.TimerTask;
import java.util.Timer;

public class Main {
    static String password = "2023";
    public static void main(String[] args) {
        Timer timer = new Timer();
        timer.schedule(new CreateTimerTask(), 0, 1);
    }
    static class CreateTimerTask extends TimerTask {
        public void run() {
            Generator generator = new Generator(true, false, false, false, 3);
            String generateString = generator.generate();

           if(generateString.equals(password)){
               System.out.format("Password matched! -> %s == %s \n", password, generateString);
               System.exit(0);
           }else {
               System.out.format("Try running -> %s != %s \n", password, generateString);
           }
        }
    }
}