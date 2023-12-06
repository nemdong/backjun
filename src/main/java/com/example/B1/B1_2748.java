package com.example.B1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class B1_2748 {

	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		long[] arr = new long[n + 1];
		arr[0] = 0;
		arr[1] = 1;
		
		for(int i = 2; i <= n; i++) {
			arr[i] = arr[i - 1] + arr[i - 2]; 
		}
		
		System.out.println(arr[n]);
	}
}
