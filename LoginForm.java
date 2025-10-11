import javax.swing.*;
import java.awt.*;

class LoginForm {
    public static void main(String[] args) {
        JFrame f = new JFrame("Login Form");
        f.setLayout(new FlowLayout());

        JLabel l1 = new JLabel("Username:");
        JTextField t1 = new JTextField(15);
        JLabel l2 = new JLabel("Password:");
        JPasswordField p1 = new JPasswordField(15);
        JButton b1 = new JButton("Login");
        JLabel l3  = new JLabel("Arihant Jain");

        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(p1);
        f.add(b1);
        f.add(l3);

        f.setSize(250, 200);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}