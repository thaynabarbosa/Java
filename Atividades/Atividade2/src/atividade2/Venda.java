package atividade2;

public class Venda {
    //atributos
 private String nome;
 private String formaDePagamento;
 private PacoteDeViagem pacoteViagem;
 
 //Métodos personalizados
 public float converterValorEmReais(float cotacaoDolar, float valor ){
     return cotacaoDolar * valor;
 }
 
 public void totalPacoteViagem(float cotacao,float a, float b){
     System.out.println("#### INFORMAÇÃO DA VENDA ####");
     System.out.println("Nome: " + this.getNome());
     System.out.println("Forma de Pagamento: " + this.getFormaDePagamento());
     this.pacoteViagem.descrever();
     
     System.out.println("Total Pacote de Viagem em Dolar $" + this.pacoteViagem.calcularTotalPacote(a,b));
     System.out.println("Total Pacote de Viagem em Reais R$" + this.converterValorEmReais(cotacao,this.pacoteViagem.calcularTotalPacote(a, b)));
 }
 
 // Método Construtores
 public Venda(String nomes, String fpag, PacoteDeViagem pacote){
 this.nome = nomes;
 this.formaDePagamento = fpag;
 this.pacoteViagem = pacote;
 }
 
 //Método getter e setter
 
 public String getNome(){
     return this.nome;
 }
 
 public void setNome(String nomes){
     this.nome = nomes;
 }
 
 public String getFormaDePagamento(){
     return this.formaDePagamento;
 }
 
 public void setFormaDePagamento(String fpag){
     this.formaDePagamento = fpag;
 }
 
 public PacoteDeViagem getPacoteViagem(){
     return this.pacoteViagem;
 }
 
 public void setPacoteViagem(PacoteDeViagem pacv){
     this.pacoteViagem = pacv;
 }
 
}
