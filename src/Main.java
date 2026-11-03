import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inTastiera = new Scanner(System.in);
        System.out.println("inserisci battito ali: ");
        int battiti = inTastiera.nextInt();


        Thread drago1 = new Thread(
                new Drago("Argo", battiti));
        drago1.start();

        for (int i = 0; i <= 5; i++) {
            try {
                Thread.sleep(5020);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("main continua a fare cose... i=" + i);
        }
    }
}