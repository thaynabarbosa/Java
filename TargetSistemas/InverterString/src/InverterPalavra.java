
public class InverterPalavra {
    
    
        public String inverte(String palavra) {
        char[] caracteres = palavra.toCharArray();
        int esquerda = 0;
        int direita = caracteres.length - 1;
        while (esquerda < direita) {
            char temp = caracteres[esquerda];
            caracteres[esquerda] = caracteres[direita];
            caracteres[direita] = temp;
            esquerda++;
            direita--;
        }
        return new String(caracteres);
    }
    
}
