public class Construtora {
    private String cnpj;
    private float totalVendido;
    private Endereco endereco;

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
        return "Codigo: " + endereco.getCodigo() + "\nCEP: " + endereco.getCep() + "\nRua: " + endereco.getRua() + "\nBairro: " + endereco.getBairro();
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
