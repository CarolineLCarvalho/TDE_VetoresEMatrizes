public class Matriz {
    private int[][] elementos;
    private int linhas;
    private int colunas;

    public Matriz(int linhas, int colunas) {
        this.linhas = linhas;
        this.colunas = colunas;
        elementos = new int[linhas][colunas];
    }

    public void inserir(int linha, int coluna, int valor) {
        if (linha < 0 || linha >= linhas || coluna < 0 || coluna >= colunas) {
            throw new IllegalArgumentException("Posição inválida");
        }
        elementos[linha][coluna] = valor;
    }

    public int maiorElemento() {
        int maior = elementos[0][0];
        for (int[] linha : elementos) {
            for (int val : linha) {
                if (val > maior) maior = val;
            }
        }
        return maior;
    }

    public int menorElemento() {
        int menor = elementos[0][0];
        for (int[] linha : elementos) {
            for (int val : linha) {
                if (val < menor) menor = val;
            }
        }
        return menor;
    }

    public double media() {
        int soma = 0;
        int total = linhas * colunas;
        for (int[] linha : elementos) {
            for (int val : linha) {
                soma += val;
            }
        }
        return (double) soma / total;
    }

    public int somaTotal() {
        int soma = 0;
        for (int[] linha : elementos) {
            for (int val : linha) {
                soma += val;
            }
        }
        return soma;
    }

    public int contarOcorrencias(int valor) {
        int count = 0;
        for (int[] linha : elementos) {
            for (int val : linha) {
                if (val == valor) count++;
            }
        }
        return count;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int[] linha : elementos) {
            for (int val : linha) {
                sb.append(val).append(" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
