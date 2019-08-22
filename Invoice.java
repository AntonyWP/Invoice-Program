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

public class Invoice
{
  private String partNum;              // used to hold part number
  private String partDes;              // used to hld part description
  private int quantity;                // used to hold quantity
  private double price;                // used to hold price  
  private double sum;                  // used to hold calculated total price of invoice
 
  // Constructor that initializes the four instance variables
  public Invoice(String number, String description, int amount, double cost)
  {
    partNum = number;
    partDes = description;
    quantity = amount;
    price = cost;  
  }
  
  // part number set method
  public void setPartNum(String number)
  {
   partNum = number;
  }
  
  // part number get method
  public String getPartNum()
  {
    return partNum;
  }
  
  // Part description set method
    public void setPartDes(String description)
  {
    partDes = description;
  }
  
  // Part description get method  
  public String getPartDes()
  {
    return partDes;
  }
  
  // Quantity set method. Also checks for validity 
  public void setQuantity(int amount)
  {
    if(amount <= 0)
      quantity = 0;
    if(amount > 0)
      quantity = amount;
  }
  
  // Quantity get method
  public int getQuantity()
  {
    return quantity;
  }
  
  // Price set method. Also checks for validity
  public void setPrice(double cost)
  {
    if(cost <= 0.0)
      price = 0.0;
    if(cost > 0.0)
      price = cost;
  }
  
  // Price get method
  public Double getPrice()
  {
    return price;
  }
  
  // Invoice amount method
  public Double getInvoiceAmount()
  {  
    sum = quantity * price;
    return sum;
  }
  
  // display of the invoice information method
  public void displayMessage()
  {
    System.out.printf("\nPart number- %s\n", getPartNum());
    System.out.printf("\nPart description- %s\n", getPartDes());
    System.out.printf("\nQuantity- %d\n", getQuantity());
    System.out.printf("\nPrice per item- $%3.2f\n", getPrice());
    System.out.printf("\nThe Invoice Amount is $%3.2f\n", getInvoiceAmount());
  }
}
