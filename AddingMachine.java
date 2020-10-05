package cse360assignment02;
import java.util.*;
/**
 * This function creates an AddingMachine object that keeps a history of
 * the functions that you call. Calling System.out.println() on an
 * object of type AddingMachine will print its history.
 */
public class AddingMachine {

  public static void main(String[] args)
  {
    AddingMachine myCalculator = new AddingMachine();
    myCalculator.add (4); 
    myCalculator.subtract (2); 
    myCalculator.add(5);
    System.out.println(myCalculator);
    System.out.println(myCalculator.getTotal());
    myCalculator.clear();
    System.out.println(myCalculator);
  }

  private String totalString = "0 ";
  private int total;
  
  //constructor
  public AddingMachine () {
    total = 0;  // not needed - included for clarity
  }
  
  //returns total
  public int getTotal () {
    return this.total;
  }
  
  //adds value
  public void add (int value) {
    totalString += "+ " + Integer.toString(value) + " ";
    this.total += value;
  }

  //subtracts value
  public void subtract (int value) {
    totalString += "- " + Integer.toString(value) + " ";
    this.total -= value;
  }

  //print history
  public String toString () {
    return totalString;
  }

  //clear history
  public void clear() {
    totalString = "0 ";
  }
}
