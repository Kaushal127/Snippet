import java.util.*;
class Main {
	public static void main(String args[]) {
		// Your code goes here
		Scanner scn = new Scanner(System.in);
		
		/*
		//print all the factors of n
		int n = scn.nextInt();
		if(n == 0){
			System.out.println("Infinite factors");
		}else{
			for(int i = 1; i <= n; i++){
				if(n % i == 0){
					//i is a factor of n
					System.out.println(i);
				}
			}
		}
	 	*/
		
		/*
		//count all the factors of n [natural number] and print the count
		// n = 12 -> 6
		
		int n = scn.nextInt();
		int count = 0;
		for(int i = 1; i <= n; i++){
			if(n % i == 0){
				//i is a factor 
				count = count+1;
			}
			
		}
		System.out.println(count);
		
		
			n = 6
			count = 0
			i 	i<=6 	6%i==0 	count 	i++
			1	true 	true 	 1		2
			2 	true 	true 	 2 		3
			3 	true 	true 	 3 		4
			4 	true 	false 	 - 		5
			5 	true 	false 	 - 		6
			6  	true 	true 	 4		7
			7 	false -----------> Break
		
			Output -> 4
		*/
		
		//check whether a number is prime or composite
			/*
		int n = scn.nextInt();
		int count = 0;
		for(int i = 1; i <= n; i++){
			if(n % i == 0){
				//i is a factor 
				count = count+1;
			}
			
		
		}
		
		if(count == 2){
			System.out.println("The number is Prime.");
		}else{
			System.out.println("The number is composite.");
		}
		
	
		
		n = 4
		count = 0
		i 	i<=4 	4%i == 0 	count 	i++
		1 	true 	true 		 1		2
		2 	true 	true 		 2 		3
		3 	true 	false 		 - 		4
		4 	true 	true 		 3 		5
		5 	false ---------------> break
		
		count == 2 -> false
		Output -> The number is composite.
		
		
		
		n = 5
		count = 0
		i 	i<=5 	5%i == 0 	count 	i++
		1 	true 		true 	  1 	2
		2	true 		false 	  - 	3
		3 	true 		false 	  - 	4
		4 	true 		false 	  -  	5
		5 	true 		true 	  2 	6
		6 	false -------------> break
		
		count == 2 -> true 
		Output -> The number is Prime.
		*/
		/*	
		int n = scn.nextInt();
		int count = 0;
		for(int i = 1; i <= n; i++){
			if(n % i == 0){
				//i is a factor 
				count = count+1;
			}
			
			if(count > 2){
				break; //exit the loop
			}
			
		}
		
		if(count == 2){
			System.out.println("The number is Prime.");
		}else{
			System.out.println("The number is composite.");
		}
		
		n = 24
		count = 0
		i  i<=24  24 % i == 0 	count  	count>2		i++
		1 	true 	true 		  1 	false 		2
		2 	true 	true 		  2 	false 		3
		3 	true 	true 		  3 	true -------->break[exit the loop]
		
		count == 2 ->false
		The number is composite.
		*/
		/*
		n = 7 
		count = 0
		i 	i<=7 	7%i == 0 	count 	count>2 	i++
		1 	true 	true 		 1 		false 		2
		2	true 	false 		 - 		false 		3
		3	true 	false 		 -	 	false 		4
		4 	true 	false 	     - 		false 		5
		5 	true 	false 		 - 		false 		6
		6 	true 	false 		 - 		false 		7
		7 	true 	true 		 2 		false 		8
		8 	false --------------->break
		
		count == 2 -> true
		The number is Prime.
		*/
		
		/*
		for(int i = 1; i <= 5; i++){
			System.out.print(i + " ");
			if(i > 3){
				break;
			}
		}
		
		i 	i<=5 	Output 	i>3 	i++
		1 	true 	1 		false 	2
		2	true 	2 		false 	3
		3	true 	3 		false 	4
		4 	true 	4 		true -------->break
		*/
		
		/*
		for(int i = 1; i <= 5; i++){
			
			if(i > 3){
				break; //go outside the loop
			}
			System.out.print(i + " ");
		}
		
		
			i 	i<=5 	i>3 	Output	i++
			1 	true 	false 	1 	 	2
			2 	true 	false 	2 		3
			3 	true 	false 	3		4
			4 	true 	true --------> break
		*/
		// for(int i = 1; i<= 3; i++){
		// 		System.out.println("Hello " + i);
				
		// 		if(i == 2){
		// 			break;
		// 		}
		// }
		
		/*
		i = 1  -> Hello 1
		i = 2 -> Hello 2  ------->break
		
		*/
		
		// for(int x = 1; x <= 4; x++){
		// 	System.out.println("Hi");
		// 	if(x == 2){
		// 		break;
				
		// 	}
		// 	System.out.println("4");
			
		// }
		
		
		//continue -> skip to next iteration
		/*
		for(int i = 1; i<= 5; i++){
			
			if(i == 3){
				continue;
			}
			System.out.print("Hello ");
			System.out.println(i);
			
		}
		
		
			i 	i<=5 	i==3 	Output i++
			1 	true 	false 	1		2
			2 	true 	false 	2 		3
			3	true 	true  --------> 4
			4 	true 	false 	4 		5
			5 	true 	false 	5 		6
			6 	false --------------> break
			
		*/
		/*
		for(int i = 1; i <= 10;i++) {
			if(i == 4 || i == 6) {
				continue;
			}
        	System.out.println(i);
    	}
		
		i 	i<=10 	i == 4 || i == 6 	Output i++
		1 	t 		false 				1		2
		2	t 		false 				2	 	3
		3	t 		false 				3 		4
		4 	t 		true 	------------------> 5
		5 	t		false 				5 		6
		6	t 		true 	------------------> 7
		7 	t 		false 				7 		8
		8 	t 		false 				8 		9
		9 	t 		false 				9 		10
		10 	t 		false 				10 		11
		11 	false -----------------------> break	
		
		*/
		/*
		for(int i = 1; i <= 10; i++) {
			if(i % 2 == 1) {
				continue;
			}
			System.out.print(i + " ");
		}
		
		
		i 	i<= 10  i % 2 == 1  Output i++
		1 	true 	true --------------> 2
		2 	true 	false 		 2 		 3
		3 	true 	true --------------> 4
		4 	true 	false 		 4 		 5
		5	true 	true --------------> 6
		6 	true 	false 		 6 		 7
		7 	true 	true --------------> 8
		
		
		*/

		for(int i = 4; i<= 20; i++){
            
            if(i < 8){
                continue;
            }
            System.out.print(i + " "); 
            
            if(i > 10){
                break;
            }
        }
		
		/*
		i 	i<=20 	i<8 	Output 	i>10 	i++
		4 	true 	true ------------------> 5
		5  	true 	true ------------------> 6
		6 	true 	true ------------------> 7
		7 	true 	true ------------------> 8
		8 	true 	false 	 8 		false 	 9
		9 	true 	false 	 9 		false	 10
		10 	true 	false 	 10 	false 	 11
		11 	true 	false 	 11 	true  -----------> break
		
		
		*/
		
		23rd dec - 2nd jan
	}
}