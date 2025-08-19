import java.util.*;

public class Solution{
  public boolean isPalindrome(String s){
    String cleaned = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
    return helper(cleaned,0,cleaned.length()-1);
  }
  private boolean helper(String s,int left ,int right){
    if(left >= right) return true ;
    if(s.charAt(left) != s.charAt(right)) return false;
    return helper(s,left+1,right-1);
  }
  public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();

    Solution sol = new Solution();
    System.out.println(sol.isPalindrome(s));
  }  
}
