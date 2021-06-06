import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char[][] board = new char[10][10];
        int choose = 0;
        ArrayList<Player> Players = new ArrayList<>();

        System.out.println("1. Přidej hráče");
        System.out.println("2. Začít");

        choose = sc.nextInt();


        if(choose == 1) {
            System.out.println("Zadej jmeno hrace");
            String name = sc.nextLine();

            System.out.println("Zadej symbol pro tohoto uživatele");
            char symbol = sc.next().charAt(0);

            Player eachPlayer = new Player(name, symbol);

            Players.add(eachPlayer);
        }

        if(choose == 2) {

            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board.length; j++) {
                    board[i][j] = '-';
                }
            }

            for (int i = 0; i < board.length; i++) {
                System.out.println();
                for (int j = 0; j < board.length; j++) {
                    if (j == 0) {
                        System.out.print(i + 1);
                        System.out.print("| ");
                    }
                    System.out.print(board[i][j] + " | ");
                }
            }
        }
    }
}
