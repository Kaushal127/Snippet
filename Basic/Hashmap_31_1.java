import java.util.*;
class Main {
	public static void main(String args[]) {
		// Your code goes here
		
		// HashMap<String, Integer> map = new HashMap<>();
		/*
		//add/ update
		//add -> If key is not present
		//update -> If key is already present
		map.put("Delhi", 10);
		map.put("Haryana", 8);
		map.put("U.P", 30);
		
		System.out.println(map);
		
		//map.keySet() -> collection of keys in our HashMap
		for(String x : map.keySet()){
			System.out.println(x + " -> " + map.get(x));
		}
		
		map.put("Delhi", 12);
		System.out.println(map);
		
		//get the value of a key
		System.out.println(map.get("Haryana"));
		System.out.println(map.get("Gujarat"));
		
		//check whether key is present
		System.out.println(map.containsKey("Delhi"));
		System.out.println(map.containsKey("Gujarat"));
		
		//size -> number of keys 
		System.out.println(map.size());
		
		map.put("Gujarat", 15);
		System.out.println(map);
		
		*/
		
		HashSet<Integer> set = new HashSet<>();
		/*
		set.add(5);
		set.add(15);
		set.add(0);
		
		
		System.out.println(set);
		
		System.out.println(set.contains(15));
		
		System.out.println(set.size());
		
		set.add(14);
		System.out.println(set);
		
		set.add(5);
		System.out.println(set);
		
		
		set.remove(0);
		System.out.println(set);
		
		//print using a for loop
		for(int x : set){
			System.out.print(x + " ");
		}
		
		
		
		//Quizes
		set.add(1);
		set.add(67);
		set.add(20);
		System.out.println(set.contains(20));//true
		
		set.add(1);
		set.add(2);
		set.add(1);
		System.out.println(set.size());//3
		*/
		
		HashMap<String, Integer> map = new HashMap<>();
        map.put("vishal", 10);
        map.put("sachin", 30);
        map.put("vaibhav", 20);
        System.out.println(map.size());//3
		
		System.out.println(map.get("sachin"));//30
		
		System.out.println(map.containsKey("vivek"));//false


	}
}