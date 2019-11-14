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
	    
	    Boolean flag = true;
	    
	    try 
	    {
	    	ArrayControl.charControl(x);	    	
	    	ArrayControl.lenghtControl(x);	    	
		} 
	    
	    catch (Exception e) 	    
	    {
	    	System.err.println( e.getMessage()) ; 	    	
		}
	    finally
	    {
	    	System.err.println("ERROR in string 1. ") ;
	    	System.exit(0);
	    }
	    
	    try 
	    {	    	
	    	ArrayControl.charControl(y);	    	
	    	ArrayControl.lenghtControl(y);
		} 
	    
	    catch (Exception e) 	    
	    {
	    	System.err.println(e.getMessage()) ;  	    
	    	
		} 
	    finally
	    {
	    	System.err.println("ERROR in string 2. ");
	    	System.exit(0);
	    }
	    
	     System.out.println("The Longest Common Child is " +  lcc.lcc( x, y, m, n) +  " characters long.") ; 
	   
	    
	  } 
}
