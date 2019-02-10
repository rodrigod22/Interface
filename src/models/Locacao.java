
package models;

import java.util.Date;

public class Locacao {
    
    private Date inicio;
    private Date fim;
    
    private Car car;
    private Fatura fatura;

    public Locacao(Date inicio, Date fim, Car car) {
        this.inicio = inicio;
        this.fim = fim;
        this.car = car;
    }

    public Date getInicio() {
        return inicio;
    }

    public void setInicio(Date inicio) {
        this.inicio = inicio;
    }

    public Date getFim() {
        return fim;
    }

    public void setFim(Date fim) {
        this.fim = fim;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Fatura getFatura() {
        return fatura;
    }

    public void setFatura(Fatura fatura) {
        this.fatura = fatura;
    }

   
    
    
    
    
}
