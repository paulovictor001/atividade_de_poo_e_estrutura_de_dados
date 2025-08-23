package maior_nota;
import java.util.Scanner;


public class Main {
    private double maiorNota = 0;
    private Scanner input = new Scanner(System.in);
    private double[] notasDosAlunos = new double [10];

    public void inserirNotas(){
        for (int index = 0; index < this.notasDosAlunos.length; index++){
            System.out.printf("Ensira a %dª nota\n", index + 1);
            
            this.notasDosAlunos[index] = Double.parseDouble(this.input.nextLine());
        }
    }
    
    public void vizualizarNotas(){
        for (double nota : this.notasDosAlunos) {
            System.out.printf("nota: %.2f\n", nota);
        }
    }
    
    public void verificaMaiorNota(){
        for (double nota : this.notasDosAlunos) {
            if (nota > this.maiorNota){
                this.maiorNota = nota;
            }
        }
    }
    
    public void vizualizarMaiorNota(){
        System.out.printf("maior nota: %.2f\n", this.maiorNota);
    }

    public static void main(String[] args){
        Main app = new Main();
        app.inserirNotas();
        app.vizualizarNotas();
        app.verificaMaiorNota();
        app.vizualizarMaiorNota();
    }
}

