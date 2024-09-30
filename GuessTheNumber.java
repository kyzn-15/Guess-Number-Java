import java.util.*;

public class GuessTheNumber {

    private static void start() {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int num = random.nextInt(100) + 1; 
        int guess = 0;
        int attempts = 0;

        while (guess != num) {
            System.out.print("Masukan angka dri 1-100: ");
            guess = input.nextInt();
            attempts++;

            if (guess < num) {
                System.out.println("terlalu rendah!");
            } else if (guess > num) {
                System.out.println("terlalu tinggi!");
            } else {
                System.out.println("Selamat! Kamu  menebak angka dalam " + attempts + " percobaan.");
            }
        }

        yesno();
        input.close();
    }

    private static void yesno() {
        Scanner input = new Scanner(System.in);
        System.out.print("Apakah kamu ingin bermain lagi? (y/n): ");
        String ans = input.nextLine();

        if (ans.equals("y")) {
            start();  
        } else if (ans.equals("n")) {
            System.out.println("Terima kasih telah bermain!");
        } else {
            System.out.println("Input tidak valid.");
            yesno();
        }

        input.close();
    }

    public static void main(String[] args) {
        start();
    }
}
