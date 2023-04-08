
public class Fibonacci {

    int a = 0;
    int b = 1;
    int fibonacci = a + b;
    boolean pertence = false;


    public void calcular(int num) {

        while (fibonacci <= num) {
            if (num == fibonacci) {
                pertence = true;
                break;
            }
            a = b;
            b = fibonacci;
            fibonacci = a + b;
        }

        if (pertence) {
            System.out.println(num + "pertence à sequência de Fibonacci.");
        } else {
            System.out.println(num + " não pertence à sequência de Fibonacci.");
        }
               
    }

}
