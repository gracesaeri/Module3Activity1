
package client;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "CalculatorInterface", targetNamespace = "http://localhost:8084/SoapCalculator/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CalculatorInterface {


    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns java.lang.Integer
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "add", targetNamespace = "http://localhost:8084/SoapCalculator/", className = "client.Add")
    @ResponseWrapper(localName = "addResponse", targetNamespace = "http://localhost:8084/SoapCalculator/", className = "client.AddResponse")
    @Action(input = "http://localhost:8084/SoapCalculator/CalculatorInterface/addRequest", output = "http://localhost:8084/SoapCalculator/CalculatorInterface/addResponse")
    public Integer add(
        @WebParam(name = "arg0", targetNamespace = "")
        Integer arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        Integer arg1);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns java.lang.Integer
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "subtract", targetNamespace = "http://localhost:8084/SoapCalculator/", className = "client.Subtract")
    @ResponseWrapper(localName = "subtractResponse", targetNamespace = "http://localhost:8084/SoapCalculator/", className = "client.SubtractResponse")
    @Action(input = "http://localhost:8084/SoapCalculator/CalculatorInterface/subtractRequest", output = "http://localhost:8084/SoapCalculator/CalculatorInterface/subtractResponse")
    public Integer subtract(
        @WebParam(name = "arg0", targetNamespace = "")
        Integer arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        Integer arg1);

}
