import java.awt.*;
import java.util.Random;

public class BoxBuilder implements Runnable {
    Random rand = new Random();
    Repository repo = Repository.getInstance();


    public void run() {
        while (true) {
            int x = rand.nextInt(950);
            int y = rand.nextInt(950);
            int r = rand.nextInt(255);
            int g = rand.nextInt(255);
            int b = rand.nextInt(255);
            int width = rand.nextInt(80);
            int height = rand.nextInt(80);

            Box box = new Box(x, y, new Color(r, g, b), width, height);

            Eye eye = new Eye();
            eye.Add(box);

            //repo.addShape(eye);
            repo.addShape(box);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }
}