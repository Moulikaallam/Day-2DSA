package com.v1;
import java.util.Scanner;
public class o1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.print("enter size of array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.printf("enter elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("array elements :");
        for(int i=0;i<n;i++) {
        	System.out.println(arr[i]+100);
        }
       sc.close();

	}

}
