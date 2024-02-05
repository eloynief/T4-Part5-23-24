package ej9;

public class Main {

	public static void main(String[] args) {

		//
		int[][] tabla= {{1,2,3},{2,3,2},{3,2,1}};
		
		//guarda la muestra si la tabla es simetrica
		boolean esMatrizMagica=false;
		
		//
		
		
		System.out.println(esMatrizMagica);
		
		
		
	}
	
	//este metodo comprueba si la tabla introducida es simetrica o no
		private static boolean esMagica(int[][] tabla) {
			
			boolean esSimetrico=false;
			int numAumentaA=0;
			int numAumentaB=0;
			
			for(int i=0;i<tabla.length;i++) {

				for(int j=0;j<tabla[i].length;j++) {
					
					numAumentaA+=tabla[i][j];
					numAumentaB+=tabla[j][i];
					
					
					
					
				}

				if(numAumentaA==numAumentaB) {
					
					esSimetrico=true;
					
				}
				
			}
			
			return esSimetrico;
			
		}
	
	

}
