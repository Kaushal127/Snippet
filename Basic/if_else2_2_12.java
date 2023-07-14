import java.util.*;
class Main {
	public static void main(String args[]) {
		// Your code goes here
        Scanner scn = new Scanner(System.in);
        
        //Grading
        
        // int p = scn.nextInt();
        /*
        if(p >= 90){ //87 >= 90 {false}
            //90 - 100
            System.out.println("Grade A");
        }
        else if(p < 90 && p >= 80){
            //80 - 89
            System.out.println("Grade B");
        }
        else if(p < 80 && p >= 70) { 
            //70-79
            System.out.println("Grade C");
        }
        else if(p < 70 && p >= 60){
            //60-69
            System.out.println("Grade D");
        }
        else if(p < 60 && p >= 40){
            // 40 - 59
            System.out.println("Grade E");
        }
        else if(p < 40){
            System.out.println("Grade F");
        }
        
        
        if(p >= 90){ //false
            //90 - 100
            System.out.println("Grade A");
        }
        else if(p >= 80){ // false
            //80 - 89
            System.out.println("Grade B");
        }
        else if(p >= 70) { //false
            //70-79
            System.out.println("Grade C");
        }
        else if(p >= 60){ //true
            //60-69
            System.out.println("Grade D");
        }
        else if( p >= 40){
            // 40 - 59
            System.out.println("Grade E");
        }
        else {
            System.out.println("Grade F");
        }
        
        */
        
        /*
        if(4+5 <= 10){ //9 <=10
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
        
        System.out.println("True");
        */
        
        // int N = 5;
        // if(N>2)
        //     System.out.println("Yayay");
        // else
        //     System.out.println("Blahblah!!");
        
        
        /*    
        //you can only write a single statement inside if or else without the curly brackets 
        int N = 5;
        if(N < 2)
            System.out.println("Yayay");//is dependent on the conditions
            System.out.println("Hmmmm");
            System.out.println("Yayay");
            System.out.println("Hmmmm");
            System.out.println("Yayay");
            
        */
        
        
        //FizzBuzz
        
        int n = scn.nextInt();
        
        /*
        if( (n % 3 == 0) && (n % 5 == 0)){
            System.out.println("FizzBuzz");
        }
        else if(n % 3  == 0){
            System.out.println("Fizz");
        }
        else if(n % 5 == 0){
            System.out.println("Buzz");
        }
        */
        
        
        //FizzBuzz
        if(n % 3 == 0){
            System.out.print("Fizz");
        }
        
        if(n % 5 == 0){
            System.out.print("Buzz");
        }
        
       
        
	}
}