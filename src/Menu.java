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

                    System.out.println(construtora.getNome());
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
                    System.out.println("O total vendido pela empresa é: " + construtora.getTotalVendido());
                }


            }

            opcaoMenu = PegarOpcaoUsuario();

        }


    }

    private static String PegarOpcaoUsuario(){
        System.out.println("Bem vindo ao Constructor Prog!!!");
        System.out.println("O que deseja fazer hoje:");
        System.out.println("1 - Cadastrar Construtora");
        System.out.println("2 - Cadastrar Corretor");
        System.out.println("3 - Atualizar total vendido da Construtora");
        System.out.println("4 - Visualizar total vendido pela empresa");
        System.out.println("X - Sair do programa");

        String opcaoMenu = InOut.leString("Insira a opção desejada abaixo:");

        return opcaoMenu;


    }



}
