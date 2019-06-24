/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package servs;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 *
 * @author saeri
 * @version 1.0
 * @since 06/23/2019
 */

@WebService(targetNamespace = "http://localhost:8084/SoapCalculator")

public interface CalculatorInterface {
    
    @WebMethod(operationName = "add")
    int add(Integer n1, Integer n2);
    @WebMethod(operationName = "subtract")
    int subtract(Integer n1, Integer n2);
}
