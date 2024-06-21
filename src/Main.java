// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Conta cc = new ContaCorrente();
        Conta poup = new ContaPoupanca();

        cc.depositar(500);
        cc.transferir(100, poup);

        cc.imprimirDadosComuns();
        poup.imprimirDadosComuns();
    }
}