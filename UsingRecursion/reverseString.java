
import java.util.*;


public class Recursion{
  public static void reverseStringRecursion(String name, int indx)
  {
        if(indx==0){
            System.out.println(name.charAt(indx));
            return;
        }
        System.out.print(name.charAt(indx));
        reverseStringRecursion(name, indx-1);
  }

  // Using StringBuilder

  public static void reverseString(String name)
  {
    StringBuilder sb = new StringBuilder(name);

    sb.reverse();

    System.out.println(sb.toString());
  }

  // main Method

  public static void main(String[] args)
  {
    String name = "Just focus your goal");

    reverseStringRecursion(name, name.length()-1);
  
}
