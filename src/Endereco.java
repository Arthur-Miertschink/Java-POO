public class Endereco {

    private String nomeRua;
    private String bairro;
    private String nomeCidade;
    private String siglaEstado;
    private String cep;



    public Endereco(String nomeRua, String bairro, String nomeCidade, String siglaEstado, String cep) {
        this.nomeRua = nomeRua;
        this.bairro = bairro;
        this.nomeCidade = nomeCidade;
        this.siglaEstado = siglaEstado;
        this.cep = cep;
    }

    public Endereco(){

    }

    public String getNomeRua() {
        return nomeRua;
    }

    public void setNomeRua(String nomeRua) {
        this.nomeRua = nomeRua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getNomeCidade() {
        return nomeCidade;
    }

    public void setNomeCidade(String nomeCidade) {
        this.nomeCidade = nomeCidade;
    }

    public String getSiglaEstado() {
        return siglaEstado;
    }

    public void setSiglaEstado(String siglaEstado) {
        this.siglaEstado = siglaEstado;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }


}
