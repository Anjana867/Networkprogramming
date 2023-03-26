package NetworkFirst;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class GetterMethods {
	public static void main(String[] args){
		try{
			
			InetAddress address = InetAddress.getByName("www.facebook.com");
			System.out.println(address);
			address.getCanonicalHostName();
			address.getHostName();
			address.getAddress();
			System.out.println(address.getHostName());
			System.out.println(address.getAddress());
			System.out.println(address.getCanonicalHostName());
			
			
		}
		catch(UnknownHostException e){
			System.out.println("error");
			
		}
	}
}
