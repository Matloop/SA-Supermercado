import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Scanner para entrada de dados
        Scanner sc = new Scanner(System.in);
        //declaração de variáveis
        int total = 0;
        boolean continuar = true;
        int input = 0;
        int qtdArroz = 0;
        int qtdFeijao = 0;
        int qtdAcucar = 0;
        int qtdCafe = 0;
        //loop while que continua até o usuário digitar 5
        while (continuar) {
            //mostrar preços para o usuário
            System.out.println("Selecione um produto ou 5 para sair");
            System.out.println("――――――――――――――");
            System.out.println("┃1- Arroz - R$ 20.00 ┃");
            System.out.println("┃2- Feijão - R$ 10.00┃");
            System.out.println("┃3- Açúcar - R$ 5.00 ┃");
            System.out.println("┃4- Café - R$ 15.00  ┃");
            System.out.println("┃O total é: R$" + total + ".00   ┃");
            System.out.println("――――――――――――――");
            //Ler número informado pelo usuário
            input = sc.nextInt();
            //switch para determinar o produto escolhido pelo usuário,
            switch (input) {
                //De 1 à 4 adiciona o preço ao total e à quantidade de cada produto
                case 1:
                    total += 20;
                    qtdArroz ++;
                    break;
                case 2:
                    total += 10;
                    qtdFeijao ++;
                    break;
                case 3:
                    total += 5;
                    qtdAcucar++;
                    break;
                case 4:
                    total += 15;
                    qtdCafe++;
                    break;
                    //5 fecha o programa
                case 5:
                    continuar = false;
                    break;
            }
        }
        //mostrar ao usuário o total dos produtos e a quantidade adquirida de cada
        System.out.println("O total final é: R$" + total + ".00\n");
        System.out.println("A quantidade de arroz: " + qtdArroz);
        System.out.println("A quantiade de feijão: " + qtdFeijao);
        System.out.println("A quantidade de açucar: " + qtdAcucar);
        System.out.println("A quantidade de café: " + qtdCafe);
    }
}