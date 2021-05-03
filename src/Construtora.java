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

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
