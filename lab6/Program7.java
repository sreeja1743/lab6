package lab6;

import java.util.*;

public class Program7 {
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the size of array:");
	int n = sc.nextInt();
	System.out.println("Enter the "+n+" integers:");
	int[] arr = new int[n];
	for(int i = 0; i < n; i++) {
		arr[i] = sc.nextInt();
	}
	int a[] = new Program7().getSorted(arr);
	System.out.println("Sorted array");
	for(int i : a) {
		System.out.println(i+" ");
	}
	
  }
  
  public int [] getSorted(int a[]) {
	  List<Integer> list = new ArrayList<Integer>();
	  
	  for(int i = 0; i < a.length; i++) {
		  StringBuilder input1 = new StringBuilder();
		  input1.append(a[i]);
		  input1.reverse();
		  String s = input1.toString();
		   list.add(Integer.parseInt(s));
	  }
	  Collections.sort(list);
	  for(int i = 0; i < list.size(); i++)
		  a[i] = list.get(i);
	  return a;
  }
}
