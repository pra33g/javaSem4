//49	WAP in which client sends radius to the server, the server computes the area and sends it to the client which displays on the console.	
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;

class P49Client{
	public static void main(String args[]){
		try {
			Socket s = new Socket(InetAddress.getLocalHost(), 4041);
			ObjectOutputStream oos = new ObjectOutputStream(s.getOutputStream());
			oos.writeFloat(20.0f);
			oos.flush();
			System.out.println("Client sent radius: " + 20.0f);
			ObjectInputStream ois = new ObjectInputStream(s.getInputStream());
			Float area = ois.readFloat();
			oos.close();
			ois.close();
			System.out.println("Area of circle is " + area);
			
		} catch (Exception e) {
			System.out.println(e);
		}

	}
}