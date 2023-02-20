import java.util.Scanner;

class Guesser {
    int gusessNum;

    int guessingNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Guesser! Kindly guess the number: ");
        gusessNum = sc.nextInt();
        return gusessNum;
    }
}

class Player {
    int guessNum;

    int guessingNum() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Player! kindly guess the number: ");
        guessNum = sc.nextInt();
        return guessNum;
    }
}

class Umpire {
    int numFromGuesser;
    int numFromPlayer1;
    int numFromPlayer2;
    int numFromPlayer3;

    void collectNumGuesser() {
        Guesser g = new Guesser();
        numFromGuesser = g.guessingNumber();
    }

    void collectNumPlayer() {
        Player p1 = new Player();
        Player p2 = new Player();
        Player p3 = new Player();
        numFromPlayer1 = p1.guessingNum();
        numFromPlayer2 = p2.guessingNum();
        numFromPlayer3 = p3.guessingNum();
    }

    void compare() {
        if (numFromGuesser == numFromPlayer1) {
            if (numFromGuesser == numFromPlayer2 && numFromGuesser == numFromPlayer3) {
                System.out.println("All player to winner");
            } else if (numFromGuesser == numFromPlayer2) {
                System.out.println("Player 1 and Player 2 are winner now");
            } else if (numFromGuesser == numFromPlayer3) {
                System.out.println("Player 1 and Player 3 are winner now");
            } else {
                System.out.println("Player 1 won the game");
            }
        } else if (numFromGuesser == numFromPlayer2) {
            if (numFromGuesser == numFromPlayer3) {
                System.out.println("Player 3 are won");
            } else {
                System.out.println("Player 2 won the game");
            }
        } else if (numFromGuesser == numFromPlayer3) {
            System.out.println("Player 3 won the game");
        } else {
            System.out.println("game is tie and the repeat game now!!");
        }
    }
}

class gameproject01 {
    public static void main(String[] args) {
        System.out.println("Game started");
        Umpire u = new Umpire();
        u.collectNumGuesser();
        u.collectNumPlayer();
        u.compare();
    }
}