package lesson04;

import java.util.Arrays;
import java.util.Collections;

public class Task01 {
	
	public static int sum(int a) {
		if(a == 0)
			return a;
		return sum(a / 10) + (a % 10);
		
	}
	
	public static void swap (int [] a ,int idxOne,int idxTwo) {
		int tmp = a[idxOne];
		a[idxOne] = a[idxTwo];
		a[idxTwo] = tmp;
	}
	
	public static void shellSort(int[] array) {
		  int step = array.length / 2;
		  while (step > 0) {
		   for (int i = 0; i < (array.length - step); i++) {
		    int j = i;
		    while (j >= 0 && (array[j] > array[j + step])) {
		     int temp = array[j];
		     array[j] = array[j + step];
		     array[j + step] = temp;
		     j--;
		    }

		   }
		  }
		 }
	
	public static void shakerSort(int [] arr) {
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length - 1; j++) {
				if(arr[j] > arr[j + 1]) {
					swap(arr, j, j + 1);
				}
			}
			for(int k = arr.length - 2; k > 0; k--) {
				if(arr[k] < arr[k - 1]) {
					swap(arr, k, k - 1);
				}
			}
		}
	}
	
	public static void bubbleSort(int [] arr) {
		int id = 0;
		while(id != arr.length - 1) {
			boolean hasChange = false;
		for(int i = 0 ; i < arr.length - 1 - id; i ++) {
			if(arr[i] > arr[i+1]){
				swap(arr, i, i+1);
				hasChange = true;
			}
			if(!hasChange) return;
		}
		id++;
		}
	}
	
	
	public static void selectionSort(int [] a) { 

		for(int j = 0; j < a.length - 1; j++) 	{
			int minIdx = j;
		for(int i = j + 1; i < a.length; i++) {
			if(a[i] < a[minIdx]) 	{
				minIdx = i;
				}
			}
		swap(a, j, minIdx);
		}
		
	}
	
	public static void main(String[] args) {
		int arr[] = { 9, 6, 3, 1, -2, -4, 12 };
		int arr2[] = { 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };
		
		bubbleSort(arr);
		//selectionSort(arr);
	//	shakerSort(arr2);
		//System.out.println(Arrays.toString(arr2) + "  ");
		System.out.println(Arrays.toString(arr));
	}
}
