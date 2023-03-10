import java.awt.*;
import java.awt.event.*;

public class awtrevnum extends Frame implements ActionListener {

    private Label label;
    private TextField textField;

    public awtrevnum() {
        super("Reverse Number");
        setLayout(new FlowLayout());
 
        textField = new TextField(10);
        add(textField);

        Button button = new Button("Reverse");
        add(button);
        button.addActionListener(this);

        label = new Label();
        label.setPreferredSize(new Dimension(200, 20));
        add(new Label("Enter a number: "));
        add(label);

        setSize(900, 200);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String input = textField.getText();
        String reverse = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            reverse += input.charAt(i);
        }

        label.setText("Reverse number: " + reverse);
    }

    public static void main(String[] args) {
        awtrevnum frame = new awtrevnum();
    }
}
