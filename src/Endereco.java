import java.util.ArrayList;
import java.util.List;

public class Endereco {
    private int codigo;
    private String cep;
    private String rua;
    private String bairro;
    private int numero;
    private boolean excluido;

    private static List<Endereco> Enderecos = new ArrayList();

    public Endereco(String cep, String rua, String bairro, int numero) {
        this.cep = cep;
        this.rua = rua;
        this.bairro = bairro;
        this.numero = numero;
        this.excluido = false;
    }

    public Endereco() {

    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void InserirEndereco(int id, Endereco endereco){
        Enderecos.add(id, endereco);
    }

    public Endereco Buscar(int id){
        return Enderecos.get(id);
    }

    public void Deletar(int id){
        Enderecos.remove(id);
    }

    public static int ContagemEnderecos(){return Enderecos.size();}
}
