package demo.cxf.helloworld.client;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.soap.SOAPBinding;

import demo.cxf.helloworld.HelloWorld;


public class Client {

	//定义服务的服务名称和服务端口 
	private static final QName SERVICE_NAME =new QName("http://helloworld.cxf.demo/", "HelloWorld");
	
	private static final QName PORT_NAME =new QName("http://helloworld.cxf.demo/","HelloWorldPort");
	
	public Client(){}
	
	public static void main(String[] args)throws Exception{
		System.out.println("Starting Client");
		//用服务名称创建一个服务
		Service service = Service.create(SERVICE_NAME);
		
		//定义Endpoint 地址的内容
		String endpointAddress= "http://localhost:9000/HelloWorld";
		
		//在服务中增加端口
		service.addPort(PORT_NAME, SOAPBinding.SOAP11HTTP_BINDING,endpointAddress);
		
		//获取服务类的对象并处理
		HelloWorld helloWorld = service.getPort(HelloWorld.class);
		System.out.println(helloWorld.sayHello("Roger That!"));
		System.exit(0);
		
	}

}
