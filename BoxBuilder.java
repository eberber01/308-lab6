import java.awt.*;
import java.awt.geom.Rectangle2D;
import java.util.Random;

public class BoxBuilder implements Runnable {
    private float x, y;
    Random rand = new Random();

    public void run(Repository Repo) {
        while (true) {
            x = rand.nextInt(950);
            y = rand.nextInt(950);
            Shape square = new Rectangle2D.Float(x, y, 50, 50);
            Repo.add(square);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }

    @Override
    public void run() {

    }
}
