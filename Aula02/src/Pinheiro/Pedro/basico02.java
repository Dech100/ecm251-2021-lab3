package Pinheiro.Pedro;

public class basico02 {
    //estruturas de decisão
    public static void main(String[] args) {
        int ano = 2021;

        //Estrutura de decisão simples
//        if(ano % 2 == 0){
//            System.out.println("Ano Par!");
//        }
//        if (ano % 2 == 1){
//            System.out.println("Ano Impar!");
//        }

        //Estrutura de decisão complexa
        if (ano %2 == 0){
            System.out.println("Ano Par!");
        }else {
            System.out.println("Ano Impar!");
        }
        //Varias decisões
        switch (ano){
            case 2020:
                System.out.println("Vixi");
                break;
            case 1996:
                System.out.println("Pokemon Red");
                break;
        }
    }
}
