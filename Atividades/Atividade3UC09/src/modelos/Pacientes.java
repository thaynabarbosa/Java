package modelos;

public class Pacientes {
    private String nome;
    private String cpf;
    private String telefone;
    private String data;
    private String jaPaciente;
    private String consultaRealizada;
    private String receitaObs;
    
    public Pacientes(){
        
    }

    public Pacientes(String nome, String cpf, String telefone, String data, String jaPaciente, String consultaRealizada, String receitaObs) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.data = data;
        this.jaPaciente = jaPaciente;
        this.consultaRealizada = consultaRealizada;
        this.receitaObs = receitaObs;
    }

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

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getJaPaciente() {
        return jaPaciente;
    }

    public void setJaPaciente(String jaPaciente) {
        this.jaPaciente = jaPaciente;
    }

    public String getConsultaRealizada() {
        return consultaRealizada;
    }

    public void setConsultaRealizada(String consultaRealizada) {
        this.consultaRealizada = consultaRealizada;
    }

    public String getReceitaObs() {
        return receitaObs;
    }

    public void setReceitaObs(String receitaObs) {
        this.receitaObs = receitaObs;
    }

    
}
