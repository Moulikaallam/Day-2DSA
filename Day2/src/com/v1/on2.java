package com.v1;

import java.util.Scanner;

public class on2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array size ");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("enter elements");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("all pairs");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.println(arr[i]+" "+arr[j]);
			}
		}
		
		sc.close();
	}

}
