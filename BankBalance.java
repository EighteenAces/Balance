
/*******************************************************************************
 * Java Course 1, Module 2 
 * 
 * Getting the number of years to reach $100,000 & $1,000,000 in savings account
 * 
 * @author: Jellie Mae Ortiz
 * Date created: May 12, 2022
 *******************************************************************************/

import java.util.Scanner;

public class BankBalance {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double startingBalance;
        double amount1 = 100000; // initialize value for the amount balance.
        double amount2 = 1000000;// initialize value for the amount balance.
        int years = 0;

        System.out.printf("\nEnter starting balance: ");
        startingBalance = scan.nextDouble();

        while (startingBalance < amount1) {

            startingBalance *= 2;
            years++;
        }
        System.out.println("\nIt takes" + " " + years + " " + "years" + " " + "to reach" + " " + "$" + amount1);

        while (startingBalance < amount2) {
            startingBalance *= 2;
            years++;
        }
        System.out.println("\nIt takes" + " " + years + " " + "years" + " " + "to reach" + " " + "$" + amount2);

        scan.close();
    } //end of the main method
} // end of the BankBalance.java