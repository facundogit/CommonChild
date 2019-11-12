package ejercicio3;

public class LongestCommonChild {
	
	  int lcc( char[] x, char[] y, int m, int n ) 
	  { 
	    int CommonMatrix[][] = new int[m+1][n+1]; 	  
	 
	    for (int i=0; i<=m; i++) 
	    { 
	      for (int j=0; j<=n; j++) 
	      { 
	        if (i == 0 || j == 0) 
	            CommonMatrix[i][j] = 0; 
	        else if (x[i-1] == y[j-1]) 
	            CommonMatrix[i][j] = CommonMatrix[i-1][j-1] + 1; 
	        else
	            CommonMatrix[i][j] = max(CommonMatrix[i-1][j], CommonMatrix[i][j-1]); 
	      } 
	    } 
	  return CommonMatrix[m][n]; 
	  } 
	  
	  int max(int a, int b) 
	  { 
	    return (a > b)? a : b; 
	  } 

}
