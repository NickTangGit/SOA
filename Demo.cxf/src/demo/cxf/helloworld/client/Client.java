package demo.cxf.helloworld.client;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.soap.SOAPBinding;

import demo.cxf.helloworld.HelloWorld;


public class Client {

	//�������ķ������ƺͷ���˿� 
	private static final QName SERVICE_NAME =new QName("http://helloworld.cxf.demo/", "HelloWorld");
	
	private static final QName PORT_NAME =new QName("http://helloworld.cxf.demo/","HelloWorldPort");
	
	public Client(){}
	
	public static void main(String[] args)throws Exception{
		System.out.println("Starting Client");
		//�÷������ƴ���һ������
		Service service = Service.create(SERVICE_NAME);
		
		//����Endpoint ��ַ������
		String endpointAddress= "http://localhost:9000/HelloWorld";
		
		//�ڷ��������Ӷ˿�
		service.addPort(PORT_NAME, SOAPBinding.SOAP11HTTP_BINDING,endpointAddress);
		
		//��ȡ������Ķ��󲢴���
		HelloWorld helloWorld = service.getPort(HelloWorld.class);
		System.out.println(helloWorld.sayHello("Roger That!"));
		System.exit(0);
		
	}

}
