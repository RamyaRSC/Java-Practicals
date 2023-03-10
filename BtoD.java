import java.util.Scanner;
public class BtoD{
	public static void main(String[]args){
		Scanner sn=new Scanner(System.in);
		System.out.println("enter the decimal no:");
		int b1=sn.nextInt();
		String b2=Integer.toBinaryString(b1);
		System.out.println("integer to binary conversion:"+ b2);
		System.out.println("enter a binary no:");
		String b3=sn.nextLine();
		int a=Integer.parseInt(b3,2);
		System.out.println("binary to decimal conversion:"+a);
	}
}