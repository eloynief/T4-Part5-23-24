package ej8;

public class Main {

	public static void main(String[] args) {
		
		//
		int[][] tabla= {{1,2,3},{2,3,2},{3,2,1}};
		
		//guarda la muestra si la tabla es simetrica
		boolean esSimetrico;
		
		//
		esSimetrico= compruebaSimetria(tabla);
		
		System.out.println(esSimetrico);
		
	}
	
	//este metodo comprueba si la tabla introducida es simetrica o no
	private static boolean compruebaSimetria(int[][] tabla) {
		
		boolean esSimetrico=false;
		
		for(int i=0;i<tabla.length;i++) {

			for(int j=0;j<tabla[i].length;j++) {
				
				if(tabla[i][j]==tabla[j][i]) {
					
					esSimetrico=true;
					
				}
				//si algun numero no coincide
				else {
					
					//le damos el valor de false al booleano
					esSimetrico=false;
					//se acaba el for, ya que se ha demostrado que no es simetrica
					break;
				}
				
			}
		}
		
		return esSimetrico;
		
	}
	
	

}
