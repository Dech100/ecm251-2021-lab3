package Pinheiro.Pedro;

public class Main {

    public static void main(String[] args) {
	    // Criar uma referência para conta
        Conta c1;
        //Instanciar um objeto Conta
        c1 = new Conta();

        c1.titular = "Inuyasha";
        c1.saldo = 199.99;

        c1.visualizarSaldo();
        c1.visualizarSaldo();

        Conta c2 = new Conta();
        c2.titular = "Seichomaru";
        c2.saldo = 1000;
        c2.visualizarSaldo();

        c1.depositar(20);
        c2.depositar(35.99);

        c1.visualizarSaldo();
        c2.visualizarSaldo();

    }
}
