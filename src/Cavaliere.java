public class Cavaliere {
    private String nome;
    private Thread drago;

    public Cavaliere(String nome){
        this.nome=nome;
    }
    public void LanciaDardi(Thread d){
        for(int i=0;i<=10;i++){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("sleep error: " + e);
            }
        }
        System.out.println("il cacciatore"+nome+"sta lanciando il dardo");
        d.interrupt();

    }
}