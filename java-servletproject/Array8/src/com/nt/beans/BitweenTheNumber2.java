package com.nt.beans;

public class BitweenTheNumber2 {
	
	
		public static int diff(int[] A)
		{
			int diff = Integer.MIN_VALUE;

			for (int i = 0; i < A.length - 1; i++) {
				for (int j = i + 1; j < A.length; j++) {
					diff = Integer.max(diff, A[j] - A[i]);
				}
			}

			return diff;
		}

		
		public static void main(String[] args)
		{
			int[] A = { 9, 2, 12, 5, 4, 7, 3, 19, 5};

			System.out.print("The maximum difference is " + diff(A));
		}
	}

