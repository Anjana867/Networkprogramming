package NetworkFirst;

import java.net.*;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class AddressType {
public static void main(String [] args){
	try{
		InetAddress address = InetAddress.getByName("www.facebook.com"); //site name
		if(address.isAnyLocalAddress()){
			System.out.println(address +" is a wildcard address.");
		}
	if(address.isLoopbackAddress()){
		System.out.println(address +" is a loopback address.");
	}
	if(address.isLinkLocalAddress()){
		System.out.println(address +" is a Linklocal address.");
	}
	else if(address.isSiteLocalAddress()){
		System.out.println(address +" is a SiteLocal address");
	}
	else {
		System.out.println(address +" is a global address.");
	}
	if(address.isMulticastAddress()){
		System.out.println(address +" is a multicast address");
	}
	else if(address.isMulticastAddress()){
		if(address.isMCGlobal()){
			System.out.println(address +" is a global multicast address.");
		}
		else if(address.isMCOrgLocal()){
			System.out.println(address +" is an organization wide multicast address.");
		}
		else if(address.isMCSiteLocal()){
			System.out.println(address +" is a site wide multicast address.");
		}
		else if(address.isMCLinkLocal()){
			System.out.println(address +" is a subnet wide multicast address.");
		}
		else if (address.isMCNodeLocal()){
			System.out.println(address +" is a interface Local multicast address.");
		}
		else {
			System.out.println(address +" is a unknown multicast address.");
		}
	}
	else{System.out.println(address +" is a unicast multicast address.");
	}
	
}		catch(UnknownHostException e){
	System.err.println("could not resolve");
}
}
}
