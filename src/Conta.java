import exception.ExecptionValidacao;

import java.util.ArrayList;
import java.util.List;

public abstract class Conta implements IConta{

    protected static final int AGENCIA_PADRAO = 1;
    protected static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;

    public Conta() {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
    }

    @Override
    public void sacar(double valor) {
        if(valor > saldo) {
            throw new ExecptionValidacao("Não é possível efetuar sacque superior ao saldo: " + saldo);
        }
        saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;

    }
    @Override
    public void transferir(double valor, Conta contaDestino) {
        sacar(valor);
        contaDestino.depositar(valor);
    }
    public void imprimirExtrato() {
        System.out.println(String.format("Agência: %d", agencia));
        System.out.println(String.format("Número: %d", numero));
        System.out.println(String.format("Saldo: %2f", saldo));
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "agencia=" + agencia +
                ", numero=" + numero +
                ", saldo=" + saldo +
                '}';
    }
}
