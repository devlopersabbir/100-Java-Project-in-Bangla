import java.util.Timer;
import java.util.TimerTask;

public class Main {
    static String fn = "20";
    static int index = 15;

    public static void main(String[] args) {

        Timer timer = new Timer();
        timer.schedule(new GenerateTask(), 0, 500);

    }

    static class GenerateTask extends TimerTask {
        public void run() {
            index++;

            String str = Integer.toString(index);
            if (fn.equals(str)) {
                System.out.format("Matched! %s == %d \n", fn, index);
                System.exit(0);
            } else {
                System.out.format("try %s != %d \n", fn, index);
            }

        }
    }
}
