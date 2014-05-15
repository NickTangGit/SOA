package demo.cxf.helloworld;

import javax.jws.WebParam;
import javax.jws.WebService;
@WebService(serviceName = "HelloWorld")
public class HelloWorldImpl implements HelloWorld {

	@Override
	public String sayHello(@WebParam(name="text")String text) {
		// TODO Auto-generated method stub
		System.out.println("Say Hello Called");
		return "It works!";
	}

}
