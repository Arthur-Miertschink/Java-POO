public class Corretor {

    private String nome;
    private String matricula;
    private float metaMensal;
    private float totalVendas;
    private Endereco endereco;

    public Corretor(String nome, String matricula, float metaMensal, float totalVendas, Endereco endereco) {
        this.nome = nome;
        this.matricula = matricula;
        this.metaMensal = metaMensal;
        this.totalVendas = totalVendas;
        this.endereco = endereco;
    }

    public Corretor(){

    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public float getMetaMensal() {
        return metaMensal;
    }

    public void setMetaMensal(float metaMensal) {
        this.metaMensal = metaMensal;
    }

    public float getTotalVendas() {
        return totalVendas;
    }

    public void setTotalVendas(float totalVendas) {
        this.totalVendas = totalVendas;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

}
