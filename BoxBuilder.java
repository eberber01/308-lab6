import java.awt.*;
import java.awt.geom.Rectangle2D;
import java.util.Random;

public class BoxBuilder implements Runnable {
    Random rand = new Random();
    Repository repo = Repository.getInstance();

    public void run() {
        while (true) {
            int x = rand.nextInt(950);
            int y = rand.nextInt(950);
            Color color = new Color(rand.nextInt(255), rand.nextInt(255), rand.nextInt(255));
            int width = rand.nextInt(40) + 40; // Ensure minimum size
            int height = rand.nextInt(40) + 40;

            Box box = new Box(x, y, color, width, height);

            // Decorate the box with an eye
            Decorator eyeDecorator = new Eye();
            eyeDecorator.setComponent(box);

            repo.addShape(eyeDecorator);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
