import java.util.*;
class positive
  {
    public static void main(String args[])
    {
      int n;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the number:");
      n=sc.nextInt();
      if(n>0)
      {
        System.out.println("positive number");
      }
      else{
        System.out.println("negative number");
      }
    }
  }