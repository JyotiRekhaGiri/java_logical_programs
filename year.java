import java.util.*;
class year
  {
    public static void main(String args[])
    {
      float n;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the year number:");
      n=sc.nextFloat();
      if ((n%400==0)||((n%4==0)&&(n%100!=0)))
      {
        System.out.println("leap year");
      }
      else
      {
        System.out.println("not a leap year");
      }
    }
  }