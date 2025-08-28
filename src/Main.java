public class Main {
    public static void main(String[] args) {
        // testando o Vetor
        System.out.println("==== TESTE VETOR ====");
        Vetor vetor = new Vetor(3);

        vetor.adicionar("A");
        vetor.adicionar("B");
        vetor.adicionar("C");
        System.out.println("Após adicionar A, B, C: " + vetor);

        vetor.adicionar("D"); // força aumento de capacidade
        System.out.println("Após adicionar D (aumentando capacidade): " + vetor);

        vetor.adicionar(2, "X");
        System.out.println("Após adicionar X na posição 2: " + vetor);

        System.out.println("Elemento na posição 3: " + vetor.obter(3));

        vetor.alterar(1, "Y");
        System.out.println("Após alterar posição 1 para Y: " + vetor);

        vetor.remover(0);
        System.out.println("Após remover elemento na posição 0: " + vetor);

        vetor.remover("X");
        System.out.println("Após remover elemento 'X': " + vetor);

        System.out.println("Contém 'B'? " + vetor.contem("B"));
        System.out.println("Tamanho atual: " + vetor.tamanho());
        System.out.println("Está vazio? " + vetor.estaVazio());

        vetor.limpar();
        System.out.println("Após limpar: " + vetor + " | Está vazio? " + vetor.estaVazio());


        // testando a Matriz
        System.out.println("\n==== TESTE MATRIZ ====");
        Matriz matriz = new Matriz(3, 3);

        int valor = 1;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz.inserir(i, j, valor++);
            }
        }
        System.out.println("Matriz preenchida:");
        System.out.println(matriz);

        System.out.println("Maior elemento: " + matriz.maiorElemento());
        System.out.println("Menor elemento: " + matriz.menorElemento());
        System.out.println("Soma total: " + matriz.somaTotal());
        System.out.println("Média dos elementos: " + matriz.media());
        System.out.println("Ocorrências do número 5: " + matriz.contarOcorrencias(5));
    }
}
