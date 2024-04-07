package com.DUMMY2;

public class FrequencyOfElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1, 2, 3, 1, 2, 3, 1, 2, 3, 4, 5, 6, 4, 5, 6, 3, 2, 2, 3, 1 };
		findFrequency(a);

	}

	private static void findFrequency(int[] a) {
		// TODO Auto-generated method stub

		int fr[] = new int[a.length];
		int visited = -1;
		for (int i = 0; i < a.length; i++) {
			int count = 1;
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					count++;
					fr[j] = visited;
				}
			}
			if (fr[i] != visited) {
				fr[i] = count;
			}
		}
		System.out.println("---------------------------------------");
		System.out.println(" Element | Frequency");
		System.out.println("---------------------------------------");
		for (int i = 0; i < fr.length; i++) {
			if (fr[i] != visited)
				System.out.println("    " + a[i] + "    |    " + fr[i]);
		}
		System.out.println("----------------------------------------");

	}

}
