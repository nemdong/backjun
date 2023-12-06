package com.example.B1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class B1_2775 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		
		for(int t = 0; t < T; t++) {
			int k = Integer.parseInt(br.readLine()); //층
			int n = Integer.parseInt(br.readLine()); //호
			
			int[][] apt = new int[k+1][n+1];
			
			for(int i = 1; i <= n; i++) {
				apt[0][i] = i;
			}
			
			for(int i = 1; i <= k; i++) {
				for(int j = 1; j <= n; j++) {
					apt[i][j] = apt[i - 1][j] + apt[i][j - 1];
				}
			}
			
			sb.append(apt[k][n]).append("\n");
		}
		
		System.out.println(sb);
	}
}
