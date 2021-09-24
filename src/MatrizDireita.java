import java.io.File;
import java.io.IOException;
import java.util.Scanner;
/*
Desafio
Leia um caractere maiúsculo, que indica uma operação que deve ser realizada e uma matriz M[12][12].
 Em seguida, calcule e mostre a soma ou a média considerando somente aqueles elementos que estão
 na área direita da matriz, conforme ilustrado abaixo (área verde).
Entrada
A primeira linha de entrada contem um único caractere Maiúsculo O ('S' ou 'M'),
indicando a operação (Soma ou Média) que deverá ser realizada com os elementos da matriz.
Seguem os 144 valores de ponto flutuante que compõem a matriz.

Saída
Imprima o resultado solicitado (a soma ou média), com 1 casa após o ponto decimal.

Exemplo de Entrada:         Exemplo de Saída
S                           111.4
1.0
330.0
-3.5
2.5
4.1
**********************************************************
//função original fornecida pela DIO
public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        double soma = 0;
        char O = leitor.next().toUpperCase().charAt(0);
        double[][] M = new double[12][12];
        for ( int i = 0; i < 12; i++ ) {
        	for (                 ) {
        		M[i][j] = leitor.nextDouble();
        	}
        }
        for (  int i = 0; i < 12; i++ ) {
        	for (  int j = 0; j < 12; j++ ) {
        		if (                  ) soma += M[i][j];
        	}
        }
        if (                     ) soma /= 30;
    	System.out.println(String.format("%.1f", soma));
    }

**********************************************************
 */

public class MatrizDireita {
    public static void main(String[] args) throws IOException {
        //Scanner leitor = new Scanner(System.in);
        File test = new File("./src/Teste.txt");
        Scanner leitor = new Scanner(test);
        double soma = 0.0;
        char O = leitor.next().toUpperCase().charAt(0);
        leitor.nextLine();
        double[][] M = new double[12][12];
        for ( int i = 0; i < 12; i++ ) { // carrega a matriz
            for ( int j = 0; j < 12; j++ ) {
                M[i][j] = 0.0;
            }
        }
        System.out.println("matriz M");
        for ( int i = 0; i < 12; i++ ) { // carrega a matriz
            for ( int j = 0; j < 12; j++ ) {
                System.out.print(Double.toString(M[i][j])+" ");
            }System.out.println("");
        }
        for ( int i = 0; i < 12; i++ ) { // carrega a matriz
            for ( int j = 0; j < 12; j++ ) {
                M[i][j] = leitor.nextDouble();
            }
        }leitor.close();

        for ( int i = 0; i < 12; i++ ) {
            if( i <= 5 ) {
                for (int j = 12-i; j < 12; j++) {
                    soma += M[i][j];
                }
            }else {
                for( int j = i + 1; j < 12 ; j++){
                    soma += M[i][j];
                }
            }

        }

        if (  O == 'M' ) soma /= 30;
        System.out.println(String.format("%.1f", soma));
    }
}
