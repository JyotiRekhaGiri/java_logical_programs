import java.util.*;
class consonent
  {
    public static void main(String args[])
    {
      char ch;
      
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the character:");
      ch=sc.next().charAt(0);
      
      if(ch=='a'||ch=='A')
        System.out.println("vowel");
      else if(ch=='e'||ch=='E')
        System.out.println("vowel");
      else if(ch=='i'||ch=='I')
        System.out.println("vowel");
      else if(ch=='o'||ch=='O')
        System.out.println("vowel");
      else if(ch=='u'||ch=='U')
        System.out.println("vowel");
      
      else 
        System.out.println("consonent value");
    }
  }