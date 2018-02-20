/*
 Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:
Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1]
*/

import java.util.*;

public class Q1_TwoSum {
	
	public static void main(String[] args){
		
		int[] nums= new int[3] ;
		nums[0] = 2;
		nums[1] = 3;
		nums[2] = 4;
		int target = 5; 
		
		int[] out = sum(nums, target);
		
		System.out.println("[" + out[0] + "," + out[1] + "]");
		
	}

	public static int[] sum(int[] nums, int target) {
		
		Map<Integer, Integer> map= new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length ; i++) {
	        int complement = target - nums[i];
			if(map.containsKey(complement)){
				return new int[] { map.get(complement),i};
			}
			map.put(nums[i], i);
		}
		
		 throw new IllegalArgumentException("No two sum of numbers found that macthes target");
	}
} 


// Time complexity is O(n) as we are traversing list containing n elements