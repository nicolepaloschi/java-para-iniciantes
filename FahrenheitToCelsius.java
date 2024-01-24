package exercises;
import java.util.Scanner;
import java.text.DecimalFormat;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        double celsius, fahrenheit;
        Scanner userInput = new Scanner(System.in);
        DecimalFormat formatter = new DecimalFormat("#0.0");
        
        System.out.println("Conversão de Fahrenheit para Celsius");
        System.out.println("Informe a temperatura em Fahrenheit: ");
        fahrenheit = userInput.nextDouble();
        
        celsius = (5 * (fahrenheit - 32)) / 9;
        
        System.out.println(fahrenheit + "F é igual a " + formatter.format(celsius) + "°C");

        userInput.close();
    }
}
