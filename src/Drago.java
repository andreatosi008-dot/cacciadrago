public class Drago implements Runnable {
    private int battiti;
    private String nome;

    public Drago(String nome, int battiti) {
        this.nome = nome;
        this.battiti = battiti;
    }

    @Override
    public void run() {
        for (int i = 1; i <= battiti; i++) {
            if (Thread.currentThread().isInterrupted()) {
                System.out.println(nome + " è stato colpito a morte ed è caduto!");
                break;
            }

            System.out.println(nome + " sta volando... battito n. " + i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(nome + " è stato colpito dal cacciatore e sta morendo!");
                Thread.currentThread().interrupt();
                break;
            }
        }
        System.out.println(nome + " ha terminato il suo volo.");
    }
}