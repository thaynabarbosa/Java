
public class FaturamentoMensal {

    double SP = 67836.43;
    double RJ = 36678.66;
    double MG = 29229.88;
    double ES = 27165.48;
    double Outros = 19849.53;
    double total = 0;
    double percSP = 0;
    double percRJ = 0;
    double percMG = 0;
    double percES = 0;
    double percOutros = 0;

    public void calcular() {
        total = SP + RJ + MG + ES + Outros;

        percSP = (SP / total) * 100;
        percRJ = (RJ / total) * 100;
        percMG = (MG / total) * 100;
        percES = (ES / total) * 100;
        percOutros = (Outros / total) * 100;

        System.out.println("----Participação por estado no faturamento da Distribuidora----");
        System.out.println("O estado de São Paulo teve participação de " + Math.round(percSP) + "%");
        System.out.println("O estado de Rio de Janeiro teve participação de " + Math.round(percRJ) + "%");
        System.out.println("O estado de Minas Gerais teve participação de " + Math.round(percMG) + "%");
        System.out.println("O estado de Espírito Santo teve participação de " + Math.round(percES) + "%");
        System.out.println("Outros teve participação de " + Math.round(percOutros) + "%");
    }

}
