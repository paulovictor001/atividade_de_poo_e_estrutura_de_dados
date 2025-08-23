package idade_maior_que_18;

public class Main {
    public static void main(String[] args) {
        int[] idades = {10, 12, 18, 92, 26, 9, 23, 61, 42, 37};
        int maiorIdade = 18;
    
        for (int idade : idades){
            if (idade > maiorIdade){
                System.out.println(idade);
            }
        }        
    }
}