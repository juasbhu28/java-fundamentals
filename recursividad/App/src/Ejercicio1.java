import java.util.Scanner;


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

public class Ejercicio1 {
    public static void main(String[] args) {
        int valorN = ingresarValor("valorUno");
        sumatoria(valorN);
        System.out.println("Sumatoria recursiva es: " + sumatoriaRecursiva(valorN));
    }

    public static int ingresarValor(String nombreVariable){
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingresa un valor para la variable con nombre " + nombreVariable + ": ");       
        return scan.nextInt();
    }

    public static void sumatoria(int valorN){
        int sumaTotal = 0;
        for (int i = 1; i <= valorN; i++){
            sumaTotal = sumaTotal + i;
        }
        System.out.println("La suma de los primeros " + valorN + " números es " + sumaTotal);
    }

    public static int sumatoriaRecursiva(int valorN){
        if (valorN == 1){
            return 1;
        } else {
            return valorN + sumatoriaRecursiva(valorN - 1);
        }
    }
}
