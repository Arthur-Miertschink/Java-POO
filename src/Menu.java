public class Menu {

    public static void main(String[] args) {

        String opcaoMenu = PegarOpcaoUsuario();

        Construtora construtora = new Construtora();

        while (!opcaoMenu.equalsIgnoreCase("X")){

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

                case "3" -> construtora.calcularTotalVendido();

                case "4" -> construtora.exibirTotalVendido();

                case "5" -> construtora.exibirCorretores();

                case "6" -> construtora.atualizarVendasCorretor();

            }

            opcaoMenu = PegarOpcaoUsuario();

        }


    }

    private static String PegarOpcaoUsuario(){

        return InOut.leString(
                """
                        Bem vindo ao Constructor Prog!!!

                        O que deseja fazer hoje:
                        1 - Cadastrar construtora
                        2 - Cadastrar corretor
                        3 - Atualizar total vendido da construtora
                        4 - Visualizar total vendido pela construtora
                        5 - Exibir todos os corretores
                        6 - Atualizar venda mensal do corretor
                        X - Sair do programa

                        """
        );


    }




}
