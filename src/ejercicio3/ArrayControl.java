package ejercicio3;

public  class ArrayControl 
{
	
	public static Boolean charControl(char[] c)
	{
		String controlString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		boolean flag = true;
		
		for(int i=0; i<c.length;i++) 
		{
			if (!controlString.contains("" + c[i]))
			{
				flag = false;
				
				System.out.println("The String contains a wrong character");
				
				return flag;
			}
		}
		
		return flag;
	}
	
	public static Boolean lenghtControl(char[] c)	
	{
		
		
		boolean flag = false;		
		
		if (c.length >0 && c.length <= 5000 )
		{
			flag = true;			
			
		} 
		
		else if  (c.length == 0) 
		{
			System.out.println("The String is empty");
			
		}
		
		else if  (c.length > 5000 ) 
		{
			System.out.println("The String is too long (Max:5000 characters)");
		}	
		
	
		return flag;
	}
	

}
