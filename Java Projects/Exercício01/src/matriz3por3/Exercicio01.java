/*
 * 01 - Faça um programa que permita ao usuário entrar com uma matriz de tamanho 3 × 3 de números inteiros. 
 * Em seguida, calcule um vetor contendo três posições, em que cada posição deverá armazenar a soma dos 
 * números de cada coluna da matriz. Exiba na tela esse array
 * */

package matriz3por3;

import java.util.Random;

public class Exercicio01 {

	public static void main(String[] args) {
		
		int matrix[][] = new int[3][3];
		int tamMatrix = matrix.length;
		int vetor[] = new int[3];
		int contPos = 1;
		Random run = new Random();
		
		for (int linhas = 0; linhas < matrix.length; linhas ++) {
			for (int colunas = 0; colunas < matrix.length; colunas ++) {
				matrix[linhas][colunas] = run.nextInt(10) + 1;
				System.out.println("Valor Nº" + (contPos++) + ": " + matrix[linhas][colunas]);
			}
			System.out.println("--------------------");
		}
				
        for (int linha = 0; linha < tamMatrix; linha ++) {
            for (int coluna = 0; coluna < vetor.length; coluna ++) {
                vetor[linha] += matrix[linha][coluna];
            }
            System.out.println("Soma de Valores da Linha Nº" + (contPos++) +": "+ vetor[linha]);
        }
        System.out.println("--------------------");

	}

}
