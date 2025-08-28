public class Vetor {
    private String[] elementos;
    private int tamanho;

    public Vetor(int capacidade) {
        elementos = new String[capacidade];
        tamanho = 0;
    }

    public void adicionar(String elemento) {
        aumentarCapacidade();
        elementos[tamanho] = elemento;
        tamanho++;
    }

    public void adicionar(int posicao, String elemento) {
        if (posicao < 0 || posicao > tamanho) {
            throw new IllegalArgumentException("Posição inválida");
        }
        aumentarCapacidade();
        for (int i = tamanho - 1; i >= posicao; i--) {
            elementos[i + 1] = elementos[i];
        }
        elementos[posicao] = elemento;
        tamanho++;
    }

    public String obter(int posicao) {
        if (posicao < 0 || posicao >= tamanho) {
            throw new IllegalArgumentException("Posição inválida");
        }
        return elementos[posicao];
    }

    public void alterar(int posicao, String elemento) {
        if (posicao < 0 || posicao >= tamanho) {
            throw new IllegalArgumentException("Posição inválida");
        }
        elementos[posicao] = elemento;
    }

    private void aumentarCapacidade() {
        if (tamanho == elementos.length) {
            String[] novosElementos = new String[elementos.length * 2];
            for (int i = 0; i < elementos.length; i++) {
                novosElementos[i] = elementos[i];
            }
            elementos = novosElementos;
        }
    }

    public void remover(int posicao) {
        if (posicao < 0 || posicao >= tamanho) {
            throw new IllegalArgumentException("Posição inválida");
        }
        for (int i = posicao; i < tamanho - 1; i++) {
            elementos[i] = elementos[i + 1];
        }
        elementos[tamanho - 1] = null;
        tamanho--;
    }

    public boolean remover(String elemento) {
        int pos = -1;
        for (int i = 0; i < tamanho; i++) {
            if (elementos[i].equals(elemento)) {
                pos = i;
                break;
            }
        }
        if (pos != -1) {
            remover(pos);
            return true;
        }
        return false;
    }

    public boolean contem(String elemento) {
        for (int i = 0; i < tamanho; i++) {
            if (elementos[i].equals(elemento)) {
                return true;
            }
        }
        return false;
    }

    public int tamanho() {
        return tamanho;
    }

    public boolean estaVazio() {
        return tamanho == 0;
    }

    public void limpar() {
        elementos = new String[elementos.length];
        tamanho = 0;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < tamanho; i++) {
            sb.append(elementos[i]);
            if (i < tamanho - 1) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }
}
