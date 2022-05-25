import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

//34	WAP to copy content of one file into another file	

class P34{
	public static void main(String args[]){
		try {
			FileReader fr = new FileReader("Resources/p34.txt");
			BufferedReader br = new BufferedReader(fr);
			FileWriter fw = new FileWriter("Resources/p34aCopied.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			int character = 0; 
			while((character = br.read()) != -1){
				bw.write(character);
			}
			bw.close();
			fw.close();
			System.out.println("File copied.");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}