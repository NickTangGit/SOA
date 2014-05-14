package demo.cxf.helloworld.server;
import javax.xml.ws.Endpoint;
import demo.cxf.helloworld.*;

public class Server {
    
	
	public Server(){
		System.out.println("Starting Server");
		HelloWorld helloWorld = new HelloWorldImpl();
		String address="http://localhost:9000/HelloWorld";
		Endpoint.publish(address, helloWorld);
	}
	
	
	public static void main(String [] args) throws Exception{
		new Server();
		System.out.println("Server ready...");
		Thread.sleep(5*60*1000);
		System.out.println("Server exiting");
		System.exit(0);
	}
	
}
