package media_notas;

public class Main {
    public static void main(String[] args) {
        double[] notas = new double[4];
        int quantidadeNotas = notas.length;
        double media = 0;
        notas[0] = 10;
        notas[1] = 10;
        notas[2] = 10;
        notas[3] = 10;

        for (double nota : notas) {
            media += nota;
        }

        media /= quantidadeNotas;
        
        System.out.printf("A média ds notas foi de %.2f", media);
    }
}
