package lab6;

import java.util.*;



public class Program1 {
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		Program1 obj = new Program1();
		 HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		boolean i = true;
		int j = 0;
		while(i) {
			System.out.println("choose:");
			System.out.println("1)Enter the values:");
			System.out.println("2)exit");
			switch(obj.sc.nextInt()) {
			case 1: System.out.println("Enter the value to insert in hashmap");
			        map.put(j++,obj.sc.nextInt());
			        break;
			case 2: i = false;
			        break;
			}
		}
		           List<Integer> list = obj.getValues(map);
		           for(int value: list) {
		        	   System.out.print(value+" ");
		           }
	}
	
	public List<Integer> getValues(HashMap<Integer , Integer> map){
	    
	    
	    Collection<Integer> values = map.values();
	    List<Integer> list = new ArrayList<>(values);
	    Collections.sort(list);
	    
	    return list;
		
		
	}

}
