package com.heraizen.cj.date11;

public class pattern4 {
	
	public static void main(String args[]) 
    { 
        int i, j,num, n=5; 
    
        for(i=n; i>0; i--) // outer loop for rows
        { 
            num=1; 
            for(j=0; j<i; j++) // inner loop for rows
            { 
                // printing num with a space  
                System.out.print(num+ " "); 
    
                //incrementing value of num 
                num++; 
            } 
    
            // ending line after each row 
            System.out.println(); 
        } 
    } 

}
