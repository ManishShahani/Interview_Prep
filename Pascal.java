package com.Examle;

import java.util.ArrayList;
import java.util.List;

public class Pascal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		List<Integer> l;
		int c;
		List<List<Integer>> al = new ArrayList<>();
		for(int i = 0; i<n ; i++) {
			l = new ArrayList<Integer>();
			c=0;
			for(int j = 0; j<=i; j++) {
				if(j==0 || j==i)
					l.add(1);
				else {
					for(int k = c; k<j; k++) {
						l.add(al.get(i-1).get(k)+ al.get(i-1).get(k+1));
						c++;
					}
				}
			}
			al.add(l);
		}
		System.out.println(al);
	}

}
