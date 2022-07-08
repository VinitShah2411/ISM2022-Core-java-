package FileIO;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class createfile {
	public static void main(String[] args) throws IOException {
		
		File f = new File("D:\\IMS\\Core JAVA\\FileIO\\Demo1.txt");
	//	f.createNewFile();
		System.out.println(f.exists());
		FileOutputStream fos = new FileOutputStream(f);
		fos.write('x');
		long l = f.length();
		System.out.println(l);
			//	f.mkdirs();
		
		/*try {
			
		} catch (Exception e) {
			System.out.println(e);
		}*/
	fos.close();
//	f.delete();
	}
	
}
