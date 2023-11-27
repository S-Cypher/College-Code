public class Decoder {
    private int shift;
    //I think this (the keyword) makes the value entered for shift reachable for the caesarDecoding method?
    
    public Decoder(int shift) {
        //variable for the offset
        this.shift = shift;
        /* This is a little easier than putting both the message and shift as parameters
        in the decoding method

         */
    }

    public String caesarDecoding(String secret) {  //the caesarEncoding method is set up the exact same way
        char decode[] = new char [secret.length()];

        for(int i = 0; i <secret.length(); i++) {
            int daisy = secret.charAt(i);  //find the ascii value at index i (I couldn't think of a variable name)
            if ((daisy >=65) && (daisy <=90)) { //checks if the value is uppercase
                int change = (daisy-shift); //adds or subtracts the ascii value and holds it in this variable
                if (change >90) { //forces the value to loop back to the beginning of the uppercase letters
                    int wrap = (change-26);
                    char letter = (char)wrap; //converts the ascii value into a character
                    decode[i] = letter; //adds the new character to the decode array in the same spot in the message
                }

                else if (change < 65) { //same thing as above but forces the value to loop back to the end of the uppercase letters
                    int wrap = (change+26);
                    char letter = (char)wrap;
                    decode[i] = letter;
                }

                else { //letters in the middle end up here
                    char letter = (char)change;
                    decode[i] = letter;
                }
            }

            else if ((daisy >= 97) && (daisy <=122)) { //checks for lowercase letters
                int change = (daisy-shift);
                if (change >122) {
                    int wrap = (change+26);
                    char letter = (char)wrap;
                    decode[i] = letter;
                }

                else if (change < 97) {
                    int wrap = (change+26);
                    char letter = (char)wrap;
                    decode[i] = letter;
                }

                else {
                    char letter = (char)change;
                    decode[i] = letter;
                }
            }
            else { //for anything that is not a letter (spaces, symbols, numbers)
                char letter = (char)daisy;
                decode[i] = letter;
            }
        }
        //once the array is full, turn it into a String object
        String reveal = new String(decode);
        //return the new String object
        return reveal;

    }
    
}