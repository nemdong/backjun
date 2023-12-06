package com.example.B1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1_1924 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		
		String[] day = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
		int totalDay = 0;
		
		for(int i = 1; i < x; i++) {
			if(i == 4 || i == 6 || i == 9 || i == 11) {
				totalDay += 30;
			} else if(i == 2) {
				totalDay += 28;
			} else {
				totalDay += 31;
			}
		}
		
		totalDay += y;
		
		System.out.println(day[totalDay % 7]);
	}
}
