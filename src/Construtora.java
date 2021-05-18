import java.util.ArrayList;
import java.util.List;

public class Construtora {

    private String nome;
    private String cnpj;
    private float totalVendido;
    private Endereco endereco;

    List<Corretor> Corretores = new ArrayList<>();

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

    public void criarConstrutora(){
        String nomeDaRua = InOut.leString("Digite o nome da rua: ");
        String nomeDoBairro = InOut.leString("Digite o nome do bairro: ");
        String nomeDaCidade = InOut.leString("Digite o nome da cidade: ");
        String siglaDoEstado = InOut.leString("Digite a sigla do estado: ");
        String numeroDoCep = InOut.leString("Digite o CEP: ");


        Endereco enderecoCadastro = new Endereco(nomeDaRua, nomeDoBairro, nomeDaCidade, siglaDoEstado, numeroDoCep);


        String nomeDaConstrutora = InOut.leString("Digite o nome da construtora: ");
        String cnpj = InOut.leString("Digite o CNPJ da construtora: ");
        while (!ValidaCPNJ.isCNPJ(cnpj)) {
            cnpj = InOut.leString("Cnpj informado é inválido, digite novamente: ");
        }
        float totalVendido = 0;


        setNome(nomeDaConstrutora);
        setCnpj(cnpj);
        setTotalVendido(totalVendido);
        setEndereco(enderecoCadastro);
    }


    public void adicionarCorretor(){
        if (getCnpj() != null){

            String nomeDaRua = InOut.leString("Digite o nome da rua: ");
            String nomeDoBairro = InOut.leString("Digite o nome do bairro: ");
            String nomeDaCidade = InOut.leString("Digite o nome da cidade: ");
            String siglaDoEstado = InOut.leString("Digite a sigla do estado: ");
            String numeroDoCep = InOut.leString("Digite o CEP: ");


            Endereco enderecoCadastro = new Endereco(nomeDaRua, nomeDoBairro, nomeDaCidade, siglaDoEstado, numeroDoCep);

            String nome = InOut.leString("Digite o nome do Corretor: ");
            String matricula = InOut.leString("Digite a matrícula do corretor: ");
            float metaMensal = InOut.leFloat("Digite a meta mensal do corretor: ");
            float totalDeVendas = InOut.leFloat("Digite o total de vendas do corretor: ");

            Corretor criarCorretor = new Corretor(nome, matricula, metaMensal,totalDeVendas, enderecoCadastro);

            inserirCorretor(criarCorretor);
            calcularTotalVendido();
        }
        else {
            InOut.MsgDeErro("Não há contrutora cadastrada!", "Não há nenhuma construtora criada. Crie uma construtora antes de adicionar os corretores.");
        }


    }


    public void calcularTotalVendido(){
        float totalVendidoCorretores = 0;

        for (Corretor corretor : Corretores){
            totalVendidoCorretores += corretor.getTotalVendas();

        }

        setTotalVendido(totalVendidoCorretores);

    }

    public void atualizarVendasCorretor(){
        if (Corretores.size() != 0){
            int idDoCorretor = InOut.leInt("Informe o id do corretor:");
            float novoValor = InOut.leFloat("Informe o valor novo:");

            for (Corretor corretor : Corretores){
                if (idDoCorretor == Corretores.indexOf(corretor)){
                    corretor.setTotalVendas(novoValor);
                }
            }

            calcularTotalVendido();

        }
        else {
            InOut.MsgDeAviso("Opa! Não consigo fazer isso", "Não há nenhum corretor cadastrado.");
        }
    }


    public void exibirCorretores(){
        if (Corretores.size() != 0) {
            for (Corretor corretor : Corretores) {
                InOut.MsgDeInformacao(
                        "Lista de corretores", "Id: " + Corretores.indexOf(corretor)
                                + " Nome: " + corretor.getNome()
                                + " Matrícula: " + corretor.getMatricula()
                );
            }
        } else {
            InOut.MsgDeAviso("Opa! Não consigo fazer isso", "Não há nenhum corretor cadastrado para ser exibido.");
        }
    }

    public void exibirTotalVendido(){
        InOut.MsgDeInformacao("Total vendido pela empresa", "O total vendido pela empresa é: " + getTotalVendido());
    }




}
