package com.nt.beans;

public class DublicateNumber {
	
	public static void main(String[] args) {
		
		int arr[] =new int[] {1, 2, 5, 5, 6, 6, 7, 2};
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				
				if (arr [i] ==  arr [j]) {
					System.out.println(arr[j]);
				}
			}
		}
	}

}

