public class Jantar {

    public static void main(String[] args) {
        Object faca = new Object();
        Object garfo = new Object();
        Object prato = new Object();

        Thread alice = new Thread(new Amigo("Alice", faca, garfo, prato));
        //Thread bob = new Thread(new Amigo("Bob", faca, garfo, prato)); // Não causa Deadlock
        //Thread bob = new Thread(new Amigo("Bob", garfo, faca, prato)); // Causa Deadlock

        bob.start();
        alice.start();
  }
}