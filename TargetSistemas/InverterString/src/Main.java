
import java.util.Scanner;


public class Main {


    public static void main(String[] args) {
        
                
        InverterPalavra inv = new InverterPalavra();
        
        String palavra = "";
        String invertida = "";
        System.out.println("Informe a palavra a ser invertida");
        Scanner entrada = new Scanner (System.in);
        palavra = entrada.nextLine();
        invertida = inv.inverte(palavra);
        System.out.println(invertida);
        
    }
    
}
