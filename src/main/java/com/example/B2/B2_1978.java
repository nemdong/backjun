package com.example.B2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class B2_1978 {

	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int prime = 0;
		
		for(int i = 0; i < arr.length; i++) {
			int num = arr[i];
			int cnt = 0;
			
			for(int j = 1; j <= num; j++) {
				if(num % j == 0) {
					cnt++;
				}
			}
			
			if(cnt == 2) {
				prime++;
			}
		}
		
		System.out.println(prime);
	}
}
