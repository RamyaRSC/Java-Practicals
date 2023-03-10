import java.io.FileInputStream;
import java.io.FileOutputStream;

public class storefile {
	public static void main(String[] args){
		try{
			Scanner s=new Scanner(System.in);
			System.out.println("Enter student name: ");
			String name=s.next();
			System.out.println("Enter student rollnum: ");
			String rollnum=s.next();
			System.out.println("Enter student course: ");
			String course=s.next();

			FileOutputStream a=new FileOutputStream("f1.txt");
			byte n[]=name.getBytes();
			byte r[]=rollnum.getBytes();
			byte c[]=course.getBytes();
			
			a.write(n);
			a.write(10);
			a.write(r);
			a.write(10);
			a.write(c);
			a.write(10);
	
			String course=s.next();
			FileOutputStream a=new FileOutputStream
			
			byte n[]=name.getByte();
			byte r[]=rollnum.get.getBytes();
			byte c[]=course.getBytes();

			a.write(n);
			a.write(10);
			a.write(r);
			a.write(10);
			a.write(c);
			a.write(10);
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}