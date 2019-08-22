/*********************************************************************
 *                                                                   *
 *  CSCI 470               Assignment 2           Fall 2018          *
 *                                                                   *
 *  Developer(s):   Antony Pierson                                   *
 *                                                                   *
 *  Section:        1                                                *
 *                                                                   *
 *  Due Date/Time:  9/14/18 11:59p.m.                                *
 *                                                                   *
 *  Purpose:        A java program for a class called Invoice that a *
 *                  store might use to represent an invoice for an   *
 *                  item sold at the store.                          *
 ********************************************************************/

import java.util.Scanner;                                // import the Scanner class to read input data

public class InvoiceTest
{
  public static void main(String[] args)
  {
    String partNum;                                      // used to hold part number
    String partDes;                                      // used to hole part description
    int quantity;                                        // used to hold quantity
    double price;                                        // used to hold price
    
    Scanner keyScan = new Scanner(System.in);            // scanner to gets keyboard input from user.
    Invoice myInvoice = new Invoice(" ", " ", 0, 0.0);   // initialize scanner object
    
    System.out.print("Enter part number: ");             // print statment to prompt user input
    partNum = keyScan.nextLine();                        // Use method nextLine to read an input part number
    myInvoice.setPartNum(partNum);                       // set part number
    
    System.out.print("Enter part description: ");        // print statment to prompt user input
    partDes = keyScan.nextLine();                        // Use method nextLine to read an input part description
    myInvoice.setPartDes(partDes);                       // set part description
    
    System.out.print("Enter quantity: ");                // print statment to prompt user input
    quantity = keyScan.nextInt();                        // Use method nextInt to read an input quantity.
    myInvoice.setQuantity(quantity);                     // set quantity
    
    System.out.print("Enter price: ");                   // print statment to prompt user input
    price = keyScan.nextDouble();                        // Use method nextDouble to read an input price
    myInvoice.setPrice(price);                           // set price
    
    myInvoice.displayMessage();                          // call displayMessage to display invoice information
    
    keyScan.close();                                     // close the scanner
  }
} 