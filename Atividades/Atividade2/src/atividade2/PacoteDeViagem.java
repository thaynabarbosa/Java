package atividade2;

public class PacoteDeViagem {

    //Atributos
    private Transporte tipoTransporte;
    private Hospedagem tipoHospedagem;
    private String destino;
    private int quantidadeDeDias;

    //Metodos personalizados
    public float calcularTotalHospedagem() {
        return this.getQuantidadeDeDias() * this.tipoHospedagem.getValorDiaria();
    }

    private float calcularValorLucro(float margem, float valor) {
        return (((margem * valor) / 100) + valor);

    }

    public float calcularTotalPacote(float a, float b) {
        return this.tipoTransporte.getValor() + this.calcularTotalHospedagem() + this.calcularValorLucro(a, b);
    }

    public void descrever() {
        System.out.println("### PACOTE DE VIAGEM ###");
        System.out.println("Destino: " + this.destino);
        System.out.println("Transporte: " + this.tipoTransporte.getTipo());
        System.out.println("Hospedagem: " + this.tipoHospedagem.getDescricao());
        System.out.println("Quantidade de diárias: " + this.getQuantidadeDeDias());
        System.out.println("#############################");

    }

    //Metodo Construtor
    public PacoteDeViagem(Transporte tpt, Hospedagem tph, String des, int qtd) {
        this.tipoTransporte = tpt;
        this.tipoHospedagem = tph;
        this.destino = des;
        this.quantidadeDeDias = qtd;
    }

    //Metodos Getter e Setter
    public Transporte getTipoTransporte() {
        return this.tipoTransporte;
    }

    public void setTipoTransporte(Transporte tpt) {
        this.tipoTransporte = tpt;
    }

    public Hospedagem getTipoHospedagem() {
        return this.tipoHospedagem;
    }

    public void setTipoHospedagem(Hospedagem tph) {
        this.tipoHospedagem = tph;
    }

    public String getDestino() {
        return this.destino;
    }

    public void setDestino(String des) {
        this.destino = des;
    }

    public int getQuantidadeDeDias() {
        return this.quantidadeDeDias;
    }

    public void setQuantidadeDeDias(int qtd) {
        this.quantidadeDeDias = qtd;
    }
}
