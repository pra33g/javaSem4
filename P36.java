import java.io.PrintWriter;
import java.util.Scanner;

//36	WAP that take input from keyboard and write into a file using character stream	
class P36{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		try {
			PrintWriter pw = new PrintWriter("Resources/p36.txt");
			System.out.println("Enter a line:");
			pw.write(s.nextLine());
			pw.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		s.close();
	}
}