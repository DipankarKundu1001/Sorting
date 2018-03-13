package org.Sorting;

import java.util.Scanner;

//Insertion Sort :-  select the smallest element and swap with ith position that is smallest at first 
public class InsertionSort 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Length of array :- ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++)
		{
			System.out.print("Enter the " + (i+1) + " element :-  ");
			arr[i] = sc.nextInt();
		}
		sc.close();
		arr = insertionSort(arr,n);
		
		for(int i = 0; i < n; i++)
			System.out.print(arr[i] + "  ");
	}
	
	private static int[] insertionSort(int[] arr, int n)
	{
		int minIndex;
		for(int i = 0; i < n; i++)
		{
			minIndex = i;
			for(int j = i; j < n; j++)
			{
				if(arr[j] < arr[minIndex])
					minIndex = j;
			}
			
			if(minIndex != i)
			{
				int temp = arr[i];
				arr[i] = arr[minIndex];
				arr[minIndex] = temp;
			}
		}
		return arr;
	}
}
