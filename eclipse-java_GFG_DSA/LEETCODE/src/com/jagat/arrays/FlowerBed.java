package com.jagat.arrays;

/*
 * You have a long flowerbed in which some of the plots are planted, and some are not. 
 * However, flowers cannot be planted in adjacent plots.
Given an integer array flowerbed containing 0's and 1's, where 0 means empty and 1 means not empty, and an integer n, 
return true if n new flowers can be planted in the flowerbed without violating the no-adjacent-flowers rule and false otherwise.
 */
public class FlowerBed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] flowerBed = { 1, 0, 0, 0, 0, 0, 1 };
		int n = 2;
		boolean isPlanted = canFlowerPlanted(flowerBed, n);
		System.out.print(isPlanted);
	}

	private static boolean canFlowerPlanted(int[] flowerBed, int n) {
		// TODO Auto-generated method stub

		if (n == 0)
			return true;

		for (int i = 0; i < flowerBed.length; i = i + 2) {
			if (i + 1 < flowerBed.length && flowerBed[i + 1] == 1)
				i++;
			else if (flowerBed[i] == 0) {
				n--;
				if (n <= 0)
					return true;
			}
		}
		return false;
	}

}
