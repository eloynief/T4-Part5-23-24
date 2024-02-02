package ej4;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		int[][]tabla=new int [10][10];
		
		
		tablaMultiplicar(tabla);
		
		System.out.println(Arrays.deepToString(tabla));
		
		
		
		
	}

	//esta funcion te devuelve una tabla 10x10 con los valores de la tabla de  multiplicar del 1 al 10
	private static void tablaMultiplicar(int[][] tabla) {
		
		
		for(int i=0;i<tabla.length;i++) {
			
			for(int j=0;j<tabla.length;j++) {
				
				tabla[i][j]=(i+1)*(j+1);
				
				
			}
			
		}
	}

}
