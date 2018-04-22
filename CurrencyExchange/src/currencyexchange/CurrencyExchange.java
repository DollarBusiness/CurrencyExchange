/*
*Program: Currency Exchange
*This: CurrencyExchange.java
*Author: Joel Dollar
*Date: 2/01/2016
*Purpose: This program converts currencies
*/
package currencyexchange;
import java.util.Scanner;

public class CurrencyExchange {

    //===========  main ==========================
    public static void main(String[] args) {
        double rate;
        double dollars;
        double chineseRMB;
        int answer;
        
        Scanner input = new Scanner(System.in);
        
        //USER INPUT
        System.out.print("Enter the exchange rate from dollars to RMB: ");
        rate = input.nextDouble();
        
        System.out.print("Enter 0 to convert dollars to RMB and 1 vice versa: ");
        answer = input.nextInt();
        
        if(answer == 0)
        {
            //CONVERT DOLLARS TO RMB
            System.out.print("Enter the dollar amount: $");
            dollars = input.nextDouble();
            
            //CALCULATIONS
            chineseRMB = dollars * rate;
            
            //DISPLAY INFO.
            System.out.println("$" + dollars + " is " + chineseRMB + " yuan");
        }
        else if(answer == 1)
        {
            //CONVERT RMB TO DOLLARS
            System.out.print("Enter the RMB amount: $");
            chineseRMB = input.nextDouble();
            
            //CALCULATIONS
            dollars = chineseRMB * rate;
            
            //DISPLAY INFO.
            System.out.println(chineseRMB + " yuan is $" + dollars);
        }
        else
        {
            System.out.println("Invalid input");    
        }
    }
    
}
