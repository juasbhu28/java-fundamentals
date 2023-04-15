// Usar librerias - bibliotecas
import java.util.Scanner;

//Programación orientada a objetos

//Estrucutras de control (codystyle)
/*
    if (validación de tipo boolean) {  //Condición
      Es lo que va a pasar si la condición se cumple
        
    } else if(condicion){


    } else if(condicion){

        
    } else {
        Haga esta segunda cosa
    }   

    switch ( operador) {
        case "sumar":
            //Codigo que necesitamos que se ejecute
        case "restar":
             //Codigo que necesitamos que se ejecute
        case "multiplicar":
             //Codigo que necesitamos que se ejecute
            break;
        default:
            //Codigo que necesitamos que se ejecute
    }
*/
//Programación estructurada


//Ejercicio
//Leer dos valores y además selecccionar si se suma o  resta ó  multiplica o divide
// Tenga en cuenta que la división por cero es imposible
//Camel case --> La primera letra de cada palabra es mayúscula
public class App {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);
        int valorUno =  ingresarValor(scan);
        System.out.print("Ingresa primer valor: ");
        int valorUno = scan.nextInt();

        System.out.print("Ingresa primer valor: ");
        int valorDos = scan.nextInt();
        
        System.out.println("Ingrese, sumar, restar, multiplicar, dividir:123 ");
        String operador = scan.next();


        //System.out.print("Ingrese, 1. sumar, 2. restar, 3. multiplicar, 4. dividir");
        //int operadorInt = scan.nextInt();


        //Aquí va su código
        double resultado;
        if (operador.equals("sumar") ){
            resultado = valorUno + valorDos;            
            System.out.println("La suma de los dos números es " + resultado);
        }

        switch (operador){
            case "sumar":
                 //Sumee mis valorUno + valorDos
                break;
            //etc
        }

        //if(operadorInt == 1){
        //    //Sumee mis valorUno + valorDos
        //}else if(operadorInt == 2){
//
        //}else if(operadorInt == 3){
//
        //}else{
//
        //}

       //switch(operadorInt){
       //    case 1:
       //         //Sumee mis valorUno + valorDos
       //        break;
       //    //etc
       //}

        //La operación es "Operador" y el resultado es = "Resultado"
           
    }

    
}

// Tres algoritmos que  hagan


// 1. Solicite dos valores y decir cual es el número mayor.
// 2. Leer un valor y decir si el número es mayor que 100, menor que 100 o igual a 100.
// 3. Solicitar al usuario 3 valores y mostrarlos organizados en forma descendente.
Pruebas - > 
    Inputs   -> Outputs ✅ ✖️
1    3, 2, 1 -> 3, 2, 1 - ✅  
2    1, 2, 3 -> 3, 2, 1 - ✅
3    1, 3, 2 -> 3, 2, 1 - ✅
4    2, 1, 3 -> 3, 2, 1 - ✅
5    2, 3, 1 -> 3, 2, 1 - ✅
6    3, 1, 2 -> 3, 2, 1 - ✅
7    3, 2, 1 -> 3, 2, 1 - ✅
8    3, 3, 3 -> 3, 3, 3 - ✅    



//POO 
