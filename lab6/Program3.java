package lab6;
import java.util.*;

public class Program3 {
     public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the size of array:");
	    int n = sc.nextInt();
	    System.out.println("Enter the "+n+" numbers:");
	    int[] arr = new int[n];
	    for(int i = 0; i < n; i++) {
	    	arr[i] = sc.nextInt();
	    }
	    Map<Integer, Integer> map = new Program3().getSquares(arr);
	    for(Map.Entry e: map.entrySet()) {
	    	System.out.println(e.getKey()+" sqaure is "+ e.getValue());
	    }
	}
     
     public Map<Integer, Integer> getSquares(int arr[]){
    	 Map<Integer, Integer> map = new HashMap<Integer,Integer>();
    	 for (int i : arr) {
			map.put(i, i*i);
		}
    	 return map;
     }
}
