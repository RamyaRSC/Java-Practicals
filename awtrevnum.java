import java.awt.*;
import java.awt.event.*;
class awtrevnum extends Frame implements ActionListener {
    Label l1,l2;
    TextField t1;
    Button b1;
    Frame f1;
    awtrevnum() {
        f1= new Frame();
        l1= new Label("Enter a number: ");
        f1.add(l1);
        t1= new TextField();
        f1.add(t1);
        f1.add(new Label());
        b1= new Button("Reverse");
        f1.add(b1);
        f1.add(new Label());
        l2= new Label(" ");
        f1.add(l2);
        f1.setSize(300,300);
        f1.setVisible(true);
        f1.setLayout(new GridLayout(3,2));
        b1.addActionListener(this);
    }
    public void actionPerformed (ActionEvent e) {
        int num= Integer.parseInt(t1.getText());
        int reversed=0;
        while(num!=0){
            int digit=num%10;
            reversed=reversed*10+digit;
            num=num/10;
        }
        l2.setText("Reversed number is "+ reversed);
    }
    public static void main(String [] args){
        new awtrevnum();
    }
}
