package exercises;

public class Agenda {
    public static void main(String[] args) {
        String[][] agenda = {
            {"Peter", "5555-5555", "peter@gmail.com"},
            {"Bill", "4444-4444", "bill@gmail.com"},
            {"Linus", "3232-3232", "linus@gmail.com"},
        };

        for(int i = 0; i < agenda.length; i++) {
            for(int j = 0; j < agenda.length; j++) {
                System.out.println("Valor da posição [" + i + "][" + j + "]: " + agenda[i][j]);
            }
        }
    }
}
