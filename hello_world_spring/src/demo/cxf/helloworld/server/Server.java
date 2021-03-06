package demo.cxf.helloworld.server;

import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Server {
    
	
	public Server(){
		System.out.println("Starting Server");
		new ClassPathXmlApplicationContext(new String[] {"/demo/cxf/helloworld/server/server-beans.xml"});
	}
	
	
	public static void main(String [] args) throws Exception{
		new Server();
		System.out.println("Server ready...");
		Thread.sleep(5*60*1000);
		System.out.println("Server exiting");
		System.exit(0);
	}
	
}
