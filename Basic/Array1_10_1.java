import java.util.*;
class Main {
	public static void main(String args[]) {
		// Your code goes here
		Scanner scn = new Scanner(System.in);
		/*
		//Ques. print the average of n students marks
		int n = scn.nextInt();//number of students
		int marks[] = new int[n];
		
		for(int i = 0; i < n; i++){
			marks[i] = scn.nextInt();
		}
		
		int sum = 0;
		//sum = marks[0] + marks[1] + marks[2] + marks[3] + .....
		
		for(int i = 0; i < n; i++) {
			sum = sum + marks[i];
		}
		/*
			marks = {4, 3, 1, 6, 2}
			
			i 	i< 5 	sum 				i++
			0 	true 	0 + marks[0]=4		1
			1 	true 	4 + marks[1]=7 		2
			2	true 	7 + marks[2]=8 		3
			3 	true 	8 + marks[3]=14 	4
			4 	true 	14 + marks[4]=16	5
			5	false ------------>break
			sum = 16
		
		
		double avg = sum / (double)n;
		System.out.println(avg);
		
		//Highest in array
		int max = 0;
		for(int i = 0; i < n; i++){
			if(marks[i] > max){
				max = marks[i];
			}
		}
		System.out.println(max);
		
		//Print in reverse
		for(int i = n - 1; i >= 0; i--){
			System.out.print(marks[i] + " ");
		}
		*/
		
		/*
		int[]arr = new int[10];
		int n = arr.length; //n = 10
		System.out.println(n);
		
		/*
		//Ques. Taking input and printing output of array
		int[] arr = new int[5];
		
		for(int i = 0; i < 5; i++){
			arr[i] = scn.nextInt();
		}
		for(int i = 0; i < 5; i++){
			System.out.print(arr[i]+", ");
		}
		
		int[] arr = {10, 20, 30, 40, 50};
		
		for(int i = 0; i < 5; i++){
			System.out.print(arr[i]+", ");
		}
		*/
	}
}