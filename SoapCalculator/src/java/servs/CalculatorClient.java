/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package servs;

import java.net.URL;
import java.util.Scanner;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;

/**
 *
 * @author saeri
 * @version 1.0
 * @since 2019-06-23
 */


/**
 * A console application that accesses the Calculator service in the same package.
 * 
 */
public class CalculatorClient {
    
    public static void main (String[] args) throws Exception {
        int n1;
        int n2;
        
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to the Calculator Web Service.");
        System.out.println("To Add, Enter 1." + "\n To Subtract, Enter 2." + 
                "\n To Quit, Enter 3.");
        String userEntry = in.nextLine();
        
        while (userEntry != "3") {
            switch (userEntry) {
                case "1":
                    System.out.println("Add option selected." + "\nPlease enter the first number.");
                    n1 = in.nextInt();
                    System.out.println("Please enter the second number.");
                    n2 = in.nextInt();
                    System.out.println("Your answer is: " + add(n1, n2));
                    break;
                case "2":
                    System.out.println("Subtract option selected." + "\nPlease enter the first number.");
                    n1 = in.nextInt();
                    System.out.println("Please enter the second number.");
                    n2 = in.nextInt();
                    System.out.println("Your answer is: " + subtract(n1, n2));
                    break;
            }
        }
        System.out.println("You have chosen to quit the application." + "\nGoodbye!");
        quit();
    }

    private static String add(int n1, int n2) throws Exception {
        servs.CalculatorService service = new servs.CalculatorService();
        return "";
        }

    private static String subtract(int n1, int n2) {
        //TODO: MUST IMPLEMENT
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void quit() {
        System.exit(0);
    }
}
