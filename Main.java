import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.Timer;
import java.util.TimerTask;

public class Main {

    public static void main(String[] args) throws AWTException {

        Robot robot = new Robot();

        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                robot.keyPress(KeyEvent.VK_A);  // change to any key
                robot.keyRelease(KeyEvent.VK_A);
            }
        };

        Timer timer = new Timer();
        timer.schedule(task, 0, 3000); // Schedule the task to run every 30 seconds
    }
}
