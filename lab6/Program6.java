package lab6;

import java.util.*;

public class Program6 {
	
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
	boolean i = true;
	while(i) {
		System.out.println("choose:");
		System.out.println("1)Enter the values:");
		System.out.println("2)exit");
		switch(sc.nextInt()) {
		case 1: System.out.println("Enter the Id and age:");
		        map.put(sc.nextInt(),sc.nextInt());
		        break;
		case 2: i = false;
		        break;
		}
	}
	 List<Integer> list = new Program6().votersList(map);
	System.out.println("List of student Ids who are eligible to vote");
	for(int j = 0; j < list.size(); j++)
		System.out.print(list.get(j)+" ");
	
 }
  public List<Integer> votersList(HashMap<Integer, Integer> map){
	  List<Integer> list = new ArrayList<Integer>();
	  for(Map.Entry e : map.entrySet()) {
		  if((Integer)e.getValue() > 18)
			  list.add((Integer) e.getKey());
	  }
	  return list;
  }
}
