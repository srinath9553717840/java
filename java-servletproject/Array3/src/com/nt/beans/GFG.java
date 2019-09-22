package com.nt.beans;

 
import java .io.*; 
  
class GFG 
{ 

static int smallest_pair(int[] a, int n) 
{ 
    int min =  Integer.MAX_VALUE, secondMin =  Integer.MAX_VALUE; 
    for (int j = 0; j < n; j++)  
    { 
  
       
        if (a[j] < min) 
        { 
  
           
            secondMin = min; 
  
           
            min = a[j]; 
        } 
  
       
        else if ((a[j] < secondMin) && a[j] != min) 
  
          
            secondMin = a[j]; 
    } 
  
    
    return (secondMin + min); 
} 
  

public static void main(String[] args) 
{ 
    int[] arr = { 1, 2, 3, 7}; 
    int n = arr.length; 
  
    System.out.println(smallest_pair(arr, n)); 
} 
} 
  
