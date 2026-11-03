import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci il numero di battiti d'ali del drago: ");
        int battiti = scanner.nextInt();
        scanner.close();

        Drago dragoObj = new Drago("Smaug", battiti);
        Thread threadDrago = new Thread(dragoObj);
        threadDrago.start();

        Cacciatore cacciatore = new Cacciatore("Geralt");
        cacciatore.colpisciDrago(threadDrago);

        for (int i = 1; i <= battiti; i++) {
            System.out.println("Main: sto osservando il drago... (ciclo " + i + " di " + battiti + ")");
            try {
                Thread.sleep(800);
            } catch (InterruptedException e) {
                System.out.println("Main interrotto.");
            }
        }

        System.out.println("Main completato.");
    }
}