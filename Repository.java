import java.util.*;
import java.beans.PropertyChangeSupport;

public class Repository extends PropertyChangeSupport {
    private static Repository single_instance = null;

    private ArrayList<Component> shapes;

    private Repository(){
        super(new Object());
        shapes = new ArrayList<Component>();
    }

    public void addShape(Component shape){
        shapes.add(shape);
        firePropertyChange("New Shape", null, shape);
    }

    public static synchronized Repository getInstance(){
        if (single_instance == null)
            single_instance = new Repository();

        return single_instance;
    }

    public ArrayList<Component> getShapes() {
        return shapes;
    }
}