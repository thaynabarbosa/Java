package atividade3;

import java.util.Scanner;

public class Atividade3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Funcionario[] cadastrar = new Funcionario[10];

       
        System.out.println("----CADASTRAR FUNCIONARIOS----");

        for (int i = 0; i < cadastrar.length; i++) {
            System.out.println("Informe o tipo 1 - Assalariado, 2 - Horista");
            int tipo = entrada.nextInt();
            entrada.nextLine();
            if (tipo == 1) {
                System.out.println("Nome: ");
                String nome = entrada.nextLine();
                System.out.println("cpf: ");
                String cpf = entrada.nextLine();
                System.out.println("Endereco: ");
                String endereco = entrada.nextLine();
                System.out.println("Telefone: ");
                String telefone = entrada.nextLine();
                System.out.println("Setor: ");
                String setor = entrada.nextLine();
                System.out.println("Salario: ");
                float salario = entrada.nextFloat();
                entrada.nextLine();
                cadastrar[i] = new Assalariado(nome, cpf, endereco, telefone, setor, salario);
            } else if (tipo == 2) {
                System.out.println("Nome: ");
                String nome = entrada.nextLine();
                System.out.println("cpf: ");
                String cpf = entrada.nextLine();
                System.out.println("Endereco: ");
                String endereco = entrada.nextLine();
                System.out.println("Telefone: ");
                String telefone = entrada.nextLine();
                System.out.println("Setor: ");
                String setor = entrada.nextLine();
                System.out.println("Horas trabalhadas: ");
                int horas = entrada.nextInt();
                System.out.println("Valor hora: ");
                float valorhora = entrada.nextFloat();
                entrada.nextLine();
                cadastrar[i] = new Horista(nome, cpf, endereco, telefone, setor, horas, valorhora);
            }
        }
        //Mostra na Tela os dados Funcionarios
        for (int j = 0; j < cadastrar.length; j++) {
            System.out.println("----FUNCIONARIO-----");
            cadastrar[j].mostrarDados();
        }

        System.out.println("Informe o percentual de aumento: ");

        float percentual = entrada.nextFloat();

        //aplica o percentual informado
        for (int k = 0; k < cadastrar.length; k++) {
            cadastrar[k].getAplicarAumento(percentual);

        }
        //Mostra o valor do pagamento atualizado
        for (int l = 0; l < cadastrar.length; l++) {
            System.out.println("o salario atual de " + cadastrar[l].getNome() + " é R$ " + cadastrar[l].getSalarios());
        }

    }
}
