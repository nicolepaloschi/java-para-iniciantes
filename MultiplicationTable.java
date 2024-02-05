package exercises;
import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        int n, i;

        try (Scanner userInput = new Scanner(System.in)) {
            System.out.println("----------Tabuada----------");
            System.out.print("Informe o número cuja tabuada deseja calcular: ");
            n = userInput.nextInt();
    
            System.out.println("\n\tTabuada do " + n);
            System.out.println("-------------------------");
            for (i = 1; i <= 10; i++) {
                System.out.println("|\t" + n + " x " + i + " = " + (n * i) + "\t|");
            }
            System.out.println("-------------------------");
        }
    }
}
