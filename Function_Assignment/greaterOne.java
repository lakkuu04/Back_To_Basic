/** Write a function which takes in 2 numbers and returns the greater of those two. */

import java.util.*;
public class functions {
  public static int greatestOne(int n , int m){
        if(n > m){
            return n;
        }else if(n == m){
            return 0;
        }else{
            return m;
        }
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int result = greatestOne(a,b);
        if(result == 0) {
            System.out.println("Both numbers are equal.");
        }else{
            System.out.println("Greater number between "+a+" & "+b+" is : " + result);
        }

    }
}
