package NetworkFirst;

import java.net.*;
public class NetworkFirst {

	
	public static void main(String[] args){
		try{
			
			InetAddress address = InetAddress.getByName("www.facebook.com");
			System.out.println(address);
		
		}
		catch(UnknownHostException e){
			System.out.println("error");
			
		}
		
	}
}
