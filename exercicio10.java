//Faça um Programa que peça a temperatura em graus Celsius, transforme e mostre em graus Fahrenheit.

import java.util.Scanner;

public class exercicio10 {
    public static void main (String[] args){

        Scanner teclado = new Scanner(System.in);

        //entrada
        System.out.println("escreva a temperatura em graus celsius ");
        double celsius = teclado.nextDouble();
        teclado.close();

        //calculo
        double fahrenheit = celsius * 1.8 + 32;


        //exibir informação
        System.out.println("a temperatura em fahrenheit é "+ fahrenheit);



    }
}
