package org.apache.handlers;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.2.1
 * 2017-12-21T00:16:24.359+08:00
 * Generated source version: 3.2.1
 * 
 */
@WebService(targetNamespace = "http://apache.org/handlers", name = "AddNumbers")
@XmlSeeAlso({org.apache.handlers.types.ObjectFactory.class})
public interface AddNumbers {

    @WebMethod
    @RequestWrapper(localName = "addNumbers", targetNamespace = "http://apache.org/handlers/types", className = "org.apache.handlers.types.AddNumbers")
    @ResponseWrapper(localName = "addNumbersResponse", targetNamespace = "http://apache.org/handlers/types", className = "org.apache.handlers.types.AddNumbersResponse")
    @WebResult(name = "return", targetNamespace = "http://apache.org/handlers/types")
    public int addNumbers(
        @WebParam(name = "arg0", targetNamespace = "http://apache.org/handlers/types")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "http://apache.org/handlers/types")
        int arg1
    ) throws AddNumbersFault;
}