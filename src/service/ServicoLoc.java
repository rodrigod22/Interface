package service;

import models.Fatura;
import models.Locacao;

public class ServicoLoc {

    private Double precoHora;
    private Double precoDia;

    private TaxService taxa; 

    public ServicoLoc(Double precoHora, Double precoDia, TaxService taxa) {
        this.precoHora = precoHora;
        this.precoDia = precoDia;
        this.taxa = taxa;
    }

    public Double getPrecoHora() {
        return precoHora;
    }

    public void setPrecoHora(Double precoHora) {
        this.precoHora = precoHora;
    }

    public Double getPrecoDia() {
        return precoDia;
    }

    public void setPrecoDia(Double precoDia) {
        this.precoDia = precoDia;
    }

    public TaxService getTaxa() {
        return taxa;
    }

    public void setTaxa(TaxService taxa) {
        this.taxa = taxa;
    }

   
            
    
    public void processInvoice(Locacao locacao){
        long t1 = locacao.getInicio().getTime();
        long t2  = locacao.getFim().getTime();
        double hora  = (double)(t2 - t1) / 1000 / 60 / 60;
        double subtotal;
        if(hora <= 12){
           subtotal = Math.ceil(hora) * precoHora;
        }else{            
           subtotal = Math.ceil(hora / 24) * precoDia; 
        }        
        double tax = taxa.tax(subtotal);
        locacao.setFatura(new Fatura(subtotal, tax));
    }
    
}
