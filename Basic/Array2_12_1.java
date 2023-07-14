import java.util.*;
class Main {
	
	
	
	
	
	
	static boolean search(int[] A, int k){
		
		for(int i = 0; i < A.length; i++){
			if(A[i] == k){
				return true;
			}
		}
		
		return false;
	}
	
	static int countFreq(int[] A, int k){
		
		int count = 0;
		for(int i = 0; i < A.length; i++){
			//A[i] - element at ith index in array
			if(A[i] == k){
				count++;
			}
		}
		
		return count;
	}
	
	static boolean adjDiff(int[] A, int k){
		for(int i = 0;  (i+1) < A.length; i++){
			if(A[i] - A[i+1] == k){
				return true;
			}
		}
		return false;
	}
	
	
	static int find_min(int[]arr) {
        // int min = 0;//this will fail when all positive value are there
        int min = arr[0];
        for(int i=0; i < arr.length;i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
        }
        
        return min;
	}
	
	
	public static void main(String args[]) {
		// Your code goes here
		Scanner scn = new Scanner(System.in);
		
		int n = scn.nextInt();//5
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++){
			arr[i] = scn.nextInt();
		}
		
		// int k = scn.nextInt();
		
		//Searching
		// boolean ans = search(arr, k);
		// System.out.println(ans);
		
		
		//Count Frequency
		// int ans = countFreq(arr, k);
		// System.out.println(ans);
		
		//Adjacent pair with diff k
		// boolean ans = adjDiff(arr, k);
		// System.out.println(ans);
		
		
		//Find minimum
		int ans = find_min(arr);
		System.out.println(ans);
	}
}