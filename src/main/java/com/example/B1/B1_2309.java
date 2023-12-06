package com.example.B1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B1_2309 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr = new int[9];
		int sum = 0;
		
		for(int i = 0; i < 9; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			sum += arr[i];
		}
		
		Arrays.sort(arr);
		
		int spy1 = 0;
		int spy2 = 0;
		
		for(int i = 0; i < arr.length - 1; i++) {
			for(int j = i + 1; j < arr.length; j++) {
				if(sum - arr[i] - arr[j] == 100) {
					spy1 = i;
					spy2 = j;
					break;
				}
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			if(i == spy1 || i == spy2) {
				continue;
			}
			System.out.println(arr[i]);
		}
	}
}
