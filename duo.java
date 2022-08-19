import java.util.Scanner;
class duo
{
 public static void main(String args[])
 {
  int r;
  float pi=3.14F,area;
  Scanner sc=new Scanner(System.in);
  System.out.println("enter the radius:");
  r=sc.nextInt();
  area=pi*r*r;
  System.out.println(" area of circle:"+area);
  
}
}