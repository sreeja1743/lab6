package lab6;

import java.util.*;

public class Program5 {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter the size of array:");
    	int n = sc.nextInt();
    	System.out.println("Enter the "+n+" integers:");
    	int[] arr = new int[n];
    	for(int i = 0; i < n; i++) {
    		arr[i] = sc.nextInt();
    	}
    	System.out.println("Second smallest element in the array:"+new Program5().getSecondSmallest(arr));
    	
}
    public int getSecondSmallest(int a[]) {
    	
    	List<Integer> list = new ArrayList<Integer>();
        
		for(int i :a) {
			list.add(i);
		}
		Collections.sort(list);
		
    	return list.get(1);
    }
}
