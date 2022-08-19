import java.util.*;
class swap
  {
    public static void main(String args[])
    {
      int a,b,t;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the values of a and b :");
      a=sc.nextInt();
      b=sc.nextInt();
      System.out.println("Before swapping the values are:"+a+" "+b);
      
      t=a;
      a=b;
      b=t;
      System.out.println("After swapping the values are:"+a+" "+b);
      System.out.println();
    }
  }