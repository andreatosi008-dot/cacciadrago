 public class Drago implements Runnable {

        private int battiti;
        private String name;

        public Drago(String name, int battiti) {
            this.name = name; // Semplificato
            this.battiti = battiti;
        }

        @Override
        public void run() {
            for (int i = 0; i < battiti; i++) {
                System.out.println(this.name + " sto volando " + (i + 1));

                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    //throw new RuntimeException(e);
                    System.out.println( name+ " - " + e);
                }
            }
        }
    }
