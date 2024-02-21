import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;
import java.util.Random;

public class CircleBuilder implements Runnable {
    private float x, y;
    Random rand = new Random();


    public void run(Repository Repo) {
        while (true) {
            x = rand.nextInt(950);
            y = rand.nextInt(950);
            Shape circle = new Ellipse2D.Float(x, y, 50, 50);
            Repo.add(circle);
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
