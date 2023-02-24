package atividade2;

public class Transporte {
    //atributos
    private String tipo;
    private float valor;
    
    // metodo construtor
    public Transporte(String t,float v){
        this.tipo = t;
        this.valor = v;
    }
    // metodos getter e setter
    public String getTipo(){
        return this.tipo;
    }
    
     public void setTipo(String t){
         this.tipo = t;
     }
     
     public float getValor(){
         return this.valor;
     }
    
     public void setValor(float v){
         this.valor = v;
     }
    
}
