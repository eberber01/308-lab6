import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;

public class Screen extends JPanel implements PropertyChangeListener {


    public void paintComponent(Graphics g){
        super.paintComponent(g);
        ArrayList<Shape> shapes = Repository.getInstance().getShapes();
        g.setColor(Color.blue);
        for (Shape shape : shapes) {
            if (shape instanceof Ellipse2D) {
                g.drawOval((int) Math.round(((Ellipse2D) shape).getX()), (int) Math.round(((Ellipse2D) shape).getY()), 50, 50);
            } else {
                g.drawRect((int) Math.round(((Rectangle2D) shape).getX()), (int) Math.round(((Rectangle2D) shape).getY()), 50, 50);
            }
        }
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt){
        System.out.println("Repainting");
        repaint();
    }
}
