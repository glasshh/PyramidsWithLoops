/*
  * Hannah Glass 
 * glasshh@mail.uc.edu
 * Description: Printing pyramids using loops. It kind-of works. 
 * Due Date:09/26/2019
 * IS4010-001
 * 
 * What I really want is
        1
       222
      33333
     4444444
    555555555 
*/


package main;

public class Main {

	public static void main(String[] args) {

		int lines = 5;
		
		
		for (int i = 1; i <= lines; i++) {
			
			for (int j = lines; j > i; j--) { 
				System.out.print(" ");
			}
			
			for (int k = 1; k <=i; k++)
			{
				System.out.print(i + " ");
			}
			System.out.println();		
			
		}
	}
}
