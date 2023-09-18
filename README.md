# tad-fila

## O que é uma fila?

A fila é uma estrutura de dados tão fundamental quanto a pilha. Nela, os dados ficam enfileirados — um atrás do outro.

O primeiro dado inserido deve ser também o primeiro a ser retirado. Os dados devem ser inseridos no final da fila e retirados no início.

## Casos de teste

fila = []

> []


fila.emqueue(5)

> [5]


fila.enqueue(3)

> [5, 3]


fila.dequeue()

> [3] com retorno 5


fila.enqueue(7)

> [3, 7]


fila.dequeue()

> [7] com retorno 3


fila.front()

> retorno 7


fila.dequeue()

> [] com retorno 7


fila.dequeue()

> FilaVaziaException


fila.isEmpty()

> retorno true


fila.enqueue(9)

> [9]


enqueue(7)

> [9, 7]


fila.size()

> retorno 2


fila.enqueue(3)

> [9, 7, 3]


fila.enqueue(5)

> [9, 7, 3, 5]


fila.dequeue()

> [7, 3, 5] com retorno 9


## Execução local

Para executar o projeto localmente, precisaremos __compilar__ os códigos-fonte e __rodar__ os arquivos gerados pela compilação.
Os comandos abaixo foram executados em uma máquina que utiliza Debian GNU/Linux.

```terminal
# Compilação
@cannudo ➜ /workspaces/tad-fila (main) $ javac *.java
```

> O comando `javac` executa a compilação dos arquivos com extensão `.java` e gera os arquivos compilados com extensão `.class`. Para executar os arquivos `.class`, precisaremos utilizar o comando `java`.

```terminal
# Execução
@cannudo ➜ /workspaces/tad-fila (main) $ java Main
```