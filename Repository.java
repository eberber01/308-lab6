import java.util.*;
import java.beans.PropertyChangeSupport;

public class Repository extends PropertyChangeSupport {
    private static Repository single_instance = null;

    private ArrayList<Object> shapes;

    private Repository(){
        super(new Object());
        shapes = new ArrayList<Object>();
    }

    public void addShape(Object shape){
        shapes.add(shape);
        firePropertyChange("New Shape", null, shape);
    }

    public static synchronized Repository getInstance(){
        if (single_instance == null)
            single_instance = new Repository();

        return single_instance;
    }

    public ArrayList<Object> getShapes() {
        return shapes;
    }
}