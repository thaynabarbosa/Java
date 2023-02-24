package atividade2;

public class Hospedagem {
    //atributos
  private String descricao;
  private float valorDiaria;
  
  // metodo construtor
  public Hospedagem(String des, float vd){
      this.descricao = des;
      this.valorDiaria = vd;
  }
  
  //metodos getter e setter
  
  public String getDescricao(){
      return this.descricao;
  }
  
  public void setDescricao(String des){
      this.descricao = des;
  }
  
  public float getValorDiaria(){
      return this.valorDiaria;
  }
  
  public void setValorDiaria(float vd){
      this.valorDiaria = vd;
  }
}
