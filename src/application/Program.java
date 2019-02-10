
package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import models.Car;
import models.Locacao;
import service.ServicoLoc;
import service.Taxa;


public class Program {

    public static void main(String[] args) throws ParseException{
       
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:ss");
        
        System.out.println("Entre com os dados da locação");
        System.out.println("Digite o modelo do veiculo: ");
        String carro = sc.nextLine();
        System.out.println("Digite a data de retirada: ");
        Date inicio = sdf.parse(sc.nextLine());
        System.out.println("Digite a data de devolução: ");
        Date fim = sdf.parse(sc.nextLine());
        
        Locacao loc = new Locacao(inicio, fim, new Car(carro));
        
        System.out.println("Digite o preço por hora: ");
        double precoHora = sc.nextDouble();
        System.out.println("Digite o preço por dia: ");
        double precoDia = sc.nextDouble();
        
        ServicoLoc  servicoLoc = new ServicoLoc(precoHora, precoDia, new Taxa());
        
        servicoLoc.processInvoice(loc);
        
        System.out.println("Fatura: ");
        System.out.println("SubTotal :" + String.format("%.2f", loc.getFatura().getSubtotal()));
        System.out.println("Taxa :" + String.format("%.2f", loc.getFatura().getImposto()));
        System.out.println("SubTotal :" + String.format("%.2f", loc.getFatura().total()));
    
        
        
        sc.close();
    }
    
}
