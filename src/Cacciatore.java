public class Cacciatore {
    private String nome;

    public Cacciatore(String nome) {
        this.nome = nome;
    }

    public void colpisciDrago(Thread drago) {
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(">>> Il cacciatore " + nome + " attacca e colpisce il drago!");
        drago.interrupt();
    }
}