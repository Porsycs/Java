import javax.swing.*;
import java.awt.*;
    
class Editor extends JFrame {
    JTextArea textArea;
    Editor() {
        super("Editor de texto");
        JPanel p = new JPanel(new GridLayout(4, 0));
        p.add(new JButton("Abrir"));
        p.add(new JButton("Salvar"));
        p.add(new JButton("Salvar como"));
        p.add(new JButton("Fechar"));

        add(textArea = new JTextArea(20, 50), BorderLayout.EAST);
        add(p, BorderLayout.WEST);
        pack();
        setVisible(true);
    }
}

public class GUI1 {
    public static void main(String[] args) {
        new Editor();
    }
}