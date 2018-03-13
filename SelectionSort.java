package org.Sorting;
import java.util.Scanner;

//Insertion Sort
public class SelectionSort 
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
		int key;
		for(int i = 1; i < n; i++)
		{
			key = arr[i];
			int j = i;
			while(j > 0 && arr[j-1] > key)
			{
				arr[j] = arr[j-1];
				j--;
			}
			arr[j] = key;
		}
		return arr;
	}
}
