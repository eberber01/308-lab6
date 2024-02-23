import javax.swing.*;

public class Main extends JFrame {

    public Main(){
        Screen screen = new Screen();
        add(screen);

        Repository repository = Repository.getInstance();
        repository.addPropertyChangeListener(screen);

        CircleBuilder circleBuilder = new CircleBuilder();
        Thread tCircle = new Thread(circleBuilder);
        tCircle.start();

        BoxBuilder boxBuilder = new BoxBuilder();
        Thread tBox = new Thread(boxBuilder);
        tBox.start();
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.setSize(1000, 1000);
        main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        main.setVisible(true);
    }
}
