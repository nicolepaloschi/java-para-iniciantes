package exercises;
import java.text.DecimalFormat;
import java.util.Scanner;

public class CarFuel {
    public static void main(String[] args) {
        double petrol, alcohol;
        DecimalFormat twoPointDecimal = new DecimalFormat("#0.00");
        Scanner userInput = new Scanner(System.in);

        System.out.println("------Qual o combustível mais vantajoso no momento?------");
        System.out.print("Informe o valor do litro de álcool: R$");
        alcohol = userInput.nextDouble();

        System.out.print("Informe o valor do litro de gasolina: R$");
        petrol = userInput.nextDouble();

        if (alcohol < petrol * 0.7) {
            System.out.println("Com a gasolina a R$" + twoPointDecimal.format(petrol) + "/L e o álcool a R$" + twoPointDecimal.format(alcohol) +
            "/L, é mais vantajoso abastecer com álcool.");
        } else if (alcohol == petrol * 0.7) {
            System.out.println("Com a gasolina a R$" + twoPointDecimal.format(petrol) + "/L e o álcool a R$" + twoPointDecimal.format(alcohol) +
            "/L, as duas opções são igualmente vantajosas.");
        } else {
            System.out.println("Com a gasolina a R$" + twoPointDecimal.format(petrol) + "/L e o álcool a R$" + twoPointDecimal.format(alcohol) + 
            "/L, é mais vantajoso abastecer com gasolina.");
        }
        
        userInput.close();
    }
}
