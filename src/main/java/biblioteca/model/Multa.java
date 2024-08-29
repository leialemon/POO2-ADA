package biblioteca.model;

import java.time.LocalDate;

public class Multa extends Operacoes{
    private double valorTotal;

    public double calcularTotal(){
        LocalDate hoje = LocalDate.now();
        int atraso = hoje.getDayOfYear() - dataRealizada.getDayOfYear();
        double jurosDia = 0.5;
        if (this.item.getReserva() != null){
            jurosDia = 1;
        }
        this.valorTotal = atraso * jurosDia;
        return this.valorTotal;
    }

    public double getValorTotal(){
        return calcularTotal();
    }
}
