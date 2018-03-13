package org.Sorting;
import java.util.Scanner;

//Bubble Sort :-  End of first iteration biggest element come at end
public class BubbleSort 
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
		arr = bubbleSort(arr,n);
		
		for(int i = 0; i < n; i++)
			System.out.print(arr[i] + "  ");
	}
	
	private static int[] bubbleSort(int[] arr, int n)
	{
		int temp;
		for(int i = 0; i < n-1; i++)
		{
			for(int j = 0; j < n-1-i; j++)
			{
				if(arr[j] > arr[j+1])
				{
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		return arr;
	}
}
