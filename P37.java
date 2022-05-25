import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

//37	Write a program to use Byte stream class to read form a text file and copy the content to another text file	
class P37{
	public static void main(String args[]){
		try {
			BufferedInputStream bis = new BufferedInputStream(new FileInputStream("Resources/p37.txt"));
			BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("Resources/p37Copied.txt"));
			int data = bis.read();
			while(data != -1){
				// System.out.printf("%c", data);
				bos.write(data);
				data = bis.read();
				
			}			
			bos.close();					
			bis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}