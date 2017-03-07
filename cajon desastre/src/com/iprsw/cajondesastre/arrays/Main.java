package com.iprsw.cajondesastre.arrays;

public class Main {

	public static void main(String[] args) {
		
		int[] enteros1 = null;
		
		int[] enteros2 = {10,-3,(20+30)};
		
		int a = 10;
		
		int b = 20;
		
		int[] enteros3 = {a+b,(a-b),a*b};
		
		int[] enteros4  = new int[4];
		
		String[] strings1 = new String[3];
		
		String[] strings2 = new String[a+b];//tamaño se puede establecer dinámicamente
		
		//Arrays multidimensionales
		
		int[][] multiints1 = {null,null,null};
		multiints1[0]=enteros2;
		multiints1[1]=enteros3;
		multiints1[2]=multiints1[0];
		
		int[][] multiints2[][] = new int[2][3][][];
		multiints2[1][1] = multiints1;
		multiints2[1][2] = new int[2][2];
		multiints1[0][2] = 666;
		
		System.out.println(multiints2[1][1][0][1]+multiints2[1][1][0][2]);
		
		//int[] enteros5 = new int[2]{32,33};   -----> NO COMPILA
		
		System.out.println("Tamaño de enteros2 : " + enteros2.length);
		
		//Cómo funciona .equals() en un array
		
		int[] enteros6 = {1,2,3};
		int[] enteros7 = {1,2,3};
		
		System.out.println("enteros6.equals(enteros7) : " + (enteros6.equals(enteros7)));
		
//		System.out.println("enteros6.equals(enteros6) : " + (enteros6.equals(enteros6)));
		
	}

}
