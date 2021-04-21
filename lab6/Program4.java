package lab6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import javax.print.attribute.standard.PrinterStateReasons;

public class Program4 {
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	boolean i = true;
	HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
	
	while(i) {
		System.out.println("choose");
		System.out.println("1)To insert data of student in the hashmap");
		System.out.println("2)exit");
		switch(sc.nextInt()) {
		case 1: System.out.println("Enter student id and student marks:");
		        map.put(sc.nextInt(), sc.nextInt());
		        break;
		        
		case 2: i = false;
		        break;
		        
		}
	}
	HashMap<Integer, String> hmap = new Program4().getStudents(map);
	for(Map.Entry e : hmap.entrySet()) {
		System.out.println(e.getKey()+" "+e.getValue());
	}
  }
  public HashMap<Integer, String> getStudents(HashMap<Integer, Integer> map){
	  HashMap<Integer, String> hmap = new HashMap<Integer, String>();
	     for (Map.Entry e: map.entrySet()) {
			if((Integer)e.getValue() >= 90) {
				hmap.put((Integer) e.getKey(), "Gold");
			}
			else if((Integer)e.getValue() >= 80 && (Integer)e.getValue() < 90) {
				hmap.put((Integer) e.getKey(), "Silver");
			}
			else if((Integer)e.getValue() >= 70 && (Integer)e.getValue() < 80)
				hmap.put((Integer) e.getKey(), "Bronze");
				
		}
	  return hmap;
	  
  }
}
