package atividade3;

public abstract class Funcionario{

    //Atributos
    protected String nome;
    protected String cpf;
    protected String endereco;
    protected String telefone;
    protected String setor;

    //Metodo Construtor
   public Funcionario(String nome, String cpf, String endereco, String telefone, String setor) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
        this.setor = setor;
    }

    //Metodos abstratos implementados
  
    public abstract void mostrarDados();
    public abstract float calcularPagamento();
    public abstract float aplicarAumento(float valor);
   
    //Metodos Getter e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }
    
    public abstract float getAplicarAumento(float valor);
    public abstract float getSalarios();

}
