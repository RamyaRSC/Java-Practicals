import java.io.FileInputStream;
import java.io.FileOutputStream;

public class copyfile {
	public static void main(String[] args){
		try{
			FileInputStream fin=new FileInputStream("C:\Users\janar\OneDrive\Desktop\Java practicals\f1.txt");
			FileInputStream fin=new FileInputStream("C:\Users\janar\OneDrive\Desktop\Java practicals\f2.txt");
			int i=0;
			while((i=fin.read())!=-1){
				fout.write(i);
				System.out.print((char)i);
			}
			fin.close();
			fout.close();
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}