import exception.ExecptionValidacao;

import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //Conta cc = new ContaCorrente();
        //Conta poup = new ContaPoupanca();
        Cliente cli1 = new Cliente("João José", "123456789", new ContaCorrente());
        Cliente cli2 = new Cliente("Pedro Paulo", "987654321", new ContaPoupanca());

        ArrayList clientes = new ArrayList();

        clientes.add(cli2);
        clientes.add(cli1);

        Banco banco = new Banco("Internacionall", clientes);

        System.out.println("Clientes:" + banco);

        cli1.getConta().depositar(500);
        cli2.getConta().depositar(250);

        try{
            cli2.getConta().transferir(200, cli1.getConta());
        } catch (ExecptionValidacao e){
            System.out.println(e.getMessage());
        }
        cli2.getConta().depositar(1000);

        cli1.getConta().imprimirExtrato();
        cli2.getConta().imprimirExtrato();
    }
}