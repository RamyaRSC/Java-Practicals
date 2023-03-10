//Q5 count all characters(letter, space, number & other)
import java.util.*;

public class charcount {
	public static void main(String[] args){
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter String: ");
		String s=obj.nextLine();
		int lcount = 0;
		int scount = 0;
		int dcount = 0;
		int ocount = 0;
		for (int i=0;i<s.length();i++){
			char ch=s.charAt(i);
			if(Character.isLetter(ch)){
				lcount++;
			}
			else if(Character.isDigit(ch)){
				dcount++;
			}
			else if(Character.isSpaceChar(ch)){
				scount++;
			}
			else{
				ocount++;
			}
		}
		
		System.out.println("Number of Letter: "+lcount);
		System.out.println("Number of Digits: "+dcount);
		System.out.println("Number of Space: "+scount);
		System.out.println("Number of other characters: "+ocount);
	}
}