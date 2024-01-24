package exercises;

import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.Random;

public class Jankenpon {
    public static void main(String[] args) {
        int userChoice, computerChoice;
        String userTool = "", computerTool = "";
        
        DecimalFormat twoPointDecimal = new DecimalFormat("#0.00");
        Scanner userInput = new Scanner(System.in);
        
        System.out.println("------------Jankenpon------------");
        System.out.println("1 - Pedra\n2 - Papel\n3 - Tesoura");
        System.out.println("");
        System.out.print("Escolha a sua opção: ");

        userChoice = userInput.nextInt();

        Random random = new Random();

        computerChoice = random.nextInt(1, 4);

        if (userChoice >= 1 && userChoice <= 3) {
            switch (userChoice) {
                case 1:
                    userTool = "pedra";
                    break;
                case 2:
                    userTool = "papel";
                    break;
                case 3:
                    userTool = "tesoura";
                    break;
                default:
                    break;
            }
            
            switch (computerChoice) {
                case 1:
                    computerTool = "pedra";
                    break;
                case 2:
                    computerTool = "papel";
                    break;
                case 3:
                    computerTool = "tesoura";
                    break;
                default:
                    break;
            }
                
            System.out.println("");
            System.out.println("Você escolheu " + userTool + ".");
            System.out.println("O computador escolheu " + computerTool + ".");
        
            if (userChoice == computerChoice) {
                System.out.println("------------Empate :|------------");
            } else if ((userChoice == 1 && computerChoice == 3) || 
                       (userChoice == 2 && computerChoice == 1) || 
                       (userChoice == 3 && computerChoice == 2)) {
                System.out.println("---------Você venceu! :D---------");
                
            } else {
                System.out.println("------O computador venceu :(-----");
            }
        } else {
            System.out.println("---------Opção inválida----------");
        }
        System.out.println("");
        userInput.close();
    }
}
