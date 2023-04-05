public class MedicaoPressao {
    
   private String data;
   private String hora;
   private int pressaoSis;
   private int pressaoDis;
   private String SobreEstresse;
   
   
   public MedicaoPressao(){
       
   }

    public MedicaoPressao(String data, String hora, int pressaoSis, int pressaoDis, String SobreEstresse) {
        this.data = data;
        this.hora = hora;
        this.pressaoSis = pressaoSis;
        this.pressaoDis = pressaoDis;
        this.SobreEstresse = SobreEstresse;
    }
   
   
    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public int getPressaoSis() {
        return pressaoSis;
    }

    public void setPressaoSis(int pressaoSis) {
        this.pressaoSis = pressaoSis;
    }

    public int getPressaoDis() {
        return pressaoDis;
    }

    public void setPressaoDis(int pressaoDis) {
        this.pressaoDis = pressaoDis;
    }

    public String getSobreEstresse() {
        return SobreEstresse;
    }

    public void setSobreEstresse(String SobreEstresse) {
        this.SobreEstresse = SobreEstresse;
    }
    
   
   
    
}
