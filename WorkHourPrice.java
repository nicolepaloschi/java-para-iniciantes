package exercises;
import java.text.DecimalFormat;
import java.util.Scanner;

public class WorkHourPrice {
    public static void main(String[] args) {
        double workHours, pricePerHour, totalPrice;
        DecimalFormat twoPointDecimal = new DecimalFormat("#0.00");
        DecimalFormat roundDecimal = new DecimalFormat("#0");
        Scanner userInput = new Scanner(System.in);

        System.out.println("----Cálculo do valor de horas de trabalho----");
        System.out.print("Informe o preço por hora: R$");
        pricePerHour = userInput.nextDouble();

        System.out.print("Informe a quantidade de horas: ");
        workHours = userInput.nextDouble();

        totalPrice = pricePerHour * workHours;
        if (workHours <= 0 ) {
            System.out.println("É necessário informar a quantidade de horas.");
        } else if (workHours > 0 && workHours < 1) {
            System.out.println("O preço de " + twoPointDecimal.format(workHours) + " horas de trabalho é R$" + twoPointDecimal.format(totalPrice) + ".");
        } else if (workHours == 1) {
            System.out.println("O preço de " + roundDecimal.format(workHours) + " hora de trabalho é R$" + twoPointDecimal.format(totalPrice) + ".");
        } else {
            if (workHours == Math.floor(workHours)){
                System.out.println("O preço de " + roundDecimal.format(workHours) + " horas de trabalho é R$" + twoPointDecimal.format(totalPrice) + ".");
            } else {
                System.out.println("O preço de " + twoPointDecimal.format(workHours) + " horas de trabalho é R$" + twoPointDecimal.format(totalPrice) + ".");   
            }
        }
        
        userInput.close();
    }
}
