import java.util.Scanner;

class Main {
    public static Scanner instanciar_scanner() {
        Scanner retorno = new Scanner(System.in);
        return retorno;
    }

    public static void desinstanciar_scanner(Scanner scanner) {
        scanner.close();
    }

    public static void limpar_buffer_do_scanner(Scanner scanner) {
        scanner.nextLine();
    }

    public static int ler_inteiro(Scanner scanner) {
        int retorno = 0;
        retorno = scanner.nextInt();
        limpar_buffer_do_scanner(scanner);
        return retorno;
    }

    public static void main(String[] args) {
        Fila fila = new Fila(4);
        fila.imprimir_fila();
        System.out.println();
        fila.enqueue(5);
        fila.imprimir_fila();
        System.out.println();
        fila.enqueue(3);
        fila.imprimir_fila();
        System.out.println();
        fila.dequeue();
        fila.imprimir_fila();
        System.out.println();
        fila.enqueue(7);
        fila.imprimir_fila();
        System.out.println();
        fila.dequeue();
        fila.imprimir_fila();
        System.out.println();
        fila.dequeue();
        fila.imprimir_fila();
        System.out.println();
        System.out.println("Vazia? " + fila.isEmpty());
        fila.imprimir_fila();
        System.out.println();
        fila.enqueue(9);
        fila.imprimir_fila();
        System.out.println();
        fila.enqueue(7);
        fila.imprimir_fila();
        System.out.println();
        System.out.println(fila.size());
        fila.enqueue(3);
        fila.imprimir_fila();
        System.out.println();
        fila.dequeue();
        fila.imprimir_fila();
        System.out.println();
    }
}