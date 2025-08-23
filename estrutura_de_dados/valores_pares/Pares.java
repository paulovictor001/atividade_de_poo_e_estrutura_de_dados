package valores_pares;

public class Pares {
    private int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    public void verificaNumerosPares(){
        for (int numero : numeros) {
            if (numero % 2 == 0){
                System.out.printf("Os números pares são: %d\n", numero);
            }
        }
    }
    
}