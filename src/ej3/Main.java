package ej3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int[][]nums;
		
		
		int n=0,m=0;
		
		Scanner scanner=new Scanner(System.in);
		
		//comprobamos si el numero n que escribe es positivo o negativos
		do {
			
			System.out.println("Introduce un valor para la tabla del array:");
			
			n=scanner.nextInt();
			
		}while(n<0);
		

		//comprobamos si el numero m que escribe es positivo o negativos
		do {
			
			System.out.println("Introduce un valor para la tabla del array:");
			
			m=scanner.nextInt();
			
		}while(n<0);
		
		
		nums=new int [n][m];
		
		
		cambiaValores(nums, n, m);
		
		System.out.println(nums[n-1][m-1]);
		
		
		
		
		
	}

	private static void cambiaValores(int[][] nums, int n, int m) {
		nums[n-1][m-1]=10*n+m;
	}

}
