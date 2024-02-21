import java.util.*;
import java.awt.*;
import java.beans.PropertyChangeSupport;
public class Repository extends PropertyChangeSupport {
    private static Repository single_instance = null;
 
    private ArrayList<Shape> shapes;

    private Repository(){
        super(new Object());
        shapes = new ArrayList<Shape>();
    }

    public void addShape(Shape shape){
        shapes.add(shape);
        firePropertyChange("New Shape", null, shape);
    }
 
    public static synchronized Repository getInstance(){
        if (single_instance == null)
            single_instance = new Repository();
 
        return single_instance;
    } 

    public ArrayList<Shape> getShapes() {
        return shapes;
    }
}
