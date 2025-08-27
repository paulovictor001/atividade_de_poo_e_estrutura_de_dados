package exercicio_03;

public class main {
    public static void main(String[] args){

        Aluno aluno1 = new Aluno("paulo victor", "1234557", 7.5, 6.5);
        Aluno aluno2 = new Aluno("ana", "7554321", 6.0, 3.0); 

        aluno1.notaAv1 = 6.00;
       
        aluno1.mostrarDados();
        aluno2.mostrarDados();

        aluno1.verificarAprovacao();
        aluno2.verificarAprovacao();
    }
    

}
