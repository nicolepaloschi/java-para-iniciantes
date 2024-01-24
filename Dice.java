package exercises;
import java.util.Random;
import java.util.Scanner;

public class Dice {
    private Random random = new Random();
    private Scanner userInput = new Scanner(System.in);

    public void rollDice() {
        int rolledValue = random.nextInt(1, 7);
        System.out.println("\n-----O valor sorteado foi " + rolledValue + "-----");
    }

    public boolean rollAgain() {
        System.out.print("\nDeseja jogar novamente [S|N]? ");
        String userResponse = userInput.next();
        if (userResponse.equalsIgnoreCase("S")) {
            return true;
        } else {
            System.out.println("\n-----------Saindo...------------\n");
            return false;
        }

    }

    public static void main(String[] args) {
        Dice dice = new Dice();
        boolean playAgain = true;
        
        System.out.println("----------Jogue o dado----------");
        while (playAgain) {
            dice.rollDice();
            playAgain = dice.rollAgain();
        }
    }
}
