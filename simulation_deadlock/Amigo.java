public class Amigo implements Runnable {
    Object faca;
    Object garfo;
    Object prato;
    String nome;

    public Amigo(String nome, Object faca, Object garfo, Object prato) {
        this.faca = faca;
        this.garfo = garfo;
        this.prato = prato;
        this.nome = nome;
    }

    @Override
    public void run() {
        synchronized (faca) {
            System.out.println(nome + " Adquiriu a faca");
            synchronized (garfo) {
                System.out.println(nome + " Adquiriu o garfo");
                synchronized (prato) {
                    System.out.println(nome + " Adquiriu o prato");
                    System.out.println(nome + " Liberou o prato");
                }
                System.out.println(nome + " Liberou o garfo");
            }
            System.out.println(nome + " Liberou a faca");
        }
        System.out.println("Fim da " + nome);
    }

}