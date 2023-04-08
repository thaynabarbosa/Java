
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import java.io.File;


public class LerArquivo {

    int soma = 0;
    int descontar = 0;
    int dias = 0;
    int media = 0;
    int diasMaiorMedia = 0;
    double maiorFaturamento = 0.0;
    double menorFaturamento = 0.0;
    int cont =0;
   
    public void lerXML() {
        try {
            File arquivoXML = new File("dados.xml");

            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(arquivoXML);

            doc.getDocumentElement().normalize();

            NodeList dia = doc.getElementsByTagName("dia");
            NodeList valor = doc.getElementsByTagName("valor");

            for (int i = 0; i < dia.getLength(); i++) {
                Element element = (Element) valor.item(i);
                Element elementDia = (Element) dia.item(i);
                String conteudoDia = elementDia.getTextContent();
                String conteudo = element.getTextContent();
                String [] fat = new String [dia.getLength()];
                Double [] valores = new Double[dia.getLength()];
                
               
                fat[i] = conteudo;
                valores[i] = Double.parseDouble(fat[i]);
                soma += Math.round(valores[i]);
                
                                
                //verifica os dias que o faturamento foi zerado
                if(valores[i] == 0){
                    descontar +=1;
                }
                //verifica os dias que o faturamento não foi zerado
                if(valores[i]!=0){
                    dias +=1;
                }
                //desconta os dias que o faturamento foi zerado, para o calculo da média mensal.
                int qtdDias = dias - descontar;
                
                media = soma / qtdDias;
                
                //verifica os dias que o faturamento foi maior que a média mensal
                if(valores[i] > media){
                    diasMaiorMedia += 1;
                }
               
                //verific
                if(cont == 0){
                    maiorFaturamento = valores[i];
                    menorFaturamento = valores[i];
                    cont++;
                }
                if(valores[i]>maiorFaturamento){
                    maiorFaturamento = valores[i];
                }
                if(valores[i]<menorFaturamento){
                    menorFaturamento = valores[i];
                }

            }
            
            System.out.println("Maior faturamento ocorrido no mês: R$ " + Math.round(maiorFaturamento));
            System.out.println("Menor faturamento ocorrido no mês: R$ " + Math.round(menorFaturamento));
            System.out.println(diasMaiorMedia + " o número de dias com faturamento superior a média");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}