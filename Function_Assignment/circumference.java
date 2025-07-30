/** Write a function that takes in the radius as input and returns the circumference of a circle. */

import java.util.*;
public class function{
  public static double parimeterC(int r){
    return 2*3.14*r ;
  }
  public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    double radius = sc.nextInt();
    System.out.println("Circumference of the circle : "+ parimeterC(radius));
  }
}  
  
