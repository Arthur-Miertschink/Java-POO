public class Corretor {
    private String nome;
    private int matricula;
    private float metaMensal;
    private float vendaMensal;
    private Endereco endereco;

    public Corretor(String nome, int matricula, float metaMensal, float vendaMensal, Endereco endereco) {
        this.nome = nome;
        this.matricula = matricula;
        this.metaMensal = metaMensal;
        this.vendaMensal = vendaMensal;
        this.endereco = endereco;
    }

    public Corretor() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public float getMetaMensal() {
        return metaMensal;
    }

    public void setMetaMensal(float metaMensal) {
        this.metaMensal = metaMensal;
    }

    public float getVendaMensal() {
        return vendaMensal;
    }

    public void setVendaMensal(float vendaMensal) {
        this.vendaMensal = vendaMensal;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
