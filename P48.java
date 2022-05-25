import java.net.Inet4Address;
//48	Demonstrate use of getbyname(),gethostname(), gethostaddress() methods for InetAddress class. 	
import java.net.InetAddress;

class P48{
	public static void main(String args[]){
		try {
			InetAddress i = InetAddress.getLocalHost();
			System.out.println(InetAddress.getByName("DESKTOP-F3JH8DP"));
			System.out.println(i.getHostName());
			System.out.println(i.getHostAddress());
		} catch (Exception e) {
		}

	}
}