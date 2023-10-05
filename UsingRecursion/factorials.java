import java.util.*;

public class Factorials
{
  public  static Scanner timtim = new Scanner(System.in);

  public static int factorials(int N)
  {
    if(N==1 || N==0)
    {
      return 1;
    }

    int calN = factorials(N-1);
    int fact = N * calN;
    return fact;
  }
  
  public static void main(String[] args)
  {
      int N = timtim.nextInt();

      int result = factorials(N);
      System.out.println(result);

      timtim.close();
    
  }
}
