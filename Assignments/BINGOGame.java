import java.util.Scanner;
public class BINGOGame {

    public static void main(String[] args) {
        BINGOCard Card = new BINGOCard(); //don't like how this line looks...
        int[][] x = Card.newCard(); //creates a new card
        int[][] y = Card.currentCard(x); //maintains the same card until the game runs again
        
        while (Card.winner(y) != true) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the called number: ");
            int mark = input.nextInt();
            Card.check(y,mark); //checks the called number with all numbers on the board
            Card.currentCard(x); //reprints the updated card to the screen


    }
    if (Card.winner(y) == true) {
        System.out.println("You are a winner!");
        }
    }

}

