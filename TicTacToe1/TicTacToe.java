package TicTacToe1;

import java.util.Arrays;
import java.util.Scanner;


/**
 * @author Arthur Fernandes
 * @version 1.0
 * @since 13/02/2021
 */

public class TicTacToe {
    //My first TicTacToe game using Matrix.
    //It's a simple code in which I did not treat exceptions
    // such as players 2 move's the same as player one's

    public static void main(String[] args) {
        System.out.println("Welcome to my first TicTacToe game!");
        System.out.println("Make your move by saying the index coordinate 0--2" + "\nGood game, Have fun!");

        boolean running = true;

        String[][] tictactoe = new String[3][3];

        for (int i = 0; i < tictactoe.length; i++) {
            for (int j = 0; j < tictactoe.length; j++) {
                tictactoe[i][j] = "  ";
            }

        }
        Scanner entrada = new Scanner(System.in);

        while (running) {
            System.out.println("Player one's turn (you get the 'x' symbol): ");
            System.out.print("Coordinate x ");
            int coordinateX1 = entrada.nextInt();
            System.out.print("\nCoordinate y ");
            int coordinateY1 = entrada.nextInt();

            tictactoe[coordinateX1][coordinateY1] = "x";

            if (tictactoe[0][0].equals("x") && tictactoe[0][1].equals("x") && tictactoe[0][2].equals("x")) {
                System.out.println("Winner is player one");
                break;
            } else if (tictactoe[0][0].equals("y") && tictactoe[0][1].equals("y") && tictactoe[0][2].equals("y")) {
                System.out.println("Winner is player two");
                break;
            } else if (tictactoe[1][0].equals("x") && tictactoe[1][1].equals("x") && tictactoe[1][2].equals("x")) {
                System.out.println("Winner is player one");
                break;
            } else if (tictactoe[1][0].equals("y") && tictactoe[1][1].equals("y") && tictactoe[1][2].equals("y")) {
                System.out.println("Winner is player two");
                break;
            } else if (tictactoe[2][0].equals("x") && tictactoe[2][1].equals("x") && tictactoe[2][2].equals("x")) {
                System.out.println("Winner is player one");
                break;
            } else if (tictactoe[2][0].equals("y") && tictactoe[2][1].equals("y") && tictactoe[2][2].equals("y")) {
                System.out.println("Winner is player two");
                break;
            } else if (tictactoe[0][0].equals("x") && tictactoe[1][1].equals("x") && tictactoe[2][2].equals("x")) {
                System.out.println("Winner is player one");
                break;
            } else if (tictactoe[0][0].equals("y") && tictactoe[1][1].equals("y") && tictactoe[2][2].equals("y")) {
                System.out.println("Winner is player two");
                break;
            } else if (tictactoe[0][2].equals("x") && tictactoe[1][1].equals("x") && tictactoe[2][0].equals("x")) {
                System.out.println("Winner is player one");
                break;
            } else if (tictactoe[0][2].equals("y") && tictactoe[1][1].equals("y") && tictactoe[2][0].equals("y")) {
                System.out.println("Winner is player two");
                break;
            } else if (tictactoe[0][0].equals("x") && tictactoe[1][0].equals("x") && tictactoe[2][0].equals("x")) {
                System.out.println("Winner is player one");
                break;
            } else if (tictactoe[0][0].equals("y") && tictactoe[1][0].equals("y") && tictactoe[2][0].equals("y")) {
                System.out.println("Winner is player two");
                break;
            } else if (tictactoe[0][1].equals("x") && tictactoe[1][1].equals("x") && tictactoe[2][1].equals("x")) {
                System.out.println("Winner is player one");
                break;
            } else if (tictactoe[0][1].equals("y") && tictactoe[1][1].equals("y") && tictactoe[2][1].equals("y")) {
                System.out.println("Winner is player two");
                break;
            } else if (tictactoe[0][2].equals("x") && tictactoe[1][2].equals("x") && tictactoe[2][2].equals("x")) {
                System.out.println("Winner is player one");
                break;
            } else if (tictactoe[0][2].equals("y") && tictactoe[1][2].equals("y") && tictactoe[2][2].equals("y")) {
                System.out.println("Winner is player two");
                break;
            }

            for (String[] game : tictactoe
            ) {
                System.out.println(Arrays.toString(game));
            }

            System.out.println("Player two's turn (you get the 'y' symbol): ");
            System.out.print("Coordinate x: ");
            int coordinateX2 = entrada.nextInt();
            System.out.print("Coordinate y: ");
            int coordinateY2 = entrada.nextInt();
            if (coordinateX2 < tictactoe.length && coordinateY2 < tictactoe.length)
                tictactoe[coordinateX2][coordinateY2] = "o";

            for (String[] game : tictactoe
            ) {
                System.out.println(Arrays.toString(game));
            }

            if (tictactoe[0][0].equals("x") && tictactoe[0][1].equals("x") && tictactoe[0][2].equals("x")) {
                System.out.println("Winner is player one");
                running = false;
            } else if (tictactoe[0][0].equals("y") && tictactoe[0][1].equals("y") && tictactoe[0][2].equals("y")) {
                System.out.println("Winner is player two");
                running = false;
            } else if (tictactoe[1][0].equals("x") && tictactoe[1][1].equals("x") && tictactoe[1][2].equals("x")) {
                System.out.println("Winner is player one");
                running = false;
            } else if (tictactoe[1][0].equals("y") && tictactoe[1][1].equals("y") && tictactoe[1][2].equals("y")) {
                System.out.println("Winner is player two");
                running = false;
            } else if (tictactoe[2][0].equals("x") && tictactoe[2][1].equals("x") && tictactoe[2][2].equals("x")) {
                System.out.println("Winner is player one");
                running = false;
            } else if (tictactoe[2][0].equals("y") && tictactoe[2][1].equals("y") && tictactoe[2][2].equals("y")) {
                System.out.println("Winner is player two");
                running = false;
            } else if (tictactoe[0][0].equals("x") && tictactoe[1][1].equals("x") && tictactoe[2][2].equals("x")) {
                System.out.println("Winner is player one");
                running = false;
            } else if (tictactoe[0][0].equals("y") && tictactoe[1][1].equals("y") && tictactoe[2][2].equals("y")) {
                System.out.println("Winner is player two");
                running = false;
            } else if (tictactoe[0][2].equals("x") && tictactoe[1][1].equals("x") && tictactoe[2][0].equals("x")) {
                System.out.println("Winner is player one");
                running = false;
            } else if (tictactoe[0][2].equals("y") && tictactoe[1][1].equals("y") && tictactoe[2][0].equals("y")) {
                System.out.println("Winner is player two");
                running = false;
            } else if (tictactoe[0][0].equals("x") && tictactoe[1][0].equals("x") && tictactoe[2][0].equals("x")) {
                System.out.println("Winner is player one");
                running = false;
            } else if (tictactoe[0][0].equals("y") && tictactoe[1][0].equals("y") && tictactoe[2][0].equals("y")) {
                System.out.println("Winner is player two");
                running = false;
            } else if (tictactoe[0][1].equals("x") && tictactoe[1][1].equals("x") && tictactoe[2][1].equals("x")) {
                System.out.println("Winner is player one");
                running = false;
            } else if (tictactoe[0][1].equals("y") && tictactoe[1][1].equals("y") && tictactoe[2][1].equals("y")) {
                System.out.println("Winner is player two");
                running = false;
            } else if (tictactoe[0][2].equals("x") && tictactoe[1][2].equals("x") && tictactoe[2][2].equals("x")) {
                System.out.println("Winner is player one");
                running = false;
            } else if (tictactoe[0][2].equals("y") && tictactoe[1][2].equals("y") && tictactoe[2][2].equals("y")) {
                System.out.println("Winner is player two");
                running = false;
            }

        }

        System.out.println("Game is over!");

        entrada.close();



    }
}

