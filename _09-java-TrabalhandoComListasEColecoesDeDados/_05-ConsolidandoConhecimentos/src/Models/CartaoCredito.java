package Models;

import java.util.ArrayList;
import java.util.List;

public class CartaoCredito {

    private double limeteCartao;
    private double saldo;
    private List<Compras> compras;

    public CartaoCredito(double limeteCartao) {
        this.limeteCartao = limeteCartao;
        this.saldo = limeteCartao;
        this.compras = new ArrayList<>();
    }

    public boolean lancaCompra(Compras compras){
        if(this.saldo > compras.getValor()){
            this.saldo -= compras.getValor();
            this.compras.add(compras);
            return true;
        } else {
            return false;
        }
    }

    public double getLimeteCartao() {
        return limeteCartao;
    }

    public double getSaldo() {
        return saldo;
    }

    public List<Compras> getCompras() {
        return compras;
    }


}
