import java.util.*;
public class reversestring{
	public static void main(String[] args){
		String s,t="";
		Scanner in=new Scanner(System.in);
		System.out.println("enter string: ");
		s=in.nextLine();
		int length=s.length();
		for(int i=length-1;i>=0;i--){
			t=t+s.charAt(i);
		}
		System.out.println("reverse: "+t);
	}
}