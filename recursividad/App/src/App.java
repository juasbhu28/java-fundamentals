import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);
            System.out.print("Ingresar un valor : ");
            float valorUno = scan.nextInt();
            
            if (valorUno < 100){
            System.out.print("el número es < 100");
            } else if (valorUno > 100)
            System.out.print("el número es > 100");
            else {
            System.out.print("el número es = 100");
        }
    }
}

