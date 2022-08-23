import java.util.*;
class even
  {
    public static void main(String args[])
    {
      int n;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the number:");
      n=sc.nextInt();
      if(n%2==0)
      {
        System.out.println("Even number");
      }
      else{
        System.out.println("not a even number");
      }
    }
  }