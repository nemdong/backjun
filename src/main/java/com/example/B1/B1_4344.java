package com.example.B1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1_4344 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int C = Integer.parseInt(br.readLine());
		
		int[] arr;
		for(int i = 0; i < C; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			
			int n = Integer.parseInt(st.nextToken());
			arr = new int[n];
			
			int sum = 0;
			for(int j = 0; j < n; j++) {
				arr[j] = Integer.parseInt(st.nextToken());
				sum += arr[j];
			}
			double avg = sum / n;
			
			
			double above = 0;
			for(int k = 0; k < n; k++) {
				if(arr[k] > avg) {
					above += 1;
				}
			}
			double pass = (above / n) * 100;
			
			sb.append(String.format("%.3f", pass)).append("%").append("\n");
		}
		
		System.out.println(sb);
	}
}
