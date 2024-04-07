package com.jagat.searchingsorting.GFG;

//three pointer apporach to find common element between three arrays
public class CommonElementBetweenThreeArrays {

	public static void main(String[] args) {

		int a[] = { 1, 5, 5 };
		int b[] = { 3, 4, 5, 5, 10 };
		int c[] = { 5, 5, 10, 20 };

		countElem(a, b, c);

	}

	public static void countElem(int a[], int b[], int c[]) {
		int i = 0;
		int j = 0;
		int k = 0;

		while (i < a.length && j < b.length && k < c.length) {
			if (a[i] == b[j] && b[j] == c[k]) {
				System.out.print("{" + a[i] + "}");
				i++;
				j++;
				k++;

			} else if (a[i] < b[j]) {
				i++;
			} else if (b[j] < c[k]) {
				j++;

			} else {
				k++;
			}
		}

	}
}
