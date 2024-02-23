import java.awt.*;

public class Component {

    int x, y, width, height;;
    public void draw(Graphics g) { }

    public int[] getDimensions() {
        return new int[]{x, y, 0, 0}; // Default implementation, to be overridden
    }
}
