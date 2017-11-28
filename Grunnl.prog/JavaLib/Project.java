import static java.lang.System.*;
import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Project extends JFrame {

    // JPanel
    JPanel pnlButton = new JPanel();
    // Buttons
    JButton knapp1 = new JButton("Hull 1");
    JButton knapp2 = new JButton("Hull 2");
    JButton knapp3 = new JButton("Hull 3");

    public Project() {
    	
        // Adding to JFrame
        pnlButton.add(knapp1);
        pnlButton.add(knapp2);
        pnlButton.add(knapp3);
        add(pnlButton);
        // JFrame properties
        setSize(400, 400);
        setBackground(Color.BLACK);
        setTitle("Farmertroubles");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Project();
    }
}