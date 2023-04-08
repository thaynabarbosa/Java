
import java.util.Scanner;

public class Main {

   
    public static void main(String[] args) {

        Fibonacci fib = new Fibonacci();
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número");
        System.out.println("Para identificar se pertence a sequência de Fibonacci");
        int num = entrada.nextInt();
        
        fib.calcular(num);
        
    }
    
}
