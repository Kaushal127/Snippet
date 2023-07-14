import java.util.*;
class Main {
	
	static class Person{
		String name;
		int age;
		// String gender;
		
		Person(){
			
		}
		
		Person(int x){
			System.out.println("Creating a person");
			age = 2*x;
		}
		// this -> self reference of the object
		Person(String name, int age){
			System.out.println(name);
			System.out.println(this.name);
			
			this.name = name;
			this.age = age;
		}
		// Person(String a, int b){
		// 	name = a;
		// 	age = b;
		// }
		void display(){
			System.out.println(name);
			System.out.println(age);
		}
	}
	
	
	static class Home{
		String address;
		int rooms;
		boolean parking;
		boolean furnished;
		
		
		void printInfo(){
			// System.out.println("Inside class "+ this);
			System.out.println("add. -> " + address);
			System.out.println("no. of rooms -> " + this.rooms);
			System.out.println("parking -> " + parking);
			System.out.println("furnished -> " + furnished);
		}
	}
	public static void main(String args[]) {
		// Your code goes here
		
		// Person p1 = new Person(); //using default constructor
		// p1.name = "Raji";
		// p1.age = 23;
		// p1.display();
		// System.out.println("------------------");
		
		// Person p2 = new Person(33);//parameterised constructor
		// p2.display();
		
		// System.out.println("------------------");
		
		Person p3 = new Person("Priyanshi", 30);
		System.out.println("------------------");
		p3.display();
		
		/*
		Home h1 = new Home();
		h1.address = "abc";
		h1.rooms = 4;
		h1.parking = true;
		h1.furnished = true;
		
		System.out.println(h1);
		// System.out.println(h1.address);
		// System.out.println(h1.rooms);
		// System.out.println(h1.furnished);
		// System.out.println(h1.parking);
		
		h1.printInfo();
		
		Home h2 = new Home();
		
		// System.out.println(h2);
		// System.out.println(h2.address);
		// System.out.println(h2.rooms);
		// System.out.println(h2.furnished);
		// System.out.println(h2.parking);
		// h2.printInfo();
		
		// Home h3 = h1;
		// h3.address = "xyz";
		
		// System.out.println(h3.address);
		// System.out.println(h1.address);
		
		// Home h3 = new Home();
		// h3 = h1;
		// h3.address = "xyz";
		
		// System.out.println(h3.address);
		// System.out.println(h1.address);
		
		
		//To create a copy of an object at  a new place
		
		Home h3 = new Home();
		h3.address = h1.address;	
		h3.rooms = h1.rooms;
		h3.parking = h1.parking;
		h3.furnished = h1.furnished;
		
		h3.address = "xyz";
		
		// System.out.println(h3.address);
		// System.out.println(h1.address);
		
		// Break till 10:30pm
		*/
	}
}