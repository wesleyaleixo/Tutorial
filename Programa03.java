import java.util.Scanner;

public class Programa03{

    public static void main(String args[]){
    //Declaração de variáveis
    float celsius;
    float fahrenheit;
    Scanner entrada = new Scanner(System.in);

    System.out.print("Digite os graus em Celsius: "); //Escreva
    celsius = entrada.nextFloat(); //Leia
    
    //Calculo para converter de Graus Celsius para Fahrenheit
    fahrenheit = celsius * 9/5 + 32;

    System.out.println("Graus em Fahrenheit: " +fahrenheit); //Escreva
    
    }
}