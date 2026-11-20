package com.triangle;
public class ALl {

	public static void main(String[] args) {
		
		int n=5;		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				//|| i==n-1 ||  i==j ||  j==0||i==0 || i==j || j==n-1||j==0 || i==0|| (i+j)==n-1
				if(i==n-1 ||  (i+j)==n-1 ||  j==n-1 ) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
					
			}
			System.out.println();
		}


	}

}
