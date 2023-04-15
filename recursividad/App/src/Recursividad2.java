import java.util.Scanner;

public class Recursividad2 {
    public static void main(String[] args) { 
 
        int valorUno = ingresarValor("valorUno");
        int valorDos = ingresarValor("valorDos");
        int valorTres = ingresarValor("valorTres");

        System.out.println("valorUno: " + valorUno);
        System.out.println("valorDos: " + valorDos);
        System.out.println("valorTres: " + valorTres);
    }

    public static int ingresarValor(String nombreVariable){
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingresa un valor para la variable con nombre " + nombreVariable + ": ");       
        return scan.nextInt();
    }
}

/* Ejercicio, usando la recursividad, hacer un programa que calcule 
 *la suma de lo primeros n números enteros. 
 * Es decir que n = 5 entonces la suma es 1 + 2 + 3 + 4 + 5 = 15
 * 
 * int i = 1;
 * int sumaTotal = 0;
 * for (i ; i <= valueN; i++){
 *      sumaTotal = sumaTotal + i;
 * }
 * System.out.println("La suma de los primeros " + valueN + " números es " + sumaTotal);
 */
