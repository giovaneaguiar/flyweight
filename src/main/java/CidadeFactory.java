import java.util.HashMap;
import java.util.Map;

public class CidadeFactory {
    private static Map<String, Cidade> cidades = new HashMap<>();

    public static Cidade getCidade(String nome, String uf) {
        String chave = nome + uf;
        Cidade cidade = cidades.get(chave);
        if (cidade == null) {
            cidade = new Cidade(nome, uf);
            cidades.put(chave, cidade);
        }
        return cidade;
    }

    public static int getTotalCidades() {
        return cidades.size();
    }
}
