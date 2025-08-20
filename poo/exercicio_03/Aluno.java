package exercicio_03;

public class Aluno {
    String nome;
    String matricula;
    double notaAv1;
    double notaAv2;

    public Aluno(String nome, String matricula, double notaAv1, double notaAv2){
        this.nome = nome;
        this.matricula = matricula;
        this.notaAv1 = notaAv1;
        this.notaAv2 = notaAv2;
    }

    public void mostrarDados(){
        System.out.printf(
            "Matrícula: %s%nNome: %s%nNota da primeira avaliação: %.2f%nNota da segunda avaliação: %.2f%n",
            this.matricula, this.nome, this.notaAv1, this.notaAv2
        );
    }

    public double calcularMedia(){
        return (this.notaAv1 + this.notaAv2) / 2;
    }

    public void verificarAprovacao(){
        double media = this.calcularMedia();

        if (media >= 7){
            System.out.printf("Você está aprovado! Média: %.2f%n", media);
        }
        else if (media >= 4){
            System.out.printf("Você está de recuperação. Média: %.2f%n", media);
        }
        else{
            System.out.printf("Você está reprovado. Média: %.2f%n", media);
        }
    }
}