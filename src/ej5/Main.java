package ej5;

import java.util.Arrays;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		Random random=new Random();
		
		int[][] nums=new int [4][5];
		
		
		int numRand;
		//
		int total=0;
		
		///llamamos el metodo de generaNums que te crea e imprime la tabla como t pide en el ejercicio
		generaNums(random, nums);
		
		
	}

	
	public static void generaNums(Random random, int[][] nums) {
		int numRand;
		int filas = 0;
		int columnas=0;
		int total=0;
		
		//
		for(int i=0;i<nums.length;i++) {
			//recorre la otra dimension de la tabla
			for(int j=0;j<=nums.length;j++) {
				
				//genera numero de 100 a 999
				numRand=random.nextInt(100,1000);
				
				//le damos el valor de numero random a la posicioon del array
				nums[i][j]=numRand;
				
				//print of the shit 
				System.out.print(nums[i][j]+"\t");
				
				//le damos el valor de nums[i][j] en las filas 
				filas+=nums[i][j];
				
			}
			
			//imprimimos las filas
			System.out.print(filas);
			//imprimimos un espacio
			System.out.println();

			//aumentamos el valor del total en base a las filas
			total+=filas;
			
			//restablecemos el valor de las filas a 0
			filas=0;
		}
		
		//
		for(int i=0;i<=nums.length;i++) {
			//recorre la otra dimension de la tabla
			for(int j=0;j<nums.length;j++) {
				//le damos el valor a las columnas
				columnas+=nums[j][i];
				
			}
			//imprimimos las columnas
			System.out.print(columnas+"\t");
			//restablecemos el valor de las columnas a 0
			columnas=0;
		}

		//imprime el total
		System.out.println(total);
		
//		System.out.println(Arrays.deepToString(nums));
		
	}

}
