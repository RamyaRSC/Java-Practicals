import java.util.Scanner; //importing Scanner
class multiplication {
    multiplication (){ //constructor
        Scanner obj=new Scanner (System.in); //creating Scanner object
        System.out.println("Enter a number:"); //taking users input
        int num= obj.nextInt(); //reads int value from user
        
        for (int i=1; i<10; i++) {
            System.out.println(num + "*" + i +"=" +num*i);
        }
    }
}

public static void main(String[] args) {
	System.out.println("Multiplication table program:-\n");
      multiplication obj1=new multiplication(); //no need to call method as it's constructor
}
