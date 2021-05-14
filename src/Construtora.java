import java.util.ArrayList;
import java.util.List;

public class Construtora {

    private String nome;
    private String cnpj;
    private float totalVendido;
    private Endereco endereco;

    List<Corretor> Corretores = new ArrayList<Corretor>();

    public Construtora(String nome, String cnpj, float totalVendido, Endereco endereco) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.totalVendido = totalVendido;
        this.endereco = endereco;
    }

    public Construtora(){

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public float getTotalVendido() {
        return totalVendido;
    }

    public void setTotalVendido(float totalVendido) {
        this.totalVendido = totalVendido;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public void inserirCorretor(Corretor corretor){
        Corretores.add(corretor);
    }

    public Corretor retornaPorid(int id){
        return Corretores.get(id);
    };




}
