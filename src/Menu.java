import java.awt.image.renderable.RenderableImageOp;

public class Menu {

    public static void main(String[] args) {

        String opcaoMenu = PegarOpcaoUsuario();

        Construtora construtora = new Construtora();

        while (!opcaoMenu.toUpperCase().equals("X")){

            switch (opcaoMenu){

                case "1" -> {

                    String nomeDaRua = InOut.leString("Digite o nome da rua: ");
                    String nomeDoBairro = InOut.leString("Digite o nome do bairro: ");
                    String nomeDaCidade = InOut.leString("Digite o nome da cidade: ");
                    String siglaDoEstado = InOut.leString("Digite a sigla do estado: ");
                    String numeroDoCep = InOut.leString("Digite o CEP");


                    Endereco enderecoCadastro = new Endereco(nomeDaRua, nomeDoBairro, nomeDaCidade, siglaDoEstado, numeroDoCep);


                    String nomeDaConstrutora = InOut.leString("Digite o nome da construtora: ");
                    String cnpj = InOut.leString("Digite o CNPJ da construtora: ");
                    while (!ValidaCPNJ.isCNPJ(cnpj)) {
                        cnpj = InOut.leString("Cnpj informado é inválido, digite novamente: ");
                    }
                    float totalVendido = InOut.leFloat("Digite o total vendido da corretora: ");


                    construtora.setNome(nomeDaConstrutora);
                    construtora.setCnpj(cnpj);
                    construtora.setTotalVendido(totalVendido);
                    construtora.setEndereco(enderecoCadastro);

                }

                case "2" -> {
                    String nomeDaRua = InOut.leString("Digite o nome da rua: ");
                    String nomeDoBairro = InOut.leString("Digite o nome do bairro: ");
                    String nomeDaCidade = InOut.leString("Digite o nome da cidade: ");
                    String siglaDoEstado = InOut.leString("Digite a sigla do estado: ");
                    String numeroDoCep = InOut.leString("Digite o CEP");


                    Endereco enderecoCadastro = new Endereco(nomeDaRua, nomeDoBairro, nomeDaCidade, siglaDoEstado, numeroDoCep);

                    String nome = InOut.leString("Digite o nome do Corretor: ");
                    String matricula = InOut.leString("Digite a matrícula do corretor: ");
                    float metaMensal = InOut.leFloat("Digite a meta mensal do corretor: ");
                    float totalDeVendas = InOut.leFloat("Digite o total de vendas do corretor: ");

                    Corretor criarCorretor = new Corretor(nome, matricula, metaMensal,totalDeVendas, enderecoCadastro);

                    construtora.inserirCorretor(criarCorretor);
                }

                case "3" -> {
                    float totalVendidoCorretores = 0;

                    for (Corretor corretor : construtora.Corretores){
                        totalVendidoCorretores += corretor.getTotalVendas();

                    }

                    construtora.setTotalVendido(totalVendidoCorretores);

                }

                case "4" -> {
                    InOut.MsgDeInformacao("Total vendido pela empresa", "O total vendido pela empresa é: " + construtora.getTotalVendido());
                }

                case "5" -> {
                    if (construtora.Corretores.size() != 0) {
                        for (Corretor corretor : construtora.Corretores) {
                            InOut.MsgDeInformacao(
                                    "Lista de corretores", "Id: " + construtora.Corretores.indexOf(corretor)
                                    + " Nome: " + corretor.getNome()
                                    + " Matrícula: " + corretor.getMatricula()
                            );
                        }
                    } else {
                        InOut.MsgDeAviso("Opa! Não consigo fazer isso", "Não há nenhum corretor cadastrado para ser exibido.");
                    }
                }

                case "6" -> {

                    if (construtora.Corretores.size() != 0){
                        int idDoCorretor = InOut.leInt("Informe o id do corretor:");
                        float novoValor = InOut.leFloat("Informe o valor novo:");

                        for (Corretor corretor : construtora.Corretores){
                            if (idDoCorretor == construtora.Corretores.indexOf(corretor)){
                                corretor.setTotalVendas(novoValor);
                            }
                        }

                    }
                    else {
                        InOut.MsgDeAviso("Opa! Não consigo fazer isso", "Não há nenhum corretor cadastrado.");
                    }

                }



            }

            opcaoMenu = PegarOpcaoUsuario();

        }


    }

    private static String PegarOpcaoUsuario(){

        String opcaoMenu = InOut.leString(
                "Bem vindo ao Constructor Prog!!!" + "\n" + "\n"
                + "O que deseja fazer hoje:" + "\n"
                + "1 - Cadastrar construtora" + "\n"
                + "2 - Cadastrar corretor" + "\n"
                + "3 - Atualizar total vendido da construtora" + "\n"
                + "4 - Visualizar total vendido pela construtora" + "\n"
                + "5 - Exibir todos os corretores" + "\n"
                + "6 - Atualizar venda mensal do corretor" + "\n"
                + "X - Sair do programa" + "\n" + "\n"
        );

        return opcaoMenu;


    }



}
