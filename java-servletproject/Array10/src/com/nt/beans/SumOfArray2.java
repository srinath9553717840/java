package com.nt.beans;

import java.util.Arrays;

class SumOfArray2{
		
		
				static int findSum(int arr[], int n) { 
			

				Arrays.sort(arr); 
				
				int sum = arr[0]; 
				for (int i = 0; i < n-1; i++) { 
					if (arr[i] != arr[i + 1]) { 
						sum = sum + arr[i+1]; 
					} 
				} 

				return sum; 
			} 

		
			public static void main(String[] args) { 
				int arr[] = {1, 1, 3, 2, 2, 3}; 
				int n = arr.length; 
				System.out.println(findSum(arr, n)); 

			} 
		} 

		

