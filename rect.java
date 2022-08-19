import java.util.Scanner;
class rect
  {
    public static void main(String []args)
    {
      float l,b,area,crf;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the value of l and b:");
      l=sc.nextFloat();
      b=sc.nextFloat();
      area=l*b;
      crf=2*(l+b);
      System.out.println("  area of rectangle is:"+area);
      System.out.println("the circumfarence of rectangle is:"+crf);
    }
  }