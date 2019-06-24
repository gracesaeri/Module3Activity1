/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servs;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author saeri
 */
@WebService(serviceName = "CalculatorService",
        endpointInterface = "servs.CalculatorInterface")

public class CalculatorService implements CalculatorInterface {

    @Override
    public int add(Integer n1, Integer n2) {
        return n1 + n2;
    }
    
    @Override
    public int subtract(Integer n1, Integer n2) {
        return n1 - n2;
    }
}
