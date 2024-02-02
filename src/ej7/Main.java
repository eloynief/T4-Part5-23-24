package ej7;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		int[][] tabla=new int [4][4];
		int[][] tablaTraspuesta;
		
		
		for (int i=0;i<tabla.length;i++) {

			//recorrer la otra dimension del array
			for (int j=0;j<tabla[i].length;j++) {
				tabla[i][j]=j+1;
				
			}
			
		}

		System.out.println(Arrays.deepToString(tabla));
		
		//
		tablaTraspuesta=tranposicionTabla(tabla);

		System.out.println(Arrays.deepToString(tablaTraspuesta));
		
		
	}
	
	//
	public static int[][] tranposicionTabla(int[][]tabla){
		//
		int[][] tablaTranspuesta=new int[4][4];
		
		//
		for (int i=0;i<tabla.length;i++) {

			//recorrer la otra dimension del array
			for (int j=0;j<tabla[i].length;j++) {
				
				//se invierte la tabla
				tablaTranspuesta[i][j]=tabla[j][i];
				
			}
			
		}
		
		return tablaTranspuesta;
		
	}

}
