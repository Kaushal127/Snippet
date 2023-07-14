
class Main {
	public static void main(String args[]) {
		// Your code goes here
		
		// System.out.println(10+20);
		
		
		// System.out.println("Hello " + "World");
		// "Hello"
		/*
		+ -> Addition
		+ -> concatenation
		
		text1 + text2 -> text1text2
		
		*/
		
		
		// System.out.println("Hi " + 10);
		
		
		/*
		+ - > Addition
		If both operands are numbers, then Addition
		
		+ -> concatenation
		If even one of the operands is text, then
		concatenation will happen
		
			1. text + text -> text
			2. text + number -> text
			3. number + text -> text
			4. number + number -> number [Addition]
		
		*/
		
		
		// System.out.println("16" + 6);
		/*
		"16" + 6 -> "166"
		*/
		
		// System.out.println(16 + 6);
		
		// System.out.println("192" + 3 + 4);
		
		/*
			"192" + 3 -> "1923"
		
			"1923" + 4 -> "19234"
		*/
		
		// System.out.println("316" + 19 +2);
		/*
			"316" + 19 -> "31619"
			"31619" + 2 -> "316192"
		*/
		
		// System.out.println(12 + 4 + "209");
		/*
			12 + 4 -> 16
			16 + "209" -> "16209"
		*/
		
		// System.out.print("156" + 7 + 1);
		/*	
			"156" + 7 -> "1567"
			"1567" + 1 -> "15671"
		*/
		// System.out.print( 7 + 1 + "156");
		/*
			7 + 1 -> 8
			8 + "156" -> "8156"
		*/
		
		// System.out.println(13 + 2 + "101" + 3 + 4);
		
		/* 
			13 + 2 -> 15
			15 + "101" -> "15101"
			"15101" + 3 -> "151013"
			"151013" + 4 -> "1510134"
			
		*/
		
		// System.out.println(9 + 3 + "156" + 7 + 1);
		
		/*
			9+3 -> 12
            12 + "156" -> "12156"
            "12156" + 7 -> "121567"
            "121567" + 1 -> "1215671"
		*/
		 
 		// System.out.println(10+10); //20
		// System.out.println("10" + "10");//1010
		// System.out.println("10+10");//10+10

		// System.out.println(5 + 2 * 3);
		
		/*
			2 * 3 = 6
			5 + 6 = 11
		*/

		// BODMAS
		// Brackets, Order{power , root}, Division, Multiplication, Addition, Subtraction
		
		// System.out.println(2 + 5 * 1);
		/*
		
		 	5*1 = 5
			2 + 5 = 7
		*/
		
		// System.out.println((5 + 2) * 3);
		/*
		   (5+2) = 7 -> 7*3 -> 21
		*/
		
		// System.out.print("156" + (7 + 1));
		/*
			"156" + (7 + 1) -> "156" + 8 -> "1568"
		*/
		
		// System.out.println("12" + 6 * 3);
		
		/*
		
			"12" + 18 -> "1218"
		*/
		
		// System.out.println(9 + 3 + "HI" + 7+1);
		/*
			9+3 = 12
			12 + "HI" = "12HI"
			"12HI" + 7 = "12HI7"
			"12HI7" + 1 = "12HI71"
			*/
		// System.out.println(9 + 3 + "HI" + (7+1));	
			
		// System.out.println(2+3+"6"+7*5 );
		/*
			2+3 -> 5
			5 + "6" -> "56"
			"56" + 7 * 5
			"56" + 35 -> "5635"
		
		*/
		
		
		// System.out.println("hi"  +10);
		
		//Print the sum of two Variables
		
		int x = -35;
		int y = 20;
		
		System.out.println(x+y);//-35 + 20
		
		System.out.println("The sum of x and y is " + (x+y));
		
		
		/*
		// int sum = x+y; //sum = 35
		System.out.println("The value of x is: " + x);
		System.out.println("The value of y is: " + y);
		// System.out.println(x + y);//15+20 = 35
		
		// System.out.println("Sum of x and y is " + x + y);
		
		"Sum of x and y is " + 15 -> "Sum of x and y is 15"
		"Sum of x and y is 15" + 20 -> "Sum of x and y is 1520"
		
		System.out.println("Sum of x and y is " + (x + y));
	
		"Sum of x and y is " + (15+20) ->
		"Sum of x and y is " + 35 -> "Sum of x and y is 35"
		
		
		System.out.println("Product of x and y is " + (x * y));
		
		*/
		
		//To print double quotes
		System.out.println("\"Hello\"");
	}
	
}