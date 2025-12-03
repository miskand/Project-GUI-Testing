import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Home {
    public static void createGUI(String username) {
        JFrame home = new JFrame("Home");
        JPanel text = new JPanel();
        JPanel button = new JPanel();
        home.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        home.setSize(400, 400);
        home.setVisible(true);
        //You can use html here
        JLabel jl = new JLabel("<html><h1> Welcome in " + username + " </h1></html>");
        JButton make = new JButton("Make a Reservation");
        JButton cancel = new JButton("Cancel a Reservation");
        text.add(jl);
        button.add(make);
        button.add(cancel);
        home.add(text, BorderLayout.NORTH);
        home.add(button, BorderLayout.CENTER);
        home.setVisible(true);
        make.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                home.setVisible(false);
                SignIn.createGUI();
            }
        });
        cancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                home.setVisible(false);
                SignIn.createGUI();
            }
        });

    }
}
