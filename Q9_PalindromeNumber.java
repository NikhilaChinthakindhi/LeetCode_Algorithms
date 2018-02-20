/*
Determine whether an integer is a palindrome. Do this without extra space.

Some hints:
Could negative integers be palindromes? (ie, -1)

If you are thinking of converting the integer to string, note the restriction of using extra space.

You could also try reversing an integer. However, if you have solved the problem "Reverse Integer", you know that the reversed integer might overflow. How would you handle such case?

There is a more generic way of solving this problem.

 */

public class Q9_PalindromeNumber {
	
	public static void main(String[] args) {
		
		// int i= 2147483647;
		int i= 0;
		boolean result = isPalindrome(i);
		if(result){
			System.out.println("Given number is palindrome");
		}
		else{
			System.out.println("Given number is not palindrome");
		}

	}
	
	public static boolean isPalindrome(int x) {
	
		// x<0 i.e. negative numbers, number having last digit 0 and number is not 0---- these are not palindromes
		if(x < 0 || x % 10 == 0 && x != 0){
			return false;
		}
		
		if(x>=0 && x<10){
			return true;
		}
		
		long reverse = 0;
		while(x > reverse){
			reverse = (reverse * 10 ) + (x % 10);
				x /= 10;
		}

		if(reverse == x ||  x == reverse/10){
			return true;
		}
		else
		{
			return false;
		}
    		
    }
}



// Time complexity is O(log n base 10) as number is div by 10 for every iteration
