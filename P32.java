import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

//32	WAP that writes student’s data (enrollment no, name, percentage, phone no.) to a file and then reads the student data back from that file and display it on the console. (Use BufferedInputStream and BufferedOuputStream)	
class P32{
	public static void main(String args[]){
		try {
			int rno = 20;
			String name = "Prakhar";
			float percentage = 98.76f;
			String phno = "8178291102";
			
			//writing to file
			FileOutputStream fos = new FileOutputStream("Student.dat");
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			DataOutputStream dos = new DataOutputStream(bos);
			dos.writeInt(rno);
			dos.writeUTF(name);
			dos.writeFloat(percentage);
			dos.writeUTF(phno);
			dos.close();
			System.out.println("File Written.\n");
			//reading from file
			FileInputStream fis = new FileInputStream("Student.dat");
			BufferedInputStream bis = new BufferedInputStream(fis);
			DataInputStream dis = new DataInputStream(bis);
			int readRno = dis.readInt();
			String readName = dis.readUTF();
			float readPercentage = dis.readFloat();
			String readPhno = dis.readUTF();
			System.out.println("Name " + readName);
			System.out.println("Enrollment "+  readRno);
			System.out.println("Percentage " +readPercentage);
			System.out.println("Ph.No. " +readPhno);

			dis.close();
			System.out.println("EOF Read.");

		} catch (Exception e){
			e.printStackTrace();
		}

	}
}
