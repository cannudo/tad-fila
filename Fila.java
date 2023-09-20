public class Fila {
    private int capacidade, index_queue, index_dequeue;
    private Object[] fila;

    public Fila(int capacidade) {
        this.capacidade = capacidade;
        this.fila = new Object[capacidade];
        this.index_queue = index_dequeue = 0;
    }

    public boolean isEmpty() {
        return this.index_queue == this.index_dequeue;
    }
    public void enqueue(Object dado) {
        this.fila[this.index_queue] = dado;
        this.index_queue = (this.index_queue + 1) % this.capacidade;
    }

    public Object dequeue() {
        Object retorno = this.fila[this.index_dequeue];
        this.fila[this.index_dequeue] = null;
        this.index_dequeue = (this.index_dequeue + 1) % this.capacidade;
        return retorno;
    }

    public void imprimir_fila() {
        System.out.println("Fila: ");
        for (int i = 0; i < this.capacidade; i++) {
            System.out.print("[ " + this.fila[i] + " ]");

            if(i < this.capacidade - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public void status() {
        System.out.println("Capacidade: " + this.capacidade);
        System.out.println("Index Queue: " + this.index_queue);
        System.out.println("Index Dequeue: " + this.index_dequeue);
        System.out.println("Vazia?: " + this.isEmpty());
    }
}