//47	Demonstrate use of factory methods for InetAddress class.	
import java.net.*;
class P47{
	public static void main(String args[]){
		try {
			InetAddress i = InetAddress.getLocalHost();
			System.out.println("Local host: " + i);
			
			InetAddress address2
            = InetAddress.getByName("google.com");
        System.out.println("InetAddress of Named Host : "
                           + address2);
  
        // To get and print ALL InetAddresses of Named Host
        InetAddress address3[]
            = InetAddress.getAllByName("172.19.25.29");
        for (int ii = 0; ii < address3.length; ii++) {
            System.out.println(
                "ALL InetAddresses of Named Host : "
                + address3[ii]);
        }
  
        // To get and print InetAddresses of
        // Host with specified IP Address
        byte IPAddress[] = { 125, 0, 0, 1 };
        InetAddress address4
            = InetAddress.getByAddress(IPAddress);
        System.out.println(
            "InetAddresses of Host with specified IP Address : "
            + address4);
  
        // To get and print InetAddresses of Host
        // with specified IP Address and hostname
        byte[] IPAddress2
            = { 105, 22, (byte)223, (byte)186 };
        InetAddress address5 = InetAddress.getByAddress(
            "google.com", IPAddress2);
        System.out.println(
            "InetAddresses of Host with specified IP Address and hostname : "
            + address5);
		} catch (Exception e) {
		}

	}
}