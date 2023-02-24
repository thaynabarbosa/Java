package atividade3;

public class Horista extends Funcionario {
    //Atributos
    protected int horastrabalhadas;
    protected float valorHora;
    protected float salarioHorista;
    
    public Horista(String nome, String cpf, String endereco, String telefone, String setor, int horastrab, float valorhora) {
        super(nome, cpf, endereco, telefone, setor);
        this.horastrabalhadas = horastrab;
        this.valorHora = valorhora;
    }
   
    //Métodos especiais
    
    @Override
    public float calcularPagamento() {
      return this.salarioHorista = this.getHorastrabalhadas()*this.getValorHora();
       
    }

    @Override
    public float aplicarAumento(float valor) {
       return this.salarioHorista = ((this.calcularPagamento()*valor)/100)+ this.calcularPagamento();
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
    
    //Metodos Getter e Setter
    public int getHorastrabalhadas() {
        return horastrabalhadas;
    }

    public void setHorastrabalhadas(int horastrabalhadas) {
        this.horastrabalhadas = horastrabalhadas;
    }

    public float getValorHora() {
        return valorHora;
    }

    public void setValorHora(float valorHora) {
        this.valorHora = valorHora;
    }

    public float getSalarioHorista() {
        return salarioHorista;
    }

    public void setSalarioHorista(float salarioHorista) {
        this.salarioHorista = salarioHorista;
    }
    
    public float salarioHorista(){
        return this.getSalarioHorista();
        
    }

        
    @Override
    public float getAplicarAumento(float valorHora) {
        return aplicarAumento(valorHora);
        
    }

    @Override
    public float getSalarios() {
        return salarioHorista();
    }
   
    
    
    
}
