package com.tutorial.ws.helloworld;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebParam.Mode;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.ParameterStyle;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;

/**
 * @author Jayram First Create a Web Service Endpoint Interface
 */
@WebService(name = "HelloWorldAsService", targetNamespace = "http://7chapters.com")
@SOAPBinding(style = Style.DOCUMENT, parameterStyle = ParameterStyle.WRAPPED, use = Use.ENCODED)
public interface HelloWorld {
	@WebMethod(operationName = "getHelloWorldRequest")
	@WebResult(name = "HelloWorldResponse", targetNamespace = "http://7chapters.com/ws/types")
	String getHelloWorld(
			@WebParam(targetNamespace = "http://7chapters.com/ws/types", name = "argOne", mode = Mode.IN) String name,
			@WebParam(targetNamespace = "http://7chapters.com/ws/types", name = "argTwo", mode = Mode.IN) String nametwo);
}