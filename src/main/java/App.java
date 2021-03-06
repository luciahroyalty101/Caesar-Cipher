import models.Decrypt;
import models.Encrypt;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        boolean runCaesar = true;
        while (runCaesar) {


            System.out.println("Welcome to my Caesar Cipher");
            System.out.println("============================");
            System.out.println("Enter encrypt to encrypt or decrypt to decrypt or exit to leave the app");
            String choice = myScanner.nextLine();

            if (choice.equals("encrypt")) {
                System.out.println("models.Encrypt your message by entering it in the next line");
                String input = myScanner.nextLine();
                System.out.println("============================");

                System.out.println("Enter a key");
                int key = myScanner.nextInt();
                System.out.println("============================");
                Encrypt caesar = new Encrypt(input, key);
                String encrypted = Encrypt.encrypt(caesar);
                System.out.println("Encrypted message: " + encrypted);
                System.out.println("============================");
                System.out.println("============================");
                System.out.println("============================");

            } else if (choice.equals("decrypt")) {
                System.out.println("To decrypt a message enter it below");
                String sema = myScanner.nextLine();
                System.out.println("============================");

                System.out.println("Enter the key you used");
                int namba = myScanner.nextInt();
                System.out.println("============================");
                Decrypt caesar = new Decrypt(sema, namba);
                String decrypted = Decrypt.decrypt(caesar);

                System.out.println("Decrypted message: " + decrypted);
                System.out.println("============================");
                System.out.println("============================");
                

            } else if (choice.equals("exit")) {
                runCaesar = false;
            }
        }
    }
}