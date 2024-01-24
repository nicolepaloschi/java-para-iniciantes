package exercises;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PercentageOfY {
    public static void main(String[] args) {
        double x, y;
        Scanner userInput = new Scanner(System.in);
        DecimalFormat formatter = new DecimalFormat("#0.0");
        System.out.println("Cálculo de porcentagem");
        System.out.println("Informe o valor de y: ");
        y = userInput.nextDouble();
        System.out.println("Informe a porcentagem de y que deseja calcular: ");
        x = userInput.nextDouble();

        double percentage = (y * x) / 100;

        System.out.println(x + "% de " + y + " é igual a " + formatter.format(percentage) + ".");

        userInput.close();
    }
}
