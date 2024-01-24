package exercises;

import java.text.DecimalFormat;
import java.util.Scanner;

public class SelfEmployedSalary {
    public static void main(String[] args) {
        double monthlyPay, taxes, operationalCosts, investments, monthlyWorkload, hourlyServiceCost;
        DecimalFormat twoPointDecimal = new DecimalFormat("#0.00");
        Scanner userInput = new Scanner(System.in);
        
        System.out.println("----Cálculo do valor de horas de trabalho - serviço autônomo----");
        System.out.print("Informe a remuneração mensal pretendida: R$");
        monthlyPay = userInput.nextDouble();

        System.out.print("Informe o custo operacional mensal: R$");
        operationalCosts = userInput.nextDouble();

        System.out.print("Informe a carga horária mensal: ");
        monthlyWorkload = userInput.nextDouble();

        taxes = (monthlyPay * 0.3);
        investments = (monthlyPay * 0.2);
        
        hourlyServiceCost = (monthlyPay + taxes + operationalCosts + investments) / monthlyWorkload;
        System.out.println("Considerando os valores informados, adicionando 30% de impostos e 20% designados a investimentos, para obter remuneração mensal de R$" + 
            twoPointDecimal.format(monthlyPay) + " o valor da hora deve ser R$" + twoPointDecimal.format(hourlyServiceCost) + ".");
        
        userInput.close();
    }
}
