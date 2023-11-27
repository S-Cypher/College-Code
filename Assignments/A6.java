import java.util.Scanner;
import java.io.*;
public class A6 {
    public static void main(String[] args) throws FileNotFoundException {
        int valueTotal = 0;
        int numTotal = 0;
        int largest =0; 
        int smallest = 0;
        
        try {
            System.out.print("Enter the name of the input file: ");
            Scanner input = new Scanner(System.in);
            String numbers = input.next();

            System.out.print("Enter the name of the output file: ");
            String empty = input.next();
            //VS Code weirdly requires the full pathname for the files even though they ARE in the same folder as this assignment.
            //I don't know if that is just the editor or if it's something I can change


            File bigNum = new File(numbers); //lots of numbers
            File sendNum = new File(empty); //they will be sent here!
        
            Scanner enter = new Scanner(bigNum); //read. Is that why it's called Scanner? Because it "scans" the file or the terminal?
            PrintWriter send = new PrintWriter(sendNum); //write

            while (enter.hasNextInt()) {
                int current = (enter.nextInt());
                valueTotal += current;
                numTotal++;

                if (current > largest) {
                    largest = current;
                    smallest = largest;
                }

                if (current < smallest) {
                    smallest = current;
                }

            } //while loop ends

            send.println("The sum is " + valueTotal);
            send.println("Total numbers: " + numTotal);
            send.println("Average: " + valueTotal/numTotal);
            send.println("Largest number: " + largest);
            send.println("Smallest number: " + smallest);
        
        send.close();
        enter.close();
        input.close(); //I know this is not required, but the warning is just annoying to see

        }

        catch (FileNotFoundException which) { 
            System.out.println("The named file cannot be found.");
            System.out.println("If the file exists, please make sure it is spelled correctly!");
        }
        
    }
}

//"C:/Users/stewa/CompSci/Assignments/sampleFile.txt"
//"C:/Users/stewa/CompSci/Assignments/output.txt"