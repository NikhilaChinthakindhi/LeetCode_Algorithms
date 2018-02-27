/* Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3, 12, 0, 0].

Note:
You must do this in-place without making a copy of the array.
Minimize the total number of operations.

*/

public class Q283_MoveZeroes {

	public static void main(String[] args) {
		int[] a = new int[5];
		a[0]= 0;
		a[1]= 0;
		a[2]=1;
		a[3]=0;
		a[4]=12;
		
		
		int[] b = new int[1];
		b[0]= 1;
		moveZeroes(b);

	}

	
	public static void moveZeroes(int[] nums) {

		int count = 0;
		for(int i=0;i<nums.length;i++){
			if(nums[i]==0) {
				count++;
			}
			else if(count>0){
				nums[i-count] = nums[i];
				nums[i] = 0;
			}
		}

		for(int z =0; z<nums.length; z++){
			System.out.println(nums[z]);
		}
		
	}
}



// Timecomplexity is O(n)