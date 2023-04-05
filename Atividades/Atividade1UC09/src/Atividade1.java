
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Atividade1 {

    public static void main(String[] args) {

        //criando a janela e adicionando os componentes
        JFrame janela = new JFrame();
        janela.setSize(300, 200);

        janela.setTitle("Tela Um");
        janela.setDefaultCloseOperation(janela.EXIT_ON_CLOSE);
        janela.setLayout(new FlowLayout());

        //rotulo
        JLabel rotulo = new JLabel();
        rotulo.setText("Informe o valor da venda");
        janela.add(rotulo);

        
        //criando campo de entrada
        JTextField campo = new JTextField(10);
        janela.add(campo);
        
        //criando o botao
        JButton botao = new JButton();
        botao.setText("Confirma");
        janela.add(botao);

        //Rotulo senão
        JLabel texto = new JLabel();
        janela.add(texto);
        
        janela.setVisible(true);
        
        //ação quando clicar no botão Confirma
        botao.addActionListener(new ActionListener() {
    
            @Override
            public void actionPerformed(ActionEvent e) {
                    //teste SE o valor é maior que 500
                if (Double.parseDouble(campo.getText()) > 500) {
                    JFrame janela2 = new JFrame();
                    janela2.setSize(300, 200);

                    janela2.setTitle("Calcular o desconto");
                    janela2.setDefaultCloseOperation(janela2.EXIT_ON_CLOSE);
                    janela2.setLayout(new FlowLayout());

                    //rotulo 
                    JLabel rotulo2 = new JLabel();
                    rotulo2.setText("Informe o percentual de desconto");
                    janela2.add(rotulo2);

                    //criando campo de entrada do valor de percentual
                    JTextField campo2 = new JTextField(10);
                    janela2.add(campo2);

                    //criando o botao Calcular da janela 2
                    JButton botao2 = new JButton();
                    botao2.setText("Calcular");
                    janela2.add(botao2);

                    janela2.setVisible(true);

                    //ação quando clicar no botão2 Calcular
                    botao2.addActionListener(new ActionListener() {

                        @Override
                        public void actionPerformed(ActionEvent e) {

                            //criando as variaveis
                            Double valorVenda;
                            Double percentual;
                            Double desconto;
                            Double valorTotal;

                            //convertendo string para double
                            valorVenda = Double.parseDouble(campo.getText());
                            percentual = Double.parseDouble(campo2.getText());

                            //calculo
                            desconto = (valorVenda * percentual) / 100;

                            valorTotal = valorVenda - desconto;

                            //Janela do resultado
                            JFrame janelaResultado = new JFrame();
                            janelaResultado.setTitle("Resultado");
                            janelaResultado.setSize(300, 200);
                            janelaResultado.setDefaultCloseOperation(janelaResultado.EXIT_ON_CLOSE);

                            //rotulo do resultado
                            JLabel resultado = new JLabel();
                            janelaResultado.add(resultado);
                           

                            resultado.setText("o valor total do produto é R$ " + valorTotal);
                            janelaResultado.setVisible(true);
                        }
                    });
                } else{
                   texto.setText("o valor menor ou igual a R$ 500,00 não tem desconto");
                }
            }
        });

    }
}
