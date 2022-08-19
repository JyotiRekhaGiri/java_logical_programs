import java.util.Scanner;
class First
{
 public static void main(String args[])
 {
  int eno;
  String ename;
  float esal;
  Scanner sc=new Scanner(System.in);
  
  System.out.println("enter employee number:");
  eno=sc.nextInt();
  System.out.println("enter employee name:");
  ename=sc.next();
  System.out.println("enter employee salary:");
  esal=sc.nextFloat();
  
  System.out.println("enter employee number is:"+eno);
  System.out.println("enter employee number:"+ename);  
  System.out.println("enter employee number:"+esal);
    
}
}