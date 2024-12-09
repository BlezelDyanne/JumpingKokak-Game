//Name: BLEZEL DYANNE R. OCAMPO
//Date: September 032, 2024
//ITC04 Block 3

import java.util.*;
public class Main_while
{
     public static void main(String []args)
     {
      	// Instance of a Scanner class, sc
Scanner sc=new Scanner(System.in);
	// Declaration of variables I, num and Fact
       		int i;
		int num;
		int Fact;
// Initialization of variables
		i = 1;
		num=0;
		Fact = 1; 
	// Input
                     	System.out.println("Enter an Integer value [1..10]: ");
           num=sc.nextInt();
       	// Traversing the While Loop statement
        		while(i<=num) //every time the condition is TRUE, the loop body is executed.
        		{
            		Fact=Fact*i;
            		i++;
        		}     	
// Output
	//The output below is executed once the condition (i<=num) becomes FALSE.
System.out.println("The Factorial of" +num+ "is:" +Fact);
     }   //end of Main_while class
} // end of the public static void main(String []args)
