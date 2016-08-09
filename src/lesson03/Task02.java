package lesson03;

import java.util.Arrays;

public class Task02 {
	
	public static void bubbleSort(int [] arr) {
		int id = 0;
		while(id != arr.length - 1) {
			boolean hasChange = false;
		for(int i = 0 ; i < arr.length - 1 - id; i ++) {
			if(arr[i] > arr[i+1]){
				int tmp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = tmp;
				hasChange = true;
			}
			if(!hasChange) return;
		}
		id++;
		}
	}
	
	public static void main(String[] args) {
		
		int a[] = { 5, 2, 10, 22, 0, -2, 1, -11, 8, -4, 17, 54};
		
		bubbleSort(a);
		
		System.out.println(Arrays.toString(a));
		
	}
	
}
