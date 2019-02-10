
package models;

public class Fatura {
    
    private Double subtotal;
    private Double imposto;

    public Fatura(Double subtotal, Double imposto) {
        this.subtotal = subtotal;
        this.imposto = imposto;
    }

    public Double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Double subtotal) {
        this.subtotal = subtotal;
    }

    public Double getImposto() {
        return imposto;
    }

    public void setImposto(Double imposto) {
        this.imposto = imposto;
    }
    
    public Double total(){
        return this.getSubtotal() + this.getImposto();
    }
    
    
}
