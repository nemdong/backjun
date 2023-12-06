package com.example.B1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B1_1546 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		double[] scores = new double[N];
		
		for(int i = 0; i < N; i++) {
			scores[i] = Integer.parseInt(st.nextToken());
		}
		
		double sum = 0;
		Arrays.sort(scores);
		
		for(int i = 0; i < scores.length; i++) {
			sum += (scores[i]/scores[scores.length - 1]) * 100;
		}
		
		double avg = sum / N ;
		
		System.out.println(avg);
		
	}
}
