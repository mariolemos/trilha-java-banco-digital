import java.util.ArrayList;
import java.util.List;

public class Banco {

    private String nome;
    private List<Cliente> clientes = new ArrayList<Cliente>();

    public Banco(String nome, List<Cliente> clientes) {
        this.nome = nome;
        this.clientes = clientes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    @Override
    public String toString() {
        return "Banco{" +
                "nome='" + nome + '\'' +
                ", clientes=" + clientes +
                '}';
    }
}
