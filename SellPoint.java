package exercises;
import java.text.DecimalFormat;
import java.util.Scanner;

public class SellPoint {
    public static void main(String[] args) {
        double fullValue, discount, valueWithDiscount, amountPaid, change;
        DecimalFormat formatter = new DecimalFormat("#0.00");

        Scanner userInput = new Scanner(System.in);
        System.out.println("----------------Quitar dívida----------------");
        System.out.print("Informe o valor total: R$");
        fullValue = userInput.nextDouble();

        System.out.print("Informe o valor do desconto (%): ");
        discount = userInput.nextDouble();

        valueWithDiscount = fullValue - (discount * fullValue) / 100;
        System.out.println("O valor com desconto de " + discount + "% é de R$" + formatter.format(valueWithDiscount) + ".");
        System.out.println("");

        System.out.print("Informe o valor pago: R$");
        amountPaid = userInput.nextDouble();
        System.out.println("");

        change = amountPaid - valueWithDiscount;

        if (amountPaid > valueWithDiscount) {
            System.out.println("O seu troco é de R$" + formatter.format(change) + ".");
        } else if (amountPaid == valueWithDiscount) {
            System.out.println("Sua dívida foi quitada. Você não tem troco a receber.");
        } else {
            System.out.println("Ainda faltam R$" + formatter.format(change * (-1)) + " para quitar sua dívida.");
        }
        System.out.println("---------------------------------------------");

        userInput.close();
    }
}
