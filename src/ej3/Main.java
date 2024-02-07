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
		
		//
		cambiaValores(nums);
		
		//
		for(int[]fila:nums) {
			for(int valor:fila) {
				System.out.print(valor+"\t");
				
			}
			System.out.println();
			
		}
		
		
		
	}

	private static void cambiaValores(int[][] nums) {
		
		
		for(int n=0;n<nums.length;n++) {
			
			for(int m=0;m<nums[0].length;m++) {

				
				nums[n][m]=10*n+m;
			}
			
			
		}
		
		
	}

}
