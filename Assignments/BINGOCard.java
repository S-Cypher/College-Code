public class BINGOCard {

    public BINGOCard() {  //the constructor. (yay)
    }
                    
        //Run the BINGOGame class to print the card
        public int[][] newCard() {
            System.out.println("Welcome to BINGO!");
            System.out.println("Here is your card:");
            int[][] card = new int[5][5];
            for (int row = 0; row < card.length; row++) {
                int min = 1; //starting with the range for all numbers in the B column
                int max = 15;
                for (int col = 0; col< card[row].length; col++) {
                    card[col][row] = (int)(min + Math.random()* (max-min) + (1));
                    card[2][2]=0;
                    min += 15;
                    max += 15;
                    
                }
            }
            int min = 1;
            int max = 15;
            for (int i =0; i<5; i++) { //checking for repeated numbers
                for (int j =0; j<5; j++) {
                    int check = card[i][j];
                    for(int k=j+1; k<5; k++) {
                        int current = card[i][k];
                        if (check == current) {
                            while(check == card[i][k]) {
                                card[i][k] = (int)(min + Math.random()* (max-min)+(1));
                            }
                        }
                    }
                }
                min += 15;
                max += 15;
            }

            return card;
      }
       

    public int[][] currentCard(int[][] card) { //maintains the same generated card until the game starts again
        System.out.println("B\tI\tN\tG\tO");
        for(int row=0; row <5; row++) {
            for(int col =0; col <5; col++) {
                System.out.print(card[col][row] + "\t");
            }
            System.out.println();
        }
        return card;
    }


        public void check(int[][] card, int num){ //checks if the called number is somewhere in the array
            for(int i = 0; i < 5; i++){
                for(int j = 0; j < 5; j++){
                    if(num == card[i][j]){
                        card[i][j] = 0; //zero is the marker
                    }
                }
            }      
        }

        public boolean winner(int bingo[][]) { //single method for all win conditions

            for(int row = 0; row <5; row++) { //checking each row
                int row_count = 0;
                for(int col = 0; col<5; col++) {
                    if (bingo[col][row] == 0) {
                        row_count++;
                    }
                if (row_count ==5) {
                    return true;
                }
            }
        }

            for (int row = 0; row <5; row++) { //checking each column
                int col_count=0;
                for (int col =0; col <5; col++) {
                    if (bingo[row][col] == 0) {
                        col_count++;
                    }
                if (col_count == 5) {
                    return true;
                }
            }
        }

            for (int row = 0; row <5;) { //checking diagonally from top left to bottom right
                int dia_count =0;
                for(int col = 0; col <5; col++) {
                    if (bingo[row][col] == 0) {
                        dia_count++;
                    }
                if (dia_count ==5) {
                    return true;
                }
                ++row;
                }
            }

            for (int row = 4; row >=0;) { //checking diagonally from bottom left to top right
                int dia_count =0;
                for(int col = 0; col <5; col++) {
                    int debug = bingo[col][row];
                    if (debug == 0) {
                        dia_count++;
                    }
                if (dia_count ==5) {
                    return true;
                }
                --row;

                }
            }
            return false;
        }

    }