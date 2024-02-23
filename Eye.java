import java.awt.*;

public class Eye extends Decorator{
    public void draw(Graphics g) {
        g.setColor(Color.white);
        g.fillOval(super.x, super.y, 10, 10);
        g.setColor(Color.black);
        g.fillOval(super.x, super.y, 5, 5);
    }
}
