import java.util.*;
class celsius
  {
    public static void main(String args[])
    {
      float fah,cls=0;
      Scanner sc=new Scanner(System.in);
      System.out.println("The Fahrenheit is:");
      fah=sc.nextFloat();
      cls=((fah-32)*5)/9;
      System.out.println("The Temperature in celsius is:"+cls);
    }
  }