import javax.swing.*;
import java.awt.*;

public class View {

    private JLabel jLabel1, jLabel2, jLabel3, jLabel4, jLabel5 ;
    private JMenuBar mb;


    public View(String title) {
        JFrame frame = new JFrame(title);
        mb = new JMenuBar();
        frame.setJMenuBar(mb);
        frame.getContentPane();
        frame.setSize(500, 500);
        addComponentsToPane(frame.getContentPane(), mb);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);

        // Display frame
        frame.pack();
        frame.setVisible(true);
    }

    //Creates and adds to pane UI elements
    public void addComponentsToPane( Container pane, JMenuBar mb) {

        jLabel1 = new JLabel();
        jLabel1 = new JLabel();
        jLabel1 = new JLabel();
        jLabel1 = new JLabel();
        jLabel1 = new JLabel();

    }
}
