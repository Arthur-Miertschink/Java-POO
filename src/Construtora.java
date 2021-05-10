import java.util.ArrayList;
import java.util.List;

public class Construtora {
    private String cnpj;
    private float totalVendido;
    private Endereco endereco;

    private List<Corretor> Corretores = new ArrayList();

    public Construtora(String cnpj, Endereco endereco, float totalVendido) {
        this.cnpj = cnpj;
        this.totalVendido = totalVendido;
        this.endereco = endereco;
    }

    public Construtora() {

    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String toEndereco() {
        return "Codigo: " + endereco.getCodigo() + "\nCEP: " + endereco.getCep() + "\nRua: " + endereco.getRua() + "\nBairro: " + endereco.getBairro() + "\nNúmero: " + endereco.getNumero();
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public void  InserirCorretor(int id, Corretor corretor){
        Corretores.add(id, corretor);
    }

    public Corretor Buscar(int id){
        return Corretores.get(id);
    }

    public void  Deletar(int id){
        Corretores.remove(id);
    }

}
