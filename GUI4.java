import javax.swing.*;
import java.awt.*;

class Calculadora3 extends JFrame {
    JTextField textField;
    Calculadora3() {
        super("Calculadora");
        JComboBox choice = new JComboBox();
        choice.addItem("Somar");
        choice.addItem("Subtrair");
        choice.addItem("Multiplicar");
        choice.addItem("Dividir");

        JPanel t1 = new JPanel(new FlowLayout());
        t1.add(textField = new JTextField(20));

        JPanel t2 = new JPanel(new FlowLayout());
        t2.add(textField = new JTextField(20));
        t2.add(new JLabel(" = 0"));

        JPanel p = new JPanel(new FlowLayout());
        p.add(new JButton("Calcular"),BorderLayout.CENTER);

        add(t1, BorderLayout.WEST);
        add(t2, BorderLayout.EAST);
        add(choice, BorderLayout.CENTER);
        add(p, BorderLayout.SOUTH);
        pack();
        setVisible(true);
    }
}

public class GUI4 {
    public static void main (String[] args) {
        new Calculadora3();
    }
}
