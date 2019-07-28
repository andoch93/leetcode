package easy;

import java.util.ArrayList;
import java.util.List;

/*
	Sort Array By Parity
	
	Given an array A of non-negative integers, return an array consisting of all the even elements of A, followed by all the odd elements of A.
	
	You may return any answer array that satisfies this condition.
	
	 
	Example 1:
	
	Input: [3,1,2,4]
	Output: [2,4,3,1]
	The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.
	 
	
	Note:
	
	1 <= A.length <= 5000
	0 <= A[i] <= 5000
 */

public class SortArrayByParity {

	/*
	 * We're going to have 2 methods
	 * One to extract all the even values
	 * Another for the odd ones
	 * We are going to make arrays from each
	 * Then combine them into the new array
	 */
	
//	public int[] getEvens(int[] A) {
//		
//		int[] returnArr = new int[A.length];
//		
//		return returnArr;
//	}
//	
	
    public static int[] sortArrayByParity(int[] A) {
    	
    	int[] sortedParArr = new int[A.length];
    	int sortedIndex = 0;
    	    	
    	// adds all even values to output array
    	for(int i = 0; i < A.length; i++) {
    		
    		if(A[i] % 2 == 0) {
    			
    			sortedParArr[sortedIndex] = A[i];
    			sortedIndex++;
    			
    		}
    		
    	}
    	
    	// adds all odd values to output array
    	for(int i = 0; i < A.length; i++) {
    		
    		if(A[i] % 2 != 0) {
    			
    			sortedParArr[sortedIndex] = A[i];
    			sortedIndex++;
    			
    		}
    		
    	}    	
    	
    	return sortedParArr;
    }
    
	public static void main(String[] args) {
		
		int[] arr = {3,1,2,4};
		
		for(int x : arr) {
			
			System.out.print(x);
		}
		
		System.out.println();
		
		int[] outArr = sortArrayByParity(arr);
		
		for(int x : outArr) {
			
			System.out.print(x);
		}		

	}

}
