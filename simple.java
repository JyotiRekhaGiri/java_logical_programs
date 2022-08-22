import java.util.*;
class simple
  {
    public static void main(String args[])
    {
      int p,t,r;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the value of p,t and r:");
      p=sc.nextInt();
      t=sc.nextInt();
      r=sc.nextInt();
      int si=(p*t*r)/100;
      int ta=p+si;
      
      System.out.println("the value of simple interest and total amount are:"+si+" "+ta);
    }
  }