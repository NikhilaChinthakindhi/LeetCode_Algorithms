/*
 Given a 32-bit signed integer, reverse digits of an integer.

Example 1:
Input: 123
Output:  321

Example 2:
Input: -123
Output: -321

Example 3:
Input: 120
Output: 21

Note:
Assume we are dealing with an environment which could only hold integers within the 32-bit signed integer range. 
For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.

 */

public class Q7_ReverseDigitsOfInteger {
	
	public static void main(String[] args) {
		
		 // int i= 2147483647;
		int i= 8;
		int result = reverse(i);
		System.out.println("reverse of " + i + " is " + result);

	}
	
	public static int reverse(int x) {
		
		if(x < Integer.MIN_VALUE || x > Integer.MAX_VALUE)
		{
			return 0;
		}
		
		else
		{
			long reverse = 0;
			while(x != 0){
				reverse = (reverse * 10 ) + (x % 10);
				
				if(reverse < Integer.MIN_VALUE || reverse  > Integer.MAX_VALUE ){
					reverse = 0;
					break;
				}
				
				else
				{
					
					x= x / 10;
				}	

			}
			return (int)reverse;

		}
    		
    }
}
