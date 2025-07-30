import java.util.*;

public class function{
  public static int Fibonnaci(int n){
        if(n == 0 ) return 0 ;
        else if(n == 1 ) return 1 ;
        else return Fibonnaci(n-1)+Fibonnaci(n-2);
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println("Fibonnaci Series upto "+ num + ":");
        for (int i = 0; i <= num; i++) {
            System.out.print(Fibonnaci(i) + " ");
        }
    }
}
