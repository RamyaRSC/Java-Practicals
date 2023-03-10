import java.io.FileInputStream;
public class ofile {
	public static void main(String[] args){
		try{
			FileInputStream fin=new FileInputStream("C:\Users\janar\OneDrive\Desktop\Java practicals\f1.txt");
			int i=0;
			while((i=fin.read())!=-1){
				System.out.print((char)i);
			}
			fin.close();
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}