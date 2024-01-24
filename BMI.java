package exercises;

import java.text.DecimalFormat;
import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        double height, weight, bmi;
        DecimalFormat twoPointDecimal = new DecimalFormat("#0.00");
        Scanner userInput = new Scanner(System.in);

        System.out.println("------Cálculo do Índice de Massa Corporal (IMC)------");
        System.out.print("Informe seu peso (kg): ");
        weight = userInput.nextDouble();
        
        System.out.print("Informe sua altura (m): ");
        height = userInput.nextDouble();
        System.out.println("");

        bmi = weight / (Math.pow(height, 2));

        if (bmi < 18.5) {
            System.out.println("O seu IMC é de " + twoPointDecimal.format(bmi) + ", o que indica que você está abaixo do peso.");
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            System.out.println("O seu IMC é de " + twoPointDecimal.format(bmi) + ", o que indica que seu peso é normal.");
        } else if (bmi >= 25 && bmi <= 29.9) {
            System.out.println("O seu IMC é de " + twoPointDecimal.format(bmi) + ", o que indica que você está levemente acima do peso.");
        } else if (bmi >= 30 && bmi <= 34.9) {
            System.out.println("O seu IMC é de " + twoPointDecimal.format(bmi) + ", o que indica que você está na faixa de obesidade de grau I.");
        } else if (bmi >= 35 && bmi <= 39.9) {
            System.out.println("O seu IMC é de " + twoPointDecimal.format(bmi) + ", o que indica que você está na faixa de obesidade de grau II (severa).");
        } else {
            System.out.println("O seu IMC é de " + twoPointDecimal.format(bmi) + ", o que indica que você está na faixa de obesidade de grau III (mórbida).");
        }
        
        userInput.close();
    }
}
