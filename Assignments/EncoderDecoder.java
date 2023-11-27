import java.util.Scanner;

public class EncoderDecoder {
    public static void main(String[] args) {
        System.out.println("Do you want to encode or decode a message?");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 1 for encode and enter 2 to decode: ");
        int choice = input.nextInt();

        if (choice == 1) {
            Scanner start = new Scanner(System.in);
            System.out.println("Enter the message you want encoded: ");
            String message = start.nextLine();
            System.out.println("Enter the shift to encode with: ");
            int shift = start.nextInt();

            Encoder encode = new Encoder(shift);
            String hide = encode.caesarEncoding(message);
            System.out.print(hide);
            start.close();

        }

        else if (choice == 2) {
            Scanner u = new Scanner(System.in);
            System.out.println("Enter the message you want decoded: ");
            String message = u.nextLine();
            System.out.println("Enter the shift to decode with: ");
            int shift = u.nextInt();

            Decoder decode = new Decoder(shift);
            String reveal = decode.caesarDecoding(message);
            System.out.print(reveal);
            u.close();


        }
        input.close();
    }
}
