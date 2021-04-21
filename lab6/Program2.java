package lab6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Program2 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the characters:");
		char[] arr = sc.next().toCharArray();
		Map<Character, Integer> map = new Program2().countChars(arr);
		for(Map.Entry e : map.entrySet()) {
			System.out.println(e.getKey()+" "+e.getValue());
		}
		
	}
	
	public Map<Character, Integer> countChars(char[] a){
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (char c : a) {
			if(map.containsKey(c)) {
				map.put(c,map.get(c)+1);
			}
			else
				map.put(c, 1);
		}
		return map;
	}

}
