import java.awt.*;

public class Circle extends Component{
    private int x;
    private int y;
    private Color color;
    private int radius;

    public Circle(int x, int y, Color color, int radius) {
        this.x = x;
        this.y = y;
        this.color = color;
        this.radius = radius;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void draw(Graphics g) {
        g.setColor(color);
        g.fillOval(x, y, 2 * radius, 2 * radius);
    }

    @Override
    public int[] getDimensions() {
        // For a circle, width and height are both 2*radius
        return new int[]{x, y, 2*radius, 2*radius};
    }
}
