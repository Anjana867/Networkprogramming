package NetworkFirst;

import java.net.*;

public class CreateUrl {

	public static void main(String[] args){
		try{
			
			URL u = new URL("https://www.Viber.com/");
			System.out.println("The host name is :"+u.getHost());
			System.out.println("The default port is :"+u.getDefaultPort());
			System.out.println("The protocol name is :"+u.getProtocol());
			System.out.println("The authority is :"+u.getAuthority());
			System.out.println("The path is :"+u.getPath());
			System.out.println("The reference is :"+u.getRef());
		}
		
		catch(MalformedURLException ex){
			System.out.println("something is wrong....");
		}
	}
}
