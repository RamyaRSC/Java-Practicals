import java.util.Scanner;
public class BtoD{
	public static void main(String[]args){
		Scanner sn=new Scanner(System.in);
		System.out.println("enter decimal no:");
		int b1=sn.nextInt();
		System.out.println("integer to binary conversion:"+ Integer.toBinaryString(b1));
		
		System.out.println("enter a binary no:");
		String b3=sn.nextLine();
		System.out.println("binary to decimal conversion:"+Integer.parseInt(b3,2));
	}
}
