package ejercicio3;

import java.util.Scanner;

public class CommonChild 
{	  
	  public static void main(String[] args) 
	  { 
	    LongestCommonChild lcc = new LongestCommonChild(); 
	    
	      
	    Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the first String");
		
		String s1 = scan.nextLine();		
		
		System.out.println("Enter the second String");
		
		String s2 = scan.nextLine();
		scan.close();		
		
	  
	    char[] x=s1.toCharArray(); 
	    char[] y=s2.toCharArray(); 
	    
	    int m = x.length; 
	    int n = y.length; 
	  
	    
	   if (ArrayControl.charControl(x) && ArrayControl.charControl(y))
		{		   
		   System.out.println("The Longest Common Child is " +  lcc.lcc( x, y, m, n) +  " characters long.") ; 
	   	}	       
	   
	    
	  } 
}
