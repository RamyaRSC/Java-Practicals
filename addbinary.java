import java.util.Scanner;
public class addbinary{
	public static void main(String[]args){
		long b1,b2;
		int i=0, rem=0;
		int[] sum=new int[20];
		Scanner s=new Scanner(System.in);
		System.out.println("enter 1st binary no.: ");
		b1=s.nextLong();
		System.out.println("enter 2nd binary no.: ");
        	b2=s.nextLong();
		while (b1!=0 || b2!=0){
			sum[i++]=(int)((b1%10+b2%10+rem)%2);
			rem=(int)((b1%10+b2%10+rem)/2);
			b1=b1/10;
			b2=b2/10;
		}
		if (rem!=0){
			sum[i++]=rem;
		}
		--i;
		System.out.print("Sum of b1+b2= ");
		while(i>=0){
			System.out.print(sum[i--]);
		}
	}
}


/*
code 2
import java.util.Scanner;
public class pra2a{
	public static void main(String[]args){
		Scanner sn=new Scanner(System.in);
		System.out.println("please enter the first binary no:");
		String first=sn.nextLine();
		System.out.println("please enter the second binary no:");
		String second=sn.nextLine();
		String addition=add(first,second);
		System.out.println("addition of two binary no is:"+addition);
	}
	public static String add(String first,String second){
		int b1=Integer.parseInt(first,2);
		int b2=Integer.parseInt(second,2);
		int sum=b1+b2;
		return Integer.toBinaryString(sum);
	}
}
