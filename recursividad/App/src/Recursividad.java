/*  Recursividad se refiere a la forma de ingresar un bloque de código
    que podamos usar repetidas veces, sin necesidad de copiar y pegar.

    La recursividad se usa a través de funciones o también llamados métodos

    Las funciones nos pueden retornar un valor o no retornar un valor
    Cuando en la firma del metodo esta la palabra void, significa que no retorna un valor
    Sino que retorna un valor, se debe especificar el tipo de dato que retorna
*/
public class Recursividad {
    public static void main(String[] args) {
        metodoRecursivo();

        int var1 = 40;
        int var2 = 50;
        
        sumar(var1, var2);

        sumar(10, 20);
    }

    //Método recursivo
    // Firma de un método 
    // El nombre debe ser único en el programa debe ser escrito en camel case
    // Los parámetros son opcionales
    public static void metodoRecursivo(){
        System.out.println("Hola mundo");
    }

    //Función con parametros
    public static void sumar(int parametroUno, int parametroDos){
        //código de arriba hacia abajo
        System.out.println(parametroUno + parametroDos);
        //código de abajo hacia arriba
    }
}
