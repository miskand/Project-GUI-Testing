import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frontend {
    public static void createGUI() {
        JFrame welcomePage = new JFrame("Welcome Page");
        JPanel text = new JPanel();
        JPanel button = new JPanel();
        welcomePage.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        welcomePage.setSize(400, 400);
        welcomePage.setVisible(true);
        //You can use html here
        JLabel jl = new JLabel("<html><h1> Welcome! </h1></html>");
        JButton jb = new JButton("Log In/Sign Up");
        text.add(jl);
        button.add(jb);
        welcomePage.add(text, BorderLayout.NORTH);
        welcomePage.add(button, BorderLayout.CENTER);
        welcomePage.setVisible(true);

        jb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                welcomePage.setVisible(false);
                SignIn.createGUI();
            }
        });
    }
}
