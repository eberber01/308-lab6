import java.awt.*;

public class Eye extends Decorator {
    @Override
    public void draw(Graphics g) {
        super.draw(g); // Draw the base component first

        // Check the type of component and cast accordingly
        if (component instanceof Circle) {
            Circle circle = (Circle) component;
            drawEyesForCircle(g, circle);
        } else if (component instanceof Box) {
            Box box = (Box) component;
            drawEyesForBox(g, box);
        }
    }

    private void drawEyesForCircle(Graphics g, Circle circle) {
        // Calculate positions for two eyes on a circle
        int eyeX1 = circle.getX() + circle.getRadius() / 2;
        int eyeY = circle.getY() + circle.getRadius() / 2;
        int eyeX2 = circle.getX() + 2 * circle.getRadius() / 2;

        drawEye(g, eyeX1, eyeY);
        drawEye(g, eyeX2, eyeY);
    }

    private void drawEyesForBox(Graphics g, Box box) {
        // Calculate positions for two eyes on a box
        int eyeX1 = box.getX() + box.getWidth() / 4;
        int eyeY = box.getY() + box.getHeight() / 4;
        int eyeX2 = box.getX() + 2 * box.getWidth() / 4;

        drawEye(g, eyeX1, eyeY);
        drawEye(g, eyeX2, eyeY);
    }

    private void drawEye(Graphics g, int x, int y) {
        g.setColor(Color.BLUE); // Outer part of the eye
        g.fillOval(x, y, 10, 10);
        g.setColor(Color.BLACK); // Inner part of the eye
        g.fillOval(x + 2, y + 3, 4, 4);
    }
}


