import java.util.Scanner; //importing Scanner

class circle {
	public static void main (String[] args) { 	//main method
        Scanner obj=new Scanner(System.in); 		//creating Scanner object		
        System.out.println("Enter radius of circle:"); //taking users input
        int r= obj.nextInt(); 				//reads int value from user
        
        System.out.println("Area of circle= "+ Math.PI*r*r);	//Area of circle formula PI*r^2
        System.out.println("Perimeter of circle= "+2*Math.PI*r);	//perimeter or circle formula 2*PI*r
	}
}