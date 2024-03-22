/*
 * 03 - Crie um algoritmo que calcule a soma dos valores da diagonal principal de uma matriz 5x5.
 * */

package matriz5por5;

import java.util.Random;

public class Exercicio03 {

	public static void main(String[] args) {
		
		int valor[][] = new int[5][5];
		int tamValor = valor.length;
		Random random = new Random();		
		
		for (int i = 0; i < tamValor; i ++) {
			for (int j = 0; j < tamValor; j ++) {
				valor[i][j] = random.nextInt(10); // Armazenar valores na matriz
				System.out.printf("%-2d | ", valor[i][j]);
			}			
			System.out.println();
			System.out.println("------------------------");
		}		
		
		int somaDiagonalSecundaria = 0;
		int somaDiagonalPrincipal = 0;
		for (int i = 0; i < tamValor; i ++) {
			for (int j = 0; j < tamValor; j ++) {
				if (valor[i] == valor[j]) {
					somaDiagonalPrincipal += valor[i][j]; // Somar diagonal principal
					somaDiagonalSecundaria += valor[i][tamValor - 1 - j]; // Somar diagonal secundária
				}
			}
		}		
		System.out.println("Soma diagonal principal:  " + somaDiagonalPrincipal);
		System.out.println("Soma diagonal secundária: " + somaDiagonalSecundaria);		

	}

}
