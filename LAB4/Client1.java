package LAB4;

import java.io.*;

import org.eclipse.californium.core.CoapClient;
import org.eclipse.californium.elements.exception.ConnectorException;

public class Client1 {

	public static void main(String[] args) throws ConnectorException, IOException {
		CoapClient client1=new CoapClient("coap://localhost/Humidity");
		
			for(int i=0;i<10;i++) {
				String text=client1.get().getResponseText();
				System.out.println(text);
			}
		
			System.out.println("Client Ended");
		}
	}

