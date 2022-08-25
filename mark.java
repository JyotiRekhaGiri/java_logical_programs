import java.util.*;
class mark
  {
    public static void main(String args[])
    {
      int sno,sub1,sub2,sub3,ttl=0,avg=0,sub;
      String sname;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the student number:");
      System.out.println("Enter the student name:");
      System.out.println("Enter the student sub1:");  
      System.out.println("Enter the student sub2:");  
      System.out.println("Enter the student sub3:");
      sno=sc.nextInt();
      sname=sc.next();
      sub1=sc.nextInt();
      sub2=sc.nextInt();
      sub3=sc.nextInt();
      ttl=sub1+sub2+sub3;
      avg=ttl/3;
      System.out.println("The total marks are:"+ttl);
      System.out.println("The average marks is:"+avg);
      if(sub1>=40&&sub2>=40&&sub3>=40){
        System.out.println("Result is Pass:");
        
          if(avg<50)
            System.out.println("Grade 'C':");
        else if(avg>=50&&avg<=70)
           System.out.println("Grade 'B'");
        else if(avg>=71&&avg<=80)
           System.out.println("Grade 'A'");
        else 
           System.out.println("Student pass in Distinction");
        
      } 
      
      else
      System.out.println("result is Fail:");
    }
    
   }
  