package atividade3;

public class Assalariado extends Funcionario {
    //Atributo
    protected float salario;

    public Assalariado(String nome, String cpf, String endereco, String telefone, String setor, float salario) {
        super(nome, cpf, endereco, telefone, setor);
        this.salario = salario;
    }
    
    @Override
    public float aplicarAumento(float valor) {
               return this.salario = ((this.getSalario() * valor)/100)+this.getSalario();
               
    }
    
    @Override
    public void mostrarDados() {
        System.out.println("Nome: " + this.getNome());
        System.out.println("cpf: " + this.getCpf());
        System.out.println("Endereco: " + this.getEndereco());
        System.out.println("Telefone: " + this.getTelefone());
        System.out.println("Setor: " + this.getSetor());
        System.out.println("salário: " + this.calcularPagamento());
    }

    @Override
    public float calcularPagamento() {
        return this.salario;
    }
        
    
    //Metodos Getter e Setter
    public float getSalario() {
        return this.salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Assalariado{" + super.toString()+ "salario=" + salario + '}';
    }

    @Override
    public float getAplicarAumento(float valor) {
       return aplicarAumento(valor);
    }

    @Override
    public float getSalarios() {
        return calcularPagamento();
    }
    
    
}
