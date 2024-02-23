import javax.swing.*;
import java.awt.*;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;

public class Screen extends JPanel implements PropertyChangeListener {

    ArrayList<Component> shapes = Repository.getInstance().getShapes();

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        for(Component shape : shapes){
            shape.draw(g);
        }
        /*for (Object shape : shapes) {
            if (shape instanceof Circle) {
                ((Circle) shape).draw(g);
            } else if(shape instanceof Box){
                ((Box) shape).draw(g);
            }
        }*/
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt){
        repaint();
    }
}
