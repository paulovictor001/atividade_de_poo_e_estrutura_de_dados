import java.util.Map;
import java.util.HashMap;
import java.time.LocalDate;

public class Cliente {
    String nome;
    Map<Integer, Map<String, String>> empretimos = new HashMap<>();
    Map<String, String> livro = new HashMap<>();
    LocalDate dataEmpretimo;
    LocalDate dataDevolucao;
    int id = 0;

    public Cliente(String nome){
        this.nome = nome;
    }

    public void emprestar(String titulo, String codigoLivro){
        this.livro.put("Titulo", titulo);
        this.livro.put("Código", codigoLivro);

        this.empretimos.put(id++, new HashMap<>(this.livro));
        this.livro.clear();
    }

    public Map<Integer, Map<String, String>> vizualizarEmpretimos(){
        return this.empretimos;
    }
}
