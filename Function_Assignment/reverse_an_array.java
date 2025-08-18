import java.util.*;

public class function{
  public static int[] reverseArray(int[] arr , int l , int r){
    if(l>=r) return ;
    
    int temp = arr[l] ;
    arr[l] = arr[r] ;
    arr[r] = temp ;

    reverseArray(arr,l+1,r-1);
    }
    public static void main(String []args){
      int[] arr = {1,2,3,4} ;

      System.out.println("arr : "+ Arrays.toString(arr));
      reverseArray(arr,0,arr.length-1);
      System.out.println("reverse array :"+ Arrays.toString(arr));
    }
}
