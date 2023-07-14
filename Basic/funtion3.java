import java.util.*;
class Main {
    
    
    
    //function that return factorial of new
    
    static int factorial(int n){
        int ans = 1;
        for(int i = 1; i <= n; i++){
            ans = ans*i; 
        }
        return ans;
    }
    
    //function to count prime numbers till n
    static int countPrime(int n)
    {
        // n = 15
        int count = 0;
        for(int i = 2; i <= n; i++){
            // i = 2 3 5 7 11 13
            // count = 6
            boolean check = checkPrime(i);
            if(check == true){
                //i is prime
                count++;
            }
        }
        return count;
    }    
    // 13 -> 1 - 13 [numbers from 2 to 12]
    // 35 -> 1 5 7 35 [2-34]
    //function to check whether a number is prime
    static boolean checkPrime(int n){
        for(int i = 2; i <= n-1 ; i++){
            if(n % i == 0){
                //not prime
                return false;
            }
        } 
        return true;
    }
    /*
    n = 24 -> false
    i   i<=23       24%i == 0       
    2   true        true ------>return false 
    
    
    n = 33 -> false
    i   i<= 32      33%i == 0
    2   true        false 
    3   true        true -------> return false
    
    n = 5 -> true
    i   i<=4        5% i == 0
    2    true       false
    3    true       false
    4    true       false
    5    false --------> break
    return true 
    */
    
	public static void main(String args[]) {
		// Your code goes here
        
        Scanner scn = new Scanner(System.in);
        
        /*
        factorial of n
        int n = scn.nextInt();
        System.out.println(factorial(n));
        
        */
        
        /*
        //calculate nCr = n! / ((n-r)!*r!)
        //5C2 = 10
        int n = scn.nextInt();
        int r = scn.nextInt();
        
        // factorial(n) -> n!
        // factorial(n-r) -> (n-r)!
        // factorial(r) -> r!
        
        
        int nCr = factorial(n) / (factorial(n-r) * factorial(r));
        System.out.println(nCr);
        
        */
        
        //Quizes
        
        // System.out.println(fun(10,12,9));
        // fun(10,12,9);
        
        // System.out.println(fun(10,12,9));
        
        
        /*
        Count primes 
        
        
        System.out.println(countPrime(15));//2 3 5 7 11 13
        System.out.println(countPrime(17));//2 3 5 7 11 13 17
        
        */
        
        
        // System.out.print(func(2,3));//3
        
        // fun(10, 12, 9);

	}
    /*
    static int fun(int a,int b,int c) {
        int a = 5; //Error: a is already defined
        System.out.println(a+b+c);
        return 1;
    }
    
    static int func(int a, int b){
        //a = 2, b = 3
        
        if(a > 10){ 
            return (a+b); 
        }
        else{
            return b;
        }
    }
    
    static int fun(int a,int b,int c) {
        return a; //10 -> exit the function
        //Error: unreachable statement
        // System.out.println("Hi!");
        // return b;
        // return c;
    }
    
        
    static int fun(int a,int b,int c) {
        //a = 5, b = 12, c = 9
        a = 5;
        System.out.println(a+b+c);//5+12+9 = 26
        return 1;
    }
    */
    
    
    /*
    static int fun(int a,int b,int c) {
        
        System.out.println(a+b+c);//10+12+9 = 31
        //missing return statement
    }
    */
}