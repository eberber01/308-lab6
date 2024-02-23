import java.awt.*;
import java.util.Random;

public class CircleBuilder implements Runnable {
    Random rand = new Random();
    Repository repo = Repository.getInstance();


    public void run() {
        while (true) {
            int x = rand.nextInt(950);
            int y = rand.nextInt(950);
            int r = rand.nextInt(255);
            int g = rand.nextInt(255);
            int b = rand.nextInt(255);
            int radius = rand.nextInt(40);

            Circle circle = new Circle(x, y, new Color(r, g, b), radius);

            Decorator eyeDecorator = new Eye();
            eyeDecorator.setComponent(circle); // Decorate the circle with an eye

            repo.addShape(eyeDecorator); // Add the decorated component to the repository


            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }
}