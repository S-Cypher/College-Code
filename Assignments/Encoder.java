public class Encoder {
    //No main method
    private int shift;
    //instance variable

    public Encoder(int shift) {
        this.shift = shift;
        //I'm guessing the parameter has to be the shift amount?
        //I'm understanding constructors a little bit now.
    }

    public String caesarEncoding(String secret) { //USE THIS TO ALSO DECODE THE MESSAGE
        char encode[] = new char [secret.length()];

        for(int i = 0; i <secret.length(); i++) {
            int daisy = secret.charAt(i); //find the character's ascii value
            if ((daisy >= 65) && (daisy <= 90)) { //range of the uppercase letters
                int change = (daisy+shift);
                if (change > 90) { //if the ascii value goes past 'Z'
                    int wrap = (change-26);
                    char letter = (char)wrap;
                    encode[i] = letter;
                }
                else if (change < 65) { //if the ascii value is above 'A'
                    int wrap = (change+26);
                    char letter = (char)wrap;
                    encode[i] = letter;
                }

                else {
                    char letter = (char)change;
                    encode[i] = letter;
                }
            }

            else if ((daisy >=97) && (daisy <=122)) { //range of the lowercase letters
                int change = (daisy+shift);
                if (change > 122) { //if the ascii value goes past a 'z', this if statement makes it loop to an 'a'
                    int wrap = (change-26);
                    char letter = (char)wrap;
                    encode[i] = letter;
                }
                else if (change < 97) {
                    int wrap = (change+26);
                    char letter = (char)wrap;
                    encode[i] = letter;
                }

                else {
                    char letter = (char)change;
                    encode[i] = letter;

                }
            }
            else { //anything that is not a letter
                char letter = (char)daisy;
                encode[i] = letter;

            }


        }
        //once the array is full, turn it into a String object
        String hidden = new String(encode);
        //return the new String object
        return hidden;

    }
    
}
