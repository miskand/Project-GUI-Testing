import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SignIn {
    public static void createGUI() {
        JFrame signIn = new JFrame("Log In");
        JPanel text = new JPanel();
        JPanel button = new JPanel();
        signIn.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        signIn.setSize(400, 400);
        signIn.setVisible(true);
        //You can use html here
        JLabel jl = new JLabel("<html><h2> Please enter your\nUsername and Password </h2></html>");
        JTextField username = new JTextField("Username");
        JTextField password = new JTextField("Password");
        JButton submit = new JButton("Log in");
        text.add(jl);
        button.add(username);
        button.add(password);
        button.add(submit);
        signIn.add(text, BorderLayout.NORTH);
        signIn.add(button, BorderLayout.CENTER);
        signIn.setVisible(true);
        submit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                signIn.setVisible(false);
                Home.createGUI(username.getText());
            }
        });

    }
}
