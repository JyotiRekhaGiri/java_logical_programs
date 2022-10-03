import java.util.*;
import java.util.Scanner;
public class pattern{
  public static void main(String args[])
    
  {
    int n=7,m=7;
    //upper half
    for(int i=1;i<=n;i++){
    //1st part
    for(int j=1;j<=m;j++){
      if(i==1||j==1||i==n||j==7){
       System.out.print("*");     
      } else{
        System.out.print(" ");
      }
    }
      System.out.println();
    }
    
  }
} 
  

      
          
      
    
    
        
     
    
  
