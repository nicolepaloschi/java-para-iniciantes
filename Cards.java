package exercises;

public class Cards {
    public static void main(String[] args) {
        char[] suits = {'\u2665', '\u2666', '\u2663', '\u2660'};
        String[] cards = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        
        int randomSuitIndex = (int) (Math.random() * suits.length);
        char suit = suits[randomSuitIndex];
        String card = cards[(int) (Math.random() * cards.length)];

        System.out.println("----------SORTEIO DE CARTAS----------\n");
        System.out.println("A carta sorteada é " + card + suit + ".\n");
        System.out.println("-------------------------------------\n");
    }
}