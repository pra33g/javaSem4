import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.*;

//49	WAP in which client sends radius to the server, the server computes the area and sends it to the client which displays on the console.	
class P49Server{
	public static void main(String args[]){
		try {
			ServerSocket ss = new ServerSocket(4041);
			System.out.println("Server port: " + ss.getLocalPort());
			Socket s = ss.accept();
			// BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
			ObjectInputStream ois = new ObjectInputStream(s.getInputStream());
			Float r = ois.readFloat(); 
					

			Float area = (float)Math.PI * r * r;
			System.out.println("Got radius " + r + "\nReturned area: " + area);
			// BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
			ObjectOutputStream oos = new ObjectOutputStream(s.getOutputStream());
			oos.writeFloat(area);	
			oos.flush();
			oos.close();
			s.close();
			ss.close();
			System.out.println("Server Closed.");
			System.exit(0);
		} catch (Exception e) {
			System.out.println(e);
		}

	}
}