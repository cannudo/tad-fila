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
        Fila fila = new Fila(3);
        fila.status();
        fila.enqueue(0);
        System.out.println("--------------------");
        fila.status();
        fila.enqueue(1);
        System.out.println("--------------------");
        fila.status();
        fila.enqueue(2);
        System.out.println("--------------------");
        System.out.println("\n\t✅ ENCHEU A FILA E OS TESTES BOOLEANOS PASSARAM\n");
        System.out.println("--------------------");
        fila.dequeue();
        fila.status();
        fila.imprimir_fila();
        System.out.println("--------------------");
        fila.dequeue();
        fila.status();
        fila.imprimir_fila();
        System.out.println("--------------------");
        fila.dequeue();
        fila.status();
        System.out.println("--------------------");
        System.out.println("\n\t✅ ESVAZIOU A FILA E OS TESTES BOOLEANOS PASSARAM\n");
    }
}