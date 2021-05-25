import javax.swing.*;
import java.awt.*;

class Calculadora extends JFrame {
    JTextField textField;
    Calculadora() {
        super("Calculadora");
        JPanel s = new JPanel(new GridLayout(4, 0));
        s.add(new JButton("Soma"));
        s.add(new JButton("Subtrai"));
        s.add(new JButton("Multiplica"));
        s.add(new JButton("Divide"));

        JPanel t1 = new JPanel(new FlowLayout());
        t1.add(textField = new JTextField(20));

        JPanel t2 = new JPanel(new FlowLayout());
        t2.add(textField = new JTextField(20));
        t2.add(new JLabel(" = 0"));

        add(t1, BorderLayout.WEST);
        add(t2, BorderLayout.EAST);
        add(s, BorderLayout.CENTER);
        pack();
        setVisible(true);
    }
}

public class GUI2 {
    public static void main (String[] args) {
        new Calculadora();
    }
}
