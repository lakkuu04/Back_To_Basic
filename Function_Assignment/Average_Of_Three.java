/**Enter 3 numbers from the user & make a function to print their average.*/

import java.util.*;
public class Function{
  public static int averageOfThree(int a,int b,int c){
    int avg = (a + b + c)/3 ;
    return avg ;
  }
  public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    int l = sc.nextInt();
    int m = sc.nextInt();
    int n = sc.nextInt();

    int result = averageOfThree(l,m,n);

    System.out.prinln("Average of Three : "+result);
  }
} 
    
