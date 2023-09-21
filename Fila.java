public class Fila implements FilaInterface {
    private int capacidade, index_queue, index_dequeue;
    private Object[] fila;

    public Fila(int capacidade) {
        this.capacidade = capacidade;
        this.fila = new Object[capacidade];
        this.index_queue = index_dequeue = 0;
    }

    public void duplicar_capacidade(Object dado) {
        if(this.isEmpty()) {
            int tamanho_antigo = this.capacidade;
            Object[] array_auxiliar = new Object[tamanho_antigo * 2];
            int inicio = this.index_dequeue;
            for(int i = 0; i < this.size(); i++) {
                array_auxiliar[i] = this.fila[inicio];
                inicio = (inicio + 1) % tamanho_antigo;
            }
            this.capacidade = this.capacidade * 2;
            this.index_dequeue = 0;
            this.index_queue = this.size();
            this.fila = array_auxiliar;
        }
        this.fila[this.index_queue] = dado;
        this.index_queue = (this.index_queue + 1) % this.capacidade;
    }

    public int size() {
        int retorno = 0;
        if(this.index_queue >= this.index_dequeue) {
            retorno = this.index_queue - this.index_dequeue;
        } else {
            retorno = this.capacidade - this.index_dequeue + this.index_queue;
        }
        return retorno;
    }

    public Object front() {
        Object retorno = this.fila[this.index_dequeue];
        return retorno;
    }

    public boolean isEmpty() {
        return this.index_queue == this.index_dequeue;
    }

    public boolean isFull() {
        return this.index_queue == (this.index_dequeue + 1) % this.capacidade;
    }

    public void enqueue(Object dado) {
        if(!isFull()) {
            this.fila[this.index_queue] = dado;
            this.index_queue = (this.index_queue + 1) % this.capacidade;
        } else {
            this.duplicar_capacidade(dado);
        }
    }

    public Object dequeue() {
        if(!this.isEmpty()) {
            Object retorno = this.fila[this.index_dequeue];
            this.fila[this.index_dequeue] = null;
            this.index_dequeue = (this.index_dequeue + 1) % this.capacidade;
            return retorno;
        } else {
            throw new FilaVaziaException("dequeue(): fila vazia");
        }
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
        System.out.println("Front: " + this.front());
        System.out.println("Size: " + this.size());
        System.out.println("Vazia?: " + this.isEmpty());
    }
}