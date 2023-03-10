import java.awt.*;
import java.awt.event.*;
class awtsquare extends Frame implements ActionListener {
    Label l1,l2;
    TextField t1;
    Button b1;
    awtsquare() {
        setSize(400,180); 
        setLayout(new GridLayout(3,2));
        l1= new Label("Enter a number: ");
        add(l1);
        t1= new TextField();
        add(t1);
        
        b1= new Button("Square");
        add(b1);
        
        l2= new Label(" ");
        add(l2);

        b1.addActionListener(this);

	  setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
        int a;
        a=Integer.parseInt(t1.getText());
        int ans= a*a;
        l2.setText("Answer is "+ ans);
    }
    public static void main(String [] args){
        new awtsquare();
    }
}
