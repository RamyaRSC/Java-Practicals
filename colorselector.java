import java.awt.*;
import java.awt.event.*;

public class colorselector extends Frame implements ItemListener{
	Label l1;
	Checkbox red,green,blue;
	CheckboxGroup color;
	Frame f1;

	public colorselector(){
		super("Color Selector"); //name of the window
		f1=new Frame();
		color= new CheckboxGroup();
		red=new Checkbox("Red",color,false);
		green=new Checkbox("Green",color,false);
		blue=new Checkbox("Blue",color,false);
		f1.add(red);
		f1.add(green);
		f1.add(blue);
		

		l1=new Label(" "); 
		f1.add(l1);
		
		red.addItemListener(this);
		green.addItemListener(this);
		blue.addItemListener(this);
		
		f1.setSize(300,300);
		f1.setVisible(true);
		f1.setLayout(new GridLayout(4,1));
	}
	
	public void itemStateChanged(ItemEvent e){  //method updates the label text to indicate which radio button was selected.
		Checkbox option=color.getSelectedCheckbox();
		if(option==red){
			l1.setText("You clicked Red color.");
		}
		else if(option==green){
			l1.setText("You clicked Green color.");
		}
		else if(option==blue){
			l1.setText("You clicked Blue color.");
		}
	}
	
	public static void main(String[] args){
		new colorselector();
	}
}
