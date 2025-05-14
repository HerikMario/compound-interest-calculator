import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        double montanteInicial;
        double jurosPorMes;
        int quantidadeDeMeses;
        double montanteFinal;

        System.out.println("==============================");
        System.out.println("Calculadora de juros compostos");
        System.out.println("==============================");

        System.out.print("Montante inicial (R$): ");
        montanteInicial = scan.nextDouble();
        System.out.print("Juros aplicados por mês (%): ");
        jurosPorMes = scan.nextDouble();
        System.out.print("Quantidade de meses: ");
        quantidadeDeMeses = scan.nextInt();

        montanteFinal = montanteInicial;

        for (int i = 0; i < quantidadeDeMeses; i++) {
            montanteFinal += montanteFinal * (jurosPorMes/100);
        }

        System.out.printf("\nO montante inicial era R$ %.2f", montanteInicial);
        System.out.printf("\nO montante final é R$ %.2f", montanteFinal);

    }
}
