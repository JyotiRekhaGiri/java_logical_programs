import java.util.*;
class product
  {
    public static void main(String args[])
    {
      int pno;
      String pname;
      float pcost,pqty,bill=0;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the product number:");
      System.out.println("Enter the product name:");
      System.out.println("Enter the product cost:");
      System.out.println("Enter the product quantity:");
      pno=sc.nextInt();
      pname=sc.next();
      pcost=sc.nextFloat();
      pqty=sc.nextFloat();
      
      bill=pcost*pqty;
      System.out.println("Enter the product number is:"+pno);
      System.out.println("Enter the product name:"+pname);  
      System.out.println("Enter the product cost:"+pcost);  
      System.out.println("Enter the product quantity:"+pqty);
      System.out.println("The bill is:"+bill);
    }
  }