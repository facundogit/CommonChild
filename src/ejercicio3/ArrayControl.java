package ejercicio3;

public  class ArrayControl 
{
	
	public static void charControl(char[] c) throws CharControlException
	{
		String controlString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		for(int i=0; i<c.length;i++) 
		{
			if (!controlString.contains("" + c[i]))
			{
				throw new CharControlException("String has an invalid character");
			}
		}	
		
	}
	
	public static void  lenghtControl(char[] c) throws StringLenghtException	
	{	
		
			
		
		if  (c.length == 0) 
		{
			throw new StringLenghtException("The String is empty");
			
		}
		
		else if  (c.length > 5000 ) 
		{
			throw new StringLenghtException("The String has more than 5000 characters");
		}	
		
	
		
	}
	
	

}
