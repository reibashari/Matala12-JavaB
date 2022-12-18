
/**
 * class with 2 methods : maxmimalDrop and isSink. 
 * @Rei Bashari , 315522623 . 
 * @25/04/2021 
 */
public class Ex12
{
    /**
     * Returns the maximal drop between two numbers in the array. 
     * time comlexity O(n) and space comlexity O(1). 
     * @return The maximalDrop
     * @param a - The array.
     */
    
    public static int maxmialDrop(int []a) 
    {
        int max = a[0] ; 
        int maximalDrop = 0 ; 
        for ( int i = 0 ; i < a.length ; i++) 
        {
        if(a[i] < max ) 
        {
            max = a[i] ; 
        }
        else 
        {
            int drop = max-a[i] ; 
            maximalDrop = Math.max(maximalDrop , drop) ; 
        }
        }
        return maximalDrop; 
    }
    
    /**
     * This method that checks if there is a sink in the array
     * time comlexity O(n) and space comlexity O(1). 
     * @param mat The array we check .  
     * @return the index that is a pit in the array . 
     */
    public static int isSink(int [][] mat) 
    {
        int row=0,col=0;
        while (row<mat.length && col<mat.length)
        { 
            if(mat[row][col] !=0)
                row++; 
            else
                col++;

        }
        if(row==mat.length) 
            return -1;
        for(int k=0;k<mat.length;k++)
        {
            if(mat[row][k] != 0)
                return -1;
            if(mat[k][row] == 0 && row != k)
                return -1;
            
        }
        return row;
    }
      
}
