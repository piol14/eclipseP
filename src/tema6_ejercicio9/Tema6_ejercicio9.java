package tema6_ejercicio9;

import java.util.Random;
import java.util.Scanner;

public class Tema6_ejercicio9 {
	static final int FILAS=4;
	 static final int COLUMNAS= 3;
	 static void ImprimirMatriz(int mat[][]) {
		
		 for (int i=0;i<FILAS;i++) {
			 for (int j=0;j<COLUMNAS;j++) {
			 System.out.println("Fila "+i+" Columna "+j+" : "+mat[i][j]);
			 
			 }
			 System.out.println();
	 }
	 }
	public static void main(String[] args) {
		
		int multiplicacion;
		int matriz[][]= new int[FILAS][COLUMNAS];
		int matriz2[ ][]= new int[FILAS][COLUMNAS];
		int suma[][]= new int [FILAS][COLUMNAS];
		Random r= new Random();
		Scanner s=new Scanner(System.in);
		 for (int i=0;i<matriz.length;i++)
		 {
			 for (int j=1;j<matriz[i].length;j++) {
				 matriz[i][j]=r.nextInt(10);
				 matriz2[i][j]=s.nextInt();
				suma[i][j]=matriz[i][j]+matriz2[i][j];
			
				
			 }
			 
		 }
		ImprimirMatriz(suma);
		 //Mejor: for (int j=0;j<mat[i].length;j++)
		
	}
}
