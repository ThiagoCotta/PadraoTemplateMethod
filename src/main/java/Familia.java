import java.util.ArrayList;
import java.util.List;

public class Familia {
    public List<Pessoa> pessoas;

    public Familia() {
        pessoas = new ArrayList<>();
    }

    public void adicionarPessoa(Pessoa pessoa) {
        pessoas.add(pessoa);
    }

    public List<Pessoa> getPessoas() {
        return pessoas;
    }
}
