import java.awt.*;
import java.awt.event.*;

public class awtlist extends Frame implements ActionListener {
    private Label label;
    private Button button;
    private List list;

    public awtlist() {
        super("List Example");

        // create and add components
        label = new Label("Please select an item from the list:");
        add(label);

        list = new List();
        list.add("Ring");
        list.add("Necklace");
        list.add("Sunglasses");
        list.add("Watch");
        add(list);

        button = new Button("Submit");
        button.addActionListener(this);
        add(button);

        // set frame properties
        setSize(400, 300);
        setLayout(new FlowLayout());
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        // get selected item from list
        String selectedItem = list.getSelectedItem();

        // update label with selected item
        label.setText("You selected: " + selectedItem);
    }

    public static void main(String[] args) {
        awtlist frame = new awtlist();
    }
}
