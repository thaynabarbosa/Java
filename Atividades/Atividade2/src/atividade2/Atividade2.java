package atividade2;

import java.util.Scanner;

public class Atividade2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // Objeto Transporte
        Transporte transportes[] = new Transporte[3];
        transportes[0] = new Transporte("Rodoviário", 30f);
        transportes[1] = new Transporte("Aéreo", 90f);
        transportes[2] = new Transporte("Marítimo", 70f);

        //objeto Hospedagem
        Hospedagem hospedagens[] = new Hospedagem[2];
        hospedagens[0] = new Hospedagem("Hotel", 110f);
        hospedagens[1] = new Hospedagem("Pousada", 70f);

        //objeto Pacote de viagem
        PacoteDeViagem viagem1 = new PacoteDeViagem(transportes[0], hospedagens[0], "Foz do Iguaçu", 7);

        viagem1.descrever();
        System.out.println("Informe a margem de lucro: ");
        float margem = entrada.nextFloat();
        entrada.nextLine();
        System.out.println("Informe o valor (taxas adicionais): ");
        float valor = entrada.nextFloat();
        System.out.println("o valor total do pacote é " + viagem1.calcularTotalPacote(margem, valor));

        entrada.nextLine();
        
        System.out.println("----- Cadastrar uma venda -----");
        System.out.println("Informe o nome do cliente: ");
        String nome = entrada.nextLine();
        
        System.out.println("Informe a forma de pagamento: ");
        String formaPagamento = entrada.nextLine();
        
        Venda venda1 = new Venda(nome, formaPagamento, viagem1);
        
        System.out.println("Informe a cotação do dolar do dia: ");
        
        float cotacao = entrada.nextFloat();
        
       venda1.totalPacoteViagem(cotacao, margem, valor);
       
    }

}
