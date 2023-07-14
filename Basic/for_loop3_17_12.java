import java.util.*;
class Main {
	public static void main(String args[]) {
		// Your code goes here
        Scanner scn = new Scanner(System.in);
        /*
        //Is it perfect?
        int t = scn.nextInt();//number of test cases
        
        while(t > 0){
            //work
           int n = scn.nextInt();
           
           int sum = 0;
           for(int i = 1; i < n; i++){
               if(n%i == 0){
                   sum = sum + i;
               }
           } 
            
            if(sum == n){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
            
            
            t--;
        }
        */
        
        // int t = scn.nextInt();
        // while(t >0 ){
        //     //work for 1 test case
        //     t--;
        // }
        
        
        //Easy Power
        /*
        int A = scn.nextInt();
        int B = scn.nextInt();
        
        int ans = 1;
        
        for(int i = 1; i <= B; i++){
            ans = ans * A;
            
        }
        System.out.println(ans);
        */
        
        //LCM
        
        int a = scn.nextInt();
        int b = scn.nextInt();
        
        int max = 0;
        if(a > b){
            max = a;
        }else{
            max = b;
        }
        
        // int lcm = 0;
        // while(true){
        //     if(max% a == 0 && max % b == 0){
        //         lcm = max;
        //         break;
        //     }
        //     max++;
        // }
        // System.out.println(lcm);
        
        /*
        a = 2
        b = 7
        max = 7
        lcm = 0
        max    max%2 == 0 && max % 7 == 0   lcm   max++
        7       f && t -> false              -      8
        8       t && f -> false              -      9
        9       f && f -> false              -      10
        10      t && f -> false              -      11
        11      f && f -> false              -      12
        12      t && f -> false              -      13
        13      f && f -> false              -      14
        14      t && t -> true               14 -----------> break
        
        Output ->   14
        */
        
        
        int lcm = 0;
        int i = max;
        while(true){
            if(i% a == 0 && i % b == 0){
                lcm = i;
                break;
            }
            i = i+max;
        }
        System.out.println(lcm);
        
        /*
        a = 2
        b = 7
        max = 7
        lcm = 0
        i   i%2 == 0 && i % 7 == 0      lcm     i=i+max
        7   false                        -       7+7 = 14
        14  true                         14 --------> break
        */
        
       
	}
}