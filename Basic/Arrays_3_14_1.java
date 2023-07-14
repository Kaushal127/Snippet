import java.util.*;
class Main {
	
	static boolean isStrictlyInc(int[] A){
		
		for(int i = 1; i < A.length; i++){
			//curr -> A[i], prev = A[i-1]
			if(A[i] <= A[i-1]){
				//not in strictly inc order
				return false;
			}
		}
		
		return true;
	}
	
	static int countFreq(int[] A, int k){
		int count = 0;
		for(int i = 0; i < A.length; i++){
			if(A[i] == k){
				count++;
			}
		}
		
		return count;
	}
	
	static int findUniqueElement(int[] A){
		int ans = 0;
		for(int i = 0; i < A.length; i++){
			int freq = countFreq(A, A[i]);
			if(freq == 1){
				ans = A[i];
				break;
			}
		}
		return ans;
	}
	
	/*
	A = {6, 9, 1, 2, 9, 2, 6}
	ans = 0;
	i = 0  A[0] = 6 freq = 2
	i = 1  A[1] = 9 freq = 2
	i = 2  A[2] = 1 freq = 1 	ans = 1 --->break
	return  1
	*/
	
	static boolean pairSum(int[] A, int k){
		//checking all n*n pairs
		for(int i = 0; i < A.length; i++){
			for(int j = 0; j < A.length; j++){
				// System.out.println(i + ", " + j);
				if( (i!= j) && (A[i] + A[j] == k) ){
					return true;
				}
			}
		}
		return false;
	}
	
	//More faster
	static boolean pairSum_op(int[] A, int k){
		for(int i = 0; i < A.length - 1; i++){
			for(int j = i+1; j < A.length; j++){
				// System.out.println(i + ", " + j);
				if(A[i] + A[j] == k){
					return true;
				}
			}
		}
		return false;
	}
	
	public static void main(String args[]) {
		// Your code goes here
		Scanner scn = new Scanner(System.in);
		
		
		
		/*
		int[] arr = {6, 9, 1, 2, 9, 2, 6};
		int ans = findUniqueElement(arr);
		System.out.println(ans);
		*/
		
		
		/*
		int[] arr = {2, 9, 7, 15, 2, 6, 2, 5, 6};
		int ans = countFreq(arr, 2);
		System.out.println(ans);
		
		*/
		
		
		/*
		int[] arr = {3, 8, 11, 35, 42, 67, 67};//false
		boolean ans = isStrictlyInc(arr);
		System.out.println(ans);
		
		*/
		
		int[] arr = {3, 5, 1, 4};
		// boolean ans = pairSum(arr, 10);
		boolean ans = pairSum_op(arr, 8);
		System.out.println(ans);
	}
	
}