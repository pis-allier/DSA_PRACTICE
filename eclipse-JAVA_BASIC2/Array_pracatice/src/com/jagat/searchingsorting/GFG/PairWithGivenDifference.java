package com.jagat.searchingsorting.GFG;

import java.util.HashMap;

public class PairWithGivenDifference {

	public static void main(String[] args) {
		int a[] = { 1, 8, 30, 40, 100 };
		int n = -60;
		boolean is_present = is_foundDifference(a, n);
		System.out.println("result is ===>" + is_present);

	}

	public static boolean is_foundDifference(int a[], int n) {

		HashMap<Integer, Integer> map = new HashMap<>();
		int size = a.length;
		for (int i = 0; i < size; i++) {
			map.put(a[i], map.getOrDefault(a[i], 0) + 1);
			if (n == 0 && map.get(a[i]) > 1) {
             return true;
			}
			 if (n == 0)
			        return false;
		}
			    for (int j = 0; j < size; j++) {
			      if (map.containsKey(n + a[j])) {
						
						 System.out.println("Pair Found: (" + a[j] + ", " + + (n + a[j]) + ")");
						 
			        return true;
			      }
			    }
				 System.out.print("No Pair found"); 
			    return false;
			  }
		
	}

